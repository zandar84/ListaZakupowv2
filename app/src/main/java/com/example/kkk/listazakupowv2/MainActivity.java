package com.example.kkk.listazakupowv2;

import android.app.Activity;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Add fragment here
        adapter.AddFragment(new FragmentListy(), "Listy");
        adapter.AddFragment(new FragmentArtykuly(), "Artykuły");
        adapter.AddFragment(new FragmentUstawienia(), "Ustawienia");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_assignment);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_shopping_cart);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_settings_applications);

        // Remove shadow from the Action Bar
        ActionBar actionBar = getSupportActionBar();
//        actionBar.setElevation(0);
        actionBar.hide(); // ukrycie paska tytulu
    }
}
