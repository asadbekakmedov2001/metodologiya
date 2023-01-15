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

        modelRcyclers.add(new ModelRcycler(R.drawable.video,"Краткое введние в методологию научного исследования.","Эта лекция - предельно краткое введение в методологию научного исследования. ","bxKybqYkgXw"));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"Методология и методы научных исследований","","xWbwLXobnwE"));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"Классификация методов научных исследований","План лекции: 1. Классификация методов научных исследований. 2. Общенаучные методы. 3. Теоретические методы. 4. Эмпирические методы. 5. Специальные методы исследования в экономике.","-B7deaVnwPQ"));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"Методология науки ","1. Предмет методологии научного познания. 2. Методы анализа структуры и функций научных теорий. 3. Методологические и эвристические принципы построения теорий. 4. Методы анализа и развития научного знания ","bXq7rrJe7hs"));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"Методология, методы, методики: в чём разница?","Отрывок 3 части лекции: Зачем нужны здоровьесберегающие технологии","mGTQ5S9gsog"));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"ИМКД 1: Что такое Методология? | Вячеслав Вознесенский                              ","","lgQxZh3t1Dg"));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"Методология научных исследований. Лекция 1-1. Введение.","Методы научных исследований. Лекция 1-1. Введение.","aIGnW5coKLw"));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"Методология научных исследований. Лекция 2. Методология и методы","Методология научных исследований. Лекция 2. Методология и методы.","RKuskAhvlwY"));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"Методы научных исследования. Методология научных исследований","Лекция по методам научных исследований","_7NjzIz2j7A"));
        modelRcyclers.add(new ModelRcycler(R.drawable.video,"Методы научных исследований. Методология в науке. Научное познание (для ветеринаров)","Методология науки. Научное исследование. Методоло́гия нау́ки.","-eV1fcOPtNo"));

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