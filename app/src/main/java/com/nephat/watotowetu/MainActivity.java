package com.nephat.watotowetu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.nephat.watotowetu.authentication.LoginActivity;
import com.nephat.watotowetu.fragments.HelpFragment;
import com.nephat.watotowetu.fragments.HomeworksFragment;
import com.nephat.watotowetu.fragments.MyProfileFragment;
import com.nephat.watotowetu.fragments.PupilsFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "MainActivity";

    //Widgets
    private Toolbar mToolbar;
    private DrawerLayout mDrawer;
    private NavigationView mNavView;

    private PupilsFragment pupilsFragment = new PupilsFragment();
    private HelpFragment helpFragment = new HelpFragment();
    private MyProfileFragment myProfileFragment = new MyProfileFragment();
    private HomeworksFragment homeworksFragment = new HomeworksFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(mToolbar);

        mDrawer = findViewById(R.id.drawer_layout);
        mNavView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                mDrawer,
                mToolbar,
                R.string.openNavDrawer,
                R.string.closeNavDrawer
        );

        mDrawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        mNavView.setNavigationItemSelectedListener(this);

        setFragment(pupilsFragment);
    }



    /**
     * Called when an item in the navigation menu is selected.
     *
     * @param item The selected item
     * @return true to display the item as the selected item
     */
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        mDrawer.closeDrawer(GravityCompat.START);

        switch (item.getItemId()){
            case R.id.nav_pupils:
                replaceFragment(pupilsFragment);
                break;
            case R.id.nav_assignments:
                replaceFragment(homeworksFragment);
                break;
            case R.id.nav_profile:
                replaceFragment(myProfileFragment);
                break;
            case R.id.nav_help:
                replaceFragment(helpFragment);
                break;
            case R.id.nav_logout:
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
        }

        return true;
    }


    @Override
    public void onBackPressed() {

        if (mDrawer.isDrawerOpen(GravityCompat.START)){
            mDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    private void setFragment(Fragment fragment){
        //Get current fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        //Get fragment Transaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //Set new fragment in drawer layout
        fragmentTransaction.add(R.id.fragment_container, fragment);
        fragmentTransaction.commit();

    }
    private void replaceFragment(Fragment fragment){
        //Get current fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        //Get fragment Transaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //Set new fragment in drawer layout
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}
