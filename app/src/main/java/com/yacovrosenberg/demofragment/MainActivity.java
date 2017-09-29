package com.yacovrosenberg.demofragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MenuDetailFragment frag = (MenuDetailFragment)
                getFragmentManager().findFragmentById(R.id.detail_frag);
        frag.setMenuID(1);
    }
}
