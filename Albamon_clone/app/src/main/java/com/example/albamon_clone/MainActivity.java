package com.example.albamon_clone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.albamon_clone.recent.RecentFrag;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {
    ActionBar actionBar;
    BottomNavigationView bnv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionBar = getSupportActionBar();
        actionBar.setCustomView(R.layout.logo);
        actionBar.setDisplayShowCustomEnabled(true);
        bnv = findViewById(R.id.bottom_menu);
        changeFragment(new HomeTabFrag(),1);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.bottom_sheet, null, false);
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(view);

        bnv .setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.home){  //홈 탭 클릭
                    actionBar.setDisplayShowCustomEnabled(true);
                    changeFragment(new HomeTabFrag(),1);
                }
                else if (item.getItemId() == R.id.recom) {//스마트 추천 탭 클릭
                    actionBar.setDisplayShowCustomEnabled(false);
                    actionBar.setTitle(Html.fromHtml("<font color='#000010'>스마트추천알바</font>"));
                    actionBar.setDisplayShowCustomEnabled(false);
                    changeFragment(new RecommendFrag(),1);
                }else if(item.getItemId() == R.id.recent){ //최근본알바 탭 클릭
                    actionBar.setDisplayShowCustomEnabled(false);
                    actionBar.setTitle(Html.fromHtml("<font color='#000010'>최근본알바</font>"));
                    changeFragment(new RecentFrag(),1);
                }else if(item.getItemId() == R.id.easytool){   //간편알바툴 탭 클릭
                    bottomSheetDialog.show();
                }else{
                    return false;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu_user){
            Intent intent = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    //프래그먼트 변경함수
    public void changeFragment(Fragment fragment,int num){
        if(num==1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
        }else if(num==2){
            getSupportFragmentManager().beginTransaction().replace(R.id.container2,fragment).commit();
        }else if(num==3){
            getSupportFragmentManager().beginTransaction().replace(R.id.container3,fragment).commit();
        }

    }
}