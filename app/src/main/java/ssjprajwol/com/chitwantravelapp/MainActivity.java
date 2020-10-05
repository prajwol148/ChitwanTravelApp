package ssjprajwol.com.chitwantravelapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;



public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {  /*implementing NavigationView.OnNavigationItemSelectedListener
                                                                                                                    because we are settting listener to navigation list item  (see 2.0)*/

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.draw_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        //setting listener in navigation view
        navigationView.setNavigationItemSelectedListener(this);  // (2.0) here, we are setting navigation listener in this activity.

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer,
                toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);  /*This class provides a handy way to tie together the functionality of
                                                                                                DrawerLayout and the framework ActionBar to implement the recommended
                                                                                                design for navigation drawers.*/

        drawer.addDrawerListener(toggle);
        toggle.syncState();  //This will rotate the hamburger icon when click on it

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace
                    (R.id.fragment_container, new MainScreen()).commit();
            navigationView.setCheckedItem(R.id.nav_Home);
        }
    }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_Hotels:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HotelFragment()).commit();
                break;

            case R.id.nav_Restaurants:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new RestaurantFragment()).commit();
                break;

            case R.id.nav_Recreation:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Recreation_fragment()).commit();
                break;
            case R.id.nav_Events:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Events_fragments()).commit();
                break;
            case R.id.nav_Shopping:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Shopping_fragment()).commit();
                break;
            case R.id.nav_Sports:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Sports_fragment()).commit();
                break;

            case R.id.nav_Home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new MainScreen()).commit();
                break;

            case R.id.nav_message:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_EMAIL, "prajwol.tiwari@gmail.com");

                startActivity(Intent.createChooser(intent, "Send Email"));
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true; //if return false, no item will be selected even if item is clicked in navigation view
    }
}