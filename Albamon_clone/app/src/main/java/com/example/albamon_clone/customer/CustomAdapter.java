package com.example.albamon_clone.customer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.albamon_clone.dto.AlbaDTO;
import com.example.albamon_clone.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    LayoutInflater inflater;
    ArrayList<AlbaDTO> list;

    public CustomAdapter(LayoutInflater inflater, ArrayList<AlbaDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    public CustomAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.item_grand,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        holder.grand_service.setText(list.get(i).getTitle());
        holder.imgv_grand.setImageResource(list.get(i).getImg_id());
        holder.grand_salary.setText(list.get(i).getSalary());
        holder.grand_local.setText(list.get(i).getLocal());
        holder.grand_info.setText(list.get(i).getContent());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgv_grand;
        TextView grand_service,grand_info, grand_salary, grand_local;
        View itemview;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemview = itemView;
            imgv_grand = itemview.findViewById(R.id.imgv_grand);
            grand_info =itemview.findViewById(R.id.grand_info);
            grand_salary = itemview.findViewById(R.id.grand_salary);
            grand_local = itemview.findViewById(R.id.grand_local);
            grand_service = itemview.findViewById(R.id.grand_service);
        }

    }

}
