package com.example.albamon_clone.recent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.albamon_clone.dto.AlbaDTO;
import  com.example.albamon_clone.R;

import java.util.ArrayList;

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.ViewHolder>  {
    LayoutInflater inflater;
    ArrayList<AlbaDTO> list;

    public RecentAdapter(LayoutInflater inflater, ArrayList<AlbaDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    public RecentAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.item_alba,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        holder.alba_name.setText(list.get(i).getTitle());
        holder.alba_local.setText(list.get(i).getLocal());
        holder.alba_time.setText(list.get(i).getTime());
        holder.alba_salary.setText(list.get(i).getSalary());
        holder.alba_content.setText(list.get(i).getContent());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView alba_name, alba_content, alba_local, alba_time, alba_salary;
        View itemview;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemview = itemView;
            alba_name =    itemview.findViewById(R.id.alba_name);
            alba_content = itemview.findViewById(R.id.alba_content);
            alba_local =   itemview.findViewById(R.id.alba_local);
            alba_salary =  itemview.findViewById(R.id.alba_salary);
            alba_time =    itemview.findViewById(R.id.alba_time);
        }
    }
}
