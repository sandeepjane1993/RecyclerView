package com.example.sande.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<MyDataClass> myDataClassList;
    MyAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDataClassList = new ArrayList<>();

        adapter = new MyAdapter(myDataClassList);
        recyclerView = findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this); // check again
        recyclerView.setLayoutManager(manager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(adapter);

        createMyData();

    }

    private void createMyData() {

        MyDataClass mdc1 = new MyDataClass("Student","Berry","Chidi");
        myDataClassList.add(mdc1);
        MyDataClass mdc2 = new MyDataClass("Student","sandeep","chenna");
        myDataClassList.add(mdc2);
        MyDataClass mdc3 = new MyDataClass("Student","yixin","zeng");
        myDataClassList.add(mdc3);
        MyDataClass mdc4 = new MyDataClass("Student","cijan","li");
        myDataClassList.add(mdc4);
        MyDataClass mdc5 = new MyDataClass("Student","sandra","bullock");
        myDataClassList.add(mdc5);

    }


}
