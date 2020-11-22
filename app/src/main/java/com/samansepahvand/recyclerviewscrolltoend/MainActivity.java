package com.samansepahvand.recyclerviewscrolltoend;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Display;

import com.samansepahvand.recyclerviewscrolltoend.adapter.MyAdapter;
import com.samansepahvand.recyclerviewscrolltoend.datamodel.Model;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private ArrayList<Model> models=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       initView();
       initRecyclerView();
       fakeData();


      //  recyclerView.getLayoutManager().smoothScrollToPosition(recyclerView,null, models.size()-1);
      recyclerView.scrollToPosition(models.size()-1);

    }
    private  void initView(){
        recyclerView=findViewById(R.id.reyclerview);


    }
    private  void initRecyclerView(){
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    private  void  fakeData(){
        for (int i=0;i<=100;i++){
            models.add(new Model("Title"+i,i,"Description for Item"+i));
        }


        myAdapter=new MyAdapter(models);
        recyclerView.setAdapter(myAdapter);
    }



}