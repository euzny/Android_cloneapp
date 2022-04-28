package com.example.albamon_clone.recent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import  com.example.albamon_clone.R;
import com.example.albamon_clone.dto.AlbaDTO;

import java.util.ArrayList;


public class RecentFrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_recent, container, false);
        TextView count = view.findViewById(R.id.count);
        ArrayList<AlbaDTO> list = new ArrayList<>();
        for(int i= 0; i<5; i++){
            list.add(new AlbaDTO(R.drawable.cuckoo,"(주)원어나더","[쿠쿠고객센터]영업X 120만원 정착지원금","09:00~18:00 1년 이상","서울 강서구 마곡동","220만원"));
            list.add(new AlbaDTO(R.drawable.sinhan,"신한 LG전자/통신사 제휴카드 발급","발급희망고객카드발급/제휴카드발급","09:00~18:00 1년 이상","서울 영등포구 전체","250만원"));
            list.add(new AlbaDTO(R.drawable.woori,"월250만원/6개월차까지 정착지원금지급","[타사대비 높은급여/교육비별도] 우리카드","09:00~18:00 1년 이상","서울 마포구 합정동","250만원"));
        }
        count.setText(list.size()+"");
        RecyclerView rec_all = view.findViewById(R.id.rec_all);
        RecentAdapter adapter = new RecentAdapter(inflater,list);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        rec_all.setAdapter(adapter);
        rec_all.setLayoutManager(manager);

        return view;
    }
}