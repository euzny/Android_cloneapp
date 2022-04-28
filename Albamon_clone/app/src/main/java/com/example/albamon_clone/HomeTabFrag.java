package com.example.albamon_clone;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.albamon_clone.customer.CustomFrag;
import com.example.albamon_clone.home.LocalFrag;
import com.example.albamon_clone.home.MapFrag;
import com.example.albamon_clone.talent.TalentFrag;
import com.google.android.material.tabs.TabLayout;

public class HomeTabFrag extends Fragment {
    TabLayout tabLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_home_tab, container, false);
        tabLayout = viewGroup.findViewById(R.id.home_tab);
        tabLayout.addTab(tabLayout.newTab().setText("맞춤").setId(0));
        tabLayout.addTab(tabLayout.newTab().setText("지역").setId(1));
        tabLayout.addTab(tabLayout.newTab().setText("지도").setId(2));
        tabLayout.addTab(tabLayout.newTab().setText("인재").setId(3));
        tabLayout.addTab(tabLayout.newTab().setText("기업").setId(4));
        tabLayout.addTab(tabLayout.newTab().setText("긱몬").setId(5));

        ActionBar actionBar = ((MainActivity) getActivity()).getSupportActionBar();
        ((MainActivity) getActivity()).changeFragment(new CustomFrag(),3);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
               if(tab.getId()==0){
                   actionBar.setDisplayShowCustomEnabled(true);
                   ((MainActivity) getActivity()).changeFragment(new CustomFrag(),3);
               }else if(tab.getId()==1){
                   actionBar.setDisplayShowCustomEnabled(false);
                   actionBar.setTitle(Html.fromHtml("<font color='#000010'>지역별</font>"));
                   ((MainActivity) getActivity()).changeFragment(new LocalFrag(),1);
               }else if(tab.getId()==2){
                   actionBar.setDisplayShowCustomEnabled(false);
                   actionBar.setTitle(Html.fromHtml("<font color='#000010'>알바지도</font>"));
                   ((MainActivity) getActivity()).changeFragment(new MapFrag(),1);
               }else if(tab.getId()==3){
                   actionBar.setDisplayShowCustomEnabled(false);
                   actionBar.setTitle(Html.fromHtml("<font color='#000010'>인재정보홈</font>"));
                   ((MainActivity) getActivity()).changeFragment(new TalentFrag(),1);
               }else if(tab.getId()==4){
                   Intent intent = new Intent(getActivity(),EnterLoginActivity.class);
                   startActivity(intent);
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