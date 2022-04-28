package com.example.albamon_clone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.albamon_clone.match.ActMatchFrag;
import com.example.albamon_clone.match.ProMatchFrag;
import com.google.android.material.tabs.TabLayout;

public class RecommendFrag extends Fragment {
    TabLayout tabLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_recommend, container, false);
        tabLayout=viewGroup.findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("활동내역매칭"));
        tabLayout.addTab(tabLayout.newTab().setText("프로필매칭"));

        ((MainActivity) getActivity()).changeFragment(new ActMatchFrag(),2);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
              
                if(tab.getPosition() == 0){   //활동내역매칭 탭 클릭
                    ((MainActivity) getActivity()).changeFragment(new ActMatchFrag(),2);
                }else{                         //프로필매칭 탭 클릭
                    ((MainActivity) getActivity()).changeFragment(new ProMatchFrag(),2);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return viewGroup;
    }
}