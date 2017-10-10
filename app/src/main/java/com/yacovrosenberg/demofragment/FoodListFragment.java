package com.yacovrosenberg.demofragment;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodListFragment extends ListFragment {

    static interface FoodListListener{
        void itemClicked(long id);
    }

    private FoodListListener listener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listener = (FoodListListener) activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }
        super.onListItemClick(l, v, position, id);
    }

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
