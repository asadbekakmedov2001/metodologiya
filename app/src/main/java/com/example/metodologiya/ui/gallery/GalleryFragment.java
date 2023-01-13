package com.example.metodologiya.ui.gallery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.metodologiya.MainActivity4;
import com.example.metodologiya.R;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment implements UserAdapter.SelectedUser{

    Context mContext;
    RecyclerView mRecyclerView;
    View rootView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    UserAdapter userAdapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mContext = getActivity().getApplicationContext();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_gallery, container, false);


        mRecyclerView = rootView.findViewById(R.id.recyclerView2);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers, this);
        mRecyclerView.setAdapter(userAdapter);




        return rootView;
    }
    private void initial() {

        modelRcyclers.add(new ModelRcycler(R.drawable.avtobusdagi_odob,"Bolajonlarni Avtobusda kattalarga xurmat odobi                               ","Agar siz avtobusda yoki metroda bo'lsangiz va buvisi yoki sumkali ayol yaqinida turganda, uni o'z o'rningizga o'tirishga taklif qilishingiz kerak...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.muzey,"Bolalarni Muzey va badiiy adabiyotlar bilan tanishtirish                                ","Odob - bu sehrli qoidalar bu sizga odobli, xushmuomala va do'stona inson bo'lishingizga yordam beradi...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.dost,"Do'stiga yordam berish odobi                                ","Qoidalar do'stlik siz bilan do'st bo'lishdan va bo'sh vaqtlarini o'tkazishdan xursand bo'ladigan ko'plab do'stlar orttirishga yordam beradi...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.kattalarni,"Kattalarni xurmat qilish odobi                                ","Aziz bolajonlar! Siz, albatta, bobo-buvilaringizni, ota-onangizni, aka-opalaringizni, umuman, yoshi kattalarni hurmat qilish zarur ekanini bilasiz. Bu ishingiz tahsinga loyiq...",""));
        modelRcyclers.add(new ModelRcycler(R.drawable.salomlashish,"Salomlashish odobi                                                    ","Qoidalar salomlashish o'rganishda juda muhim qadamdir odob-axloq qoidalari. Axir, tanish odam bilan uchrashganda birinchi qiladigan ishimiz - u bilan salomlashishdir...",""));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {
        startActivity(new Intent(getContext(), MainActivity4.class).putExtra("data",modelRcyclers.indexOf(modelRcycler)));

    }
}