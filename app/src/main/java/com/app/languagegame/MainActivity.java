package com.app.languagegame;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.englishkids.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_fragment);
        NavController navController = Navigation.findNavController(this, R.id.nav_fragment);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController navController, @NonNull NavDestination navDestination, @Nullable Bundle bundle) {
                int id = navDestination.getId();

                switch (id){
                    case R.id.nav_flags:
                        Toast.makeText(MainActivity.this,"Flags",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_colors:
                        Toast.makeText(MainActivity.this,"Colors",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_animals:
                        Toast.makeText(MainActivity.this,"Animals",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_fruits:
                        Toast.makeText(MainActivity.this,"Fruits",Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
    }
}