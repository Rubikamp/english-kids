package com.app.languagegame;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.example.englishkids.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private NavigationView navigationView;
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavController navController;
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navController = Navigation.findNavController(this, R.id.nav_fragment);
        setupBottomNav();
        setupDrawerNav();


    }
    private void setupDrawerNav(){
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        drawerLayout = findViewById(R.id.drawer_layout);
        drawerToggle = setupDrawerToggle();
        drawerToggle.setDrawerIndicatorEnabled(true);
        drawerToggle.syncState();
        drawerLayout.addDrawerListener(drawerToggle);
        navigationView = findViewById(R.id.nav_view);
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout);
        NavigationUI.setupWithNavController(navigationView, navController);
        navigationView.setNavigationItemSelectedListener(this);



    }
    private ActionBarDrawerToggle setupDrawerToggle(){
        return new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
    }

    private void setupBottomNav() {
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        NavigationUI.setupWithNavController(bottomNavigationView, navController);
//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.nav_flags, R.id.nav_colors, R.id.nav_animals, R.id.nav_fruits).build();
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//                navController.addOnDestinationChangedListener((navController1, navDestination, bundle) -> {
//            int id = navDestination.getId();
//
//            switch (id) {
//                case R.id.nav_flags:
//                    Toast.makeText(MainActivity.this, "Flags", Toast.LENGTH_LONG).show();
//                    break;
//                case R.id.nav_colors:
//                    Toast.makeText(MainActivity.this, "Colors", Toast.LENGTH_LONG).show();
//                    break;
//                case R.id.nav_animals:
//                    Toast.makeText(MainActivity.this, "Animals", Toast.LENGTH_LONG).show();
//                    break;
//                case R.id.nav_fruits:
//                    Toast.makeText(MainActivity.this, "Fruits", Toast.LENGTH_LONG).show();
//                    break;
//            }
//        });
    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        item.setChecked(true);
        drawerLayout.closeDrawers();
        switch (item.getItemId()) {

            case R.id.nav_flags:
                navController.navigate(R.id.nav_flags);
                break;

            case R.id.nav_colors:
                navController.navigate(R.id.nav_colors);
                break;

            case R.id.nav_animals:
                navController.navigate(R.id.nav_animals);
                break;
            case R.id.nav_fruits:
                navController.navigate(R.id.nav_fruits);

        }
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (drawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstances){
        super.onPostCreate(savedInstances);
        drawerToggle.syncState();
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }


}