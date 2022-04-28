package com.example.albamon_clone.customer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.albamon_clone.customer.CustomAdapter;
import com.example.albamon_clone.customer.CustomAdapter1;
import com.example.albamon_clone.dto.AlbaDTO;
import com.example.albamon_clone.R;

import java.util.ArrayList;


public class CustomFrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<AlbaDTO> list = new ArrayList<>();
        for(int i= 0; i<2; i++){
            list.add(new AlbaDTO(R.drawable.cuckoo,"(주)원어나더","[쿠쿠고객센터]영업X 120만원 정착지원금","09:00~18:00 1년 이상","서울 강서구 마곡동","220만원"));
            list.add(new AlbaDTO(R.drawable.sinhan,"신한 LG전자/통신사 제휴카드 발급","발급희망고객카드발급/제휴카드발급","09:00~18:00 1년 이상","서울 영등포구 전체","250만원"));
            list.add(new AlbaDTO(R.drawable.woori,"월250만원/6개월차까지 정착지원금지급","[타사대비 높은급여/교육비별도] 우리카드","09:00~18:00 1년 이상","서울 마포구 합정동","250만원"));
        }

       ViewGroup view= (ViewGroup) inflater.inflate(R.layout.fragment_custom, container, false);
        //M지역Grand - home tab
        RecyclerView rec_grand = view.findViewById(R.id.rec_grand);
        RecyclerView.LayoutManager manager = new GridLayoutManager(getContext(),2);
        CustomAdapter adapter = new CustomAdapter(inflater,list);
        rec_grand.setLayoutManager(manager);
        rec_grand.setAdapter(adapter);

        //M지역 Focus - home tab
        RecyclerView rec_focus = view.findViewById(R.id.rec_focus) ;
        RecyclerView.LayoutManager manager1 = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        rec_focus.setLayoutManager(manager1);
        CustomAdapter1 adapter2 = new CustomAdapter1(inflater,list);
        rec_focus.setAdapter(adapter2);
       return view;
    }
}