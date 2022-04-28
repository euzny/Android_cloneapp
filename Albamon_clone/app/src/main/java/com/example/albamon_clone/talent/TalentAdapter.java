package com.example.albamon_clone.talent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.albamon_clone.R;
import com.example.albamon_clone.dto.UserDTO;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TalentAdapter extends RecyclerView.Adapter<TalentAdapter.ViewHolder> {

    LayoutInflater inflater;
    ArrayList<UserDTO> list;

    public TalentAdapter(LayoutInflater inflater, ArrayList<UserDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    public TalentAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.item_rec_talent,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        holder.rec_tal_title.setText(list.get(i).getInfo());
        holder.rec_tal_info.setText("("+list.get(i).getGender()+","+list.get(i).getAge()+"세)");
        holder.rec_tal_career.setText("경력 "+list.get(i).getCareer());
        holder.rec_tal_name.setText(list.get(i).getName());
        holder.rec_tal_local.setText(list.get(i).getLocal());
        holder.rec_tal_time.setText(list.get(i).getTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
       TextView rec_tal_name, rec_tal_info,rec_tal_title,rec_tal_career, rec_tal_local,rec_tal_time;
       View itemview;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemview = itemView;
            rec_tal_name = itemview.findViewById(R.id.rec_tal_name);
            rec_tal_career = itemview.findViewById(R.id.rec_tal_career);
            rec_tal_info = itemview.findViewById(R.id.rec_tal_info);
            rec_tal_title = itemview.findViewById(R.id.rec_tal_title);
            rec_tal_local = itemview.findViewById(R.id.rec_tal_local) ;
            rec_tal_time = itemview.findViewById(R.id.rec_tal_time);
        }
    }
}
