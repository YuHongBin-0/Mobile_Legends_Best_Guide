package com.example.mobilelegendsbestguide;


import com.example.mobilelegendsbestguide.adapters.RecyclerViewAdapter;
import com.example.mobilelegendsbestguide.model.HeroListing;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;

public class HeroFragment extends Fragment {

    List<Hero> lstHero ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hero, container, false);
        setHasOptionsMenu(true);


        lstHero = new ArrayList<>();
        lstHero.add(new Hero("Kimmy","Categorie Book","Description book",R.drawable.kimmy, R.drawable.kimmy));
        lstHero.add(new Hero("Change","Categorie Book","Description book",R.drawable.change, R.drawable.change));
        lstHero.add(new Hero("Lylia","Categorie Book","Description book",R.drawable.lylia, R.drawable.lylia));
        lstHero.add(new Hero("Silvanna","Categorie Book","Description book",R.drawable.silvanna, R.drawable.silvanna));
        lstHero.add(new Hero("Nana","Categorie Book","Description book",R.drawable.nana, R.drawable.nana));
        lstHero.add(new Hero("Gusion","Categorie Book","Description book",R.drawable.gusion, R.drawable.gusion));
        lstHero.add(new Hero("Kimmy","Categorie Book","Description book",R.drawable.kimmy, R.drawable.kimmy));
        lstHero.add(new Hero("Change","Categorie Book","Description book",R.drawable.change, R.drawable.change));
        lstHero.add(new Hero("Lylia","Categorie Book","Description book",R.drawable.lylia, R.drawable.lylia));
        lstHero.add(new Hero("Silvanna","Categorie Book","Description book",R.drawable.silvanna, R.drawable.silvanna));
        lstHero.add(new Hero("Nana","Categorie Book","Description book",R.drawable.nana, R.drawable.nana));
        lstHero.add(new Hero("Gusion","Categorie Book","Description book",R.drawable.gusion, R.drawable.gusion));


        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getContext(),lstHero);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),4));
        myrv.setAdapter(myAdapter);



        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.search_menu, menu);

        super.onCreateOptionsMenu(menu, inflater);
    }

}
