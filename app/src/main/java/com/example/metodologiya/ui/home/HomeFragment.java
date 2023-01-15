package com.example.metodologiya.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.metodologiya.MainActivity2;
import com.example.metodologiya.MainActivity3;
import com.example.metodologiya.R;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements UserAdapter.SelectedUser {




    RecyclerView mRecyclerView;
    View rootView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    UserAdapter userAdapter;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_home, container, false);


        // ruyhatni eloni va sozlanmasi
        mRecyclerView = rootView.findViewById(R.id.recyclerView1);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        mRecyclerView.setAdapter(userAdapter);


        return rootView;
    }

    private void initial() {
        modelRcyclers.add(new ModelRcycler(R.drawable.icon3,"MA'RUZALARI                                       ","ILMIY TADQIQOT METODOLOGIYASI FANIDAN MA'RUZA MASHG'ULOTLAR TOP'LAMI...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.icon2,"SEMINARLAR                                          ","ILMIY TADQIQOT METODOLOGIYASI FANIDAN SEMINAR MASHG'ULOTLAR TOP'LAMI...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.icon1,"TAQDIMOTLAR                                           ","ILMIY TADQIQOT METODOLOGIYASI FANIDAN TAQDIMOTLAR TOP'LAMI...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.icon4,"FAN DASTURI                                           ","ILMIY TADQIQOT METODOLOGIYASI FAN DASTURI...","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/fan_dasturi.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.icon5,"O'QUV REJA                                         ","ILMIY TADQIQOT METODOLOGIYASI FANINING O'QUV REJASI... ",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.icon6,"MUSTAQIL ISHLAR                                           ","ILMIY TADQIQOT METODOLOGIYASI FANIDAN MUSTAQIL ISHLAR TOP'LAMI...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.test,"TESTLAR                                         ","ILMIY TADQIQOT METODOLOGIYASI FANIDAN TESTLAR TOP'LAMI","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/testlar.doc"));
        modelRcyclers.add(new ModelRcycler(R.drawable.yakuniy_icon,"YAKUNIY SAVOLLAR                                         ","ILMIY TADQIQOT METODOLOGIYASI FANIDAN NAMUNAVIY YAKUNIY NAZORAT SAVOLLARI","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/yakuniy_savollari.docx"));
        modelRcyclers.add(new ModelRcycler(R.drawable.glossary,"IZOHLI LUG'AT (GLOSSARIY)                                         ","ILMIY TADQIQOT METODOLOGIYASI FANIDAN IZOHLI LUG'AT","https://github.com/asadbekakmedov2001/metodologiya/raw/main/app/src/main/assets/glossariy.docx"));



    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {

        if (    modelRcycler.getLessonName().toLowerCase().startsWith("fan") ||
                modelRcycler.getLessonName().toLowerCase().startsWith("testlar")||
                modelRcycler.getLessonName().toLowerCase().startsWith("yakuniy")||
                modelRcycler.getLessonName().toLowerCase().startsWith("izohli")
        ){
//
            startActivity(new Intent(getContext(), MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
        }
        else {

            startActivity(new Intent(getContext(), MainActivity2.class).putExtra("swimmers",modelRcyclers.indexOf(modelRcycler)));


        }

    }

//    @Override
//    public void onPause() {
//        super.onPause();
//        modelRcyclers.clear();
//    }

    @Override
    public void onStart() {
        super.onStart();
        modelRcyclers.clear();
        initial();
    }
}