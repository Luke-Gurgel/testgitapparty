package com.example.home.weddingapp.Others;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.home.weddingapp.Fragments.HistoryFragment;
import com.example.home.weddingapp.Fragments.PhotosFragment;
import com.example.home.weddingapp.Fragments.Tab1Fragment;

/**
 * Created by Home on 09/09/2016.
 */
public class SwipeAdapter extends FragmentStatePagerAdapter {
    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment;
        if(position == 0) {
            fragment = new Tab1Fragment();
        }
        else if(position == 1){
            fragment = new HistoryFragment();
        }
        else{
            fragment = new PhotosFragment();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
