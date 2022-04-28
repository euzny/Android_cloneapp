package com.example.albamon_clone.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.albamon_clone.R;
import com.example.albamon_clone.dto.AlbaDTO;

import java.util.ArrayList;

public class LocalAdapter extends RecyclerView.Adapter<LocalAdapter.ViewHolder> {

    LayoutInflater inflater;
    ArrayList<AlbaDTO> list;

    public LocalAdapter(LayoutInflater inflater, ArrayList<AlbaDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    public LocalAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.item_top_plus,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
            holder.alba_title.setText(list.get(i).getTitle());
            holder.alba_salary.setText(list.get(i).getSalary()+"원");
            holder.alba_local.setText(list.get(i).getLocal());
            holder.alba_content.setText(list.get(i).getContent());
            holder.img_logo.setImageResource(list.get(i).getImg_id());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView alba_title,alba_content,alba_salary, alba_local;
        ImageView img_logo;
        View itemview;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemview = itemView;
            img_logo = itemview.findViewById(R.id.img_logo);
            alba_content = itemview.findViewById(R.id.alba_content);
            alba_local = itemview.findViewById(R.id.alba_local);
            alba_salary=itemview.findViewById(R.id.alba_salary);
            alba_title =itemview.findViewById(R.id.alba_title);
        }
    }
}
