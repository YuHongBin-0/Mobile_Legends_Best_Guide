package com.example.mobilelegendsbestguide;

import android.content.Intent;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class HeroActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);  // custom toolbar title
        getSupportActionBar().setCustomView(R.layout.abs_layout); // call customised layout with Centered txt
        textView = (TextView) findViewById(R.id.tvTitle); // call the txt id

        BottomNavigationView bottomNav = findViewById(R.id.top_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        bottomNav.setSelectedItemId(R.id.nav_overview);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new OverviewFragment()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


                    OverviewFragment selectedFragment = null;

                    switch (menuItem.getItemId()) {

                        case R.id.nav_strategy:
                            selectedFragment = new StrategyFragment();
                            textView.setTextColor(Color.YELLOW);
                            textView.setText("Strategy");

                            break;

                        case R.id.nav_overview:
                            selectedFragment = new OverviewFragment();
                            textView.setTextColor(Color.YELLOW);
                            textView.setText("Overview");

                            break;

                        case R.id.nav_others:
                            selectedFragment = new CounterFragment();
                            textView.setTextColor(Color.YELLOW);
                            textView.setText("Counter");

                            break;


                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };

}
