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

public class CustomAdapter1 extends RecyclerView.Adapter<CustomAdapter1.ViewHolder> {

    LayoutInflater inflater;
    ArrayList<AlbaDTO> list ;

    public CustomAdapter1(LayoutInflater inflater) {
        this.inflater = inflater;
    }



    public CustomAdapter1(LayoutInflater inflater, ArrayList<AlbaDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.item_focus,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        holder.focus_service.setText(list.get(i).getTitle());
        holder.focus_salary.setText(list.get(i).getSalary());
        holder.focus_local.setText(list.get(i).getLocal());
        holder.focus_info.setText(list.get(i).getContent());
        holder.imgv_focus.setImageResource(list.get(i).getImg_id());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView focus_service, focus_info, focus_local, focus_salary;
        ImageView imgv_focus;
        View itemview;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemview = itemView;
            focus_info= itemview.findViewById(R.id.focus_info);
            focus_local=itemview.findViewById(R.id.focus_local);
            focus_salary = itemview.findViewById(R.id.focus_salary);
            focus_service = itemview.findViewById(R.id.focus_service);
            imgv_focus = itemview.findViewById(R.id.imgv_focus);
        }
    }

}
