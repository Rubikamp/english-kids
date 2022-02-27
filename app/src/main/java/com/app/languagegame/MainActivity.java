package com.app.languagegame;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;

import androidx.navigation.Navigation;

import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       BottomNavigationView bottomNavigationView= findViewById(R.id.bottom_navigation_view);
       NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_fragment);
       NavController navController = Navigation.findNavController(this, R.id.nav_fragment);
       NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }
}