package com.yacovrosenberg.demofragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodListFragment extends ListFragment {


    public FoodListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        String names [] = new String[Menu.menus.length];
        for (int i =0; i < names.length; i++){
            names[i]  = Menu.menus[i].getName();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (inflater.getContext(),android.R.layout.simple_list_item_1, names);

        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

}
