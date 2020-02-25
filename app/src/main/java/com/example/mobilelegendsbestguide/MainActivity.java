package com.example.mobilelegendsbestguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);  // custom toolbar title
        getSupportActionBar().setCustomView(R.layout.abs_layout); // call customised layout with Centered txt
        textView = (TextView) findViewById(R.id.tvTitle); // call the txt id



        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        bottomNav.setSelectedItemId(R.id.nav_home);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


                    Fragment selectedFragment = null;

                    switch (menuItem.getItemId()) {

                        case R.id.nav_fav:
                            selectedFragment = new FavFragment();
                            textView.setText("Favorite");

                            break;

                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            textView.setText("Books");

                            break;

                        case R.id.nav_others:
                            selectedFragment = new OthersFragment();
                            textView.setText("Cart");

                            break;


                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };
}
