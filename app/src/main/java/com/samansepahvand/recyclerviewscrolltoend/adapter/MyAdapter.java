package com.samansepahvand.recyclerviewscrolltoend.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.samansepahvand.recyclerviewscrolltoend.R;
import com.samansepahvand.recyclerviewscrolltoend.datamodel.Model;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<Model> models;


    public MyAdapter(ArrayList<Model> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Model model=models.get(position);


        holder.txtId.setText(String.valueOf(model.getId()));
        holder.txtTitle.setText(model.getTitle());
        holder.txtDesc.setText(model.getDesc());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txtTitle,txtDesc,txtId;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            initView(itemView);
        }
        private  void initView(View view){

            txtDesc=view.findViewById(R.id.txt_description);
            txtTitle=view.findViewById(R.id.txt_title);
            txtId=view.findViewById(R.id.txt_id);
        }
    }
}
