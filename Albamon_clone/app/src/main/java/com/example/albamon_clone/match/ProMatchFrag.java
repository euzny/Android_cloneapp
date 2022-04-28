package com.example.albamon_clone.match;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import  com.example.albamon_clone.R;
import com.example.albamon_clone.LoginActivity;
import com.example.albamon_clone.MainActivity;


public class ProMatchFrag extends Fragment {
    Button login_btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup viewGroup= (ViewGroup) inflater.inflate(R.layout.fragment_pro_match, container, false);
       login_btn = viewGroup.findViewById(R.id.login_btn);
       login_btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getActivity(), LoginActivity.class);
               startActivity(intent);
           }
       });
       return viewGroup;
    }
}