package com.example.albamon_clone.talent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.albamon_clone.R;
import com.example.albamon_clone.dto.UserDTO;

import java.util.ArrayList;

public class TalentFrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup= (ViewGroup) inflater.inflate(R.layout.fragment_talent, container, false);

        ArrayList<UserDTO> list = new ArrayList<>();
        for(int i=0; i<=6; i++){
            list.add(new UserDTO("최OO", "28","남","맡은 일에 최선을 다하는 사람입니다.","6년 5개월","서빙,주방장,주방보조,바리스타","기간무관, 요일무관","경남 진주시"));
            list.add(new UserDTO("김OO", "28","여","바로 실무 가능한 경험 많은 인재입니다.","2년 10개월","영상편집, 모션 그래픽, 편집 디자인","기간무관, 요일무관","안양시, 재택가능"));
            list.add(new UserDTO("정OO", "26","남","몸도 마음도 건강한 인재입니다.","4년 6개월","마케팅, 관리, 주방보조","기간무관, 요일무관, 시간무관","서울 노원구"));
        }

        //최신 인재정보
        RecyclerView rec_talent = viewGroup.findViewById(R.id.rec_talent);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        rec_talent.setLayoutManager(manager);
        TalentAdapter adapter = new TalentAdapter(inflater,list);
        rec_talent.setAdapter(adapter);


        //스페셜 인재
        RecyclerView spc_talent = viewGroup.findViewById(R.id.spc_talent);
        RecyclerView.LayoutManager manager1 = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        spc_talent.setLayoutManager(manager1);
        rec_talent.setLayoutManager(manager);
        TalentAdapter1 adapter1 = new TalentAdapter1(inflater,list);
        spc_talent.setAdapter(adapter1);

        return viewGroup;
    }
}