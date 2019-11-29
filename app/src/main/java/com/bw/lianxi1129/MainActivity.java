package com.bw.lianxi1129;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Fragment> fragments=new ArrayList<>();
    private ViewPager vp;
    private TabLayout tab;
    List<String> strings=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp = findViewById(R.id.vp);
        tab = findViewById(R.id.tab);
        HomeFragment homeFragment=new HomeFragment();
        LieFragment lieFragment=new LieFragment();
        MeFragment meFragment=new MeFragment();
        fragments.add(homeFragment);
        fragments.add(lieFragment);
        fragments.add(meFragment);
        strings.add("首页");
        strings.add("列表");
        strings.add("我的");
        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return strings.get(position);
            }
        });
        tab.setupWithViewPager(vp);
    }
}
