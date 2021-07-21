package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout1);
        viewPager = findViewById(R.id.view_pager1);


        tabLayout.setupWithViewPager(viewPager);

        setupViewPager(viewPager);

    }

    public void setupViewPager(ViewPager viewPager){
ViewPagerAdapter adapter =new ViewPagerAdapter(getSupportFragmentManager());
adapter.addFragments(new FirstFragment(), "TITLES");
adapter.addFragments(new SecondFragment(),"NUMBERS");
adapter.addFragments(new ThirdFragment(),"IMAGES");
viewPager.setAdapter(adapter);
    }


}