package com.example.albamon_clone.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.albamon_clone.R;
import com.example.albamon_clone.dto.AlbaDTO;

import java.util.ArrayList;


public class LocalFrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       ViewGroup viewGroup  = (ViewGroup) inflater.inflate(R.layout.fragment_local, container, false);

       RecyclerView top_plus = viewGroup.findViewById(R.id.top_plus);
       RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);

        ArrayList<AlbaDTO> list  = new ArrayList<>();
        for(int i = 0; i<4; i++){
            list.add(new AlbaDTO(R.drawable.coupang,"쿠팡 플렉스","최대 12만원 보너스/바로시작/원하는 날/주급","장기근무","인천 중구 전체","2,000,000"));
            list.add(new AlbaDTO(R.drawable.store1,"짬뽕지존 김포점","짬뽕지존 김포점[주간 주방 직원]모집/숙식제공/초보가능","장기근무","경기 김포시 구래동","2,800,000"));
            list.add(new AlbaDTO(R.drawable.store2,"리치카페(부자가 되는 카페)","[리치카페]분위기 좋은 카페/직원 및 아르바이트 채용합니다.","장기근무","성남시 중원구 성남동","2,235,000"));
        }

        LocalAdapter adapter = new LocalAdapter(inflater,list);
        top_plus.setAdapter(adapter);
        top_plus.setLayoutManager(manager);

       return viewGroup;
    }
}