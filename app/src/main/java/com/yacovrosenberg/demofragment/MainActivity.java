package com.yacovrosenberg.demofragment;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements FoodListFragment.FoodListListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        MenuDetailFragment frag = (MenuDetailFragment)
//                getFragmentManager().findFragmentById(R.id.detail_frag);
//        frag.setMenuID(1);
    }

    @Override
    public void itemClicked(long id) {
        MenuDetailFragment details = new MenuDetailFragment();
        FragmentTransaction ft= getFragmentManager().beginTransaction();

        details.setMenuID(id);
        ft.replace(R.id.fragment_container,details);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();

    }
}
