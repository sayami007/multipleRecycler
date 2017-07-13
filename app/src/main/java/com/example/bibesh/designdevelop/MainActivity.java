package com.example.bibesh.designdevelop;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<CustomData> data;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        data = getData();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(new CustomAdapter(this, data));
    }


    public List<CustomData> getData() {
        List<CustomData> custom = new ArrayList<>();

        CustomData data = new CustomData();
        data.setProductDetail(String.valueOf(getResources().getText(R.string.text)));
        data.setProductName("Burger ");
        data.setProductPrice(20.2);
        data.setProductIcon(R.drawable.burger);

        CustomData data2 = new CustomData();
        data2.setProductDetail(String.valueOf(getResources().getText(R.string.text)));
        data2.setProductName("Cake");
        data2.setProductPrice(20.21);
        data2.setProductIcon(R.drawable.cake);


        CustomData data3 = new CustomData();
        data3.setProductDetail(String.valueOf(getResources().getText(R.string.text)));
        data3.setProductName("Menu");
        data3.setProductPrice(20.21);
        data3.setProductIcon(R.drawable.menu);

        CustomData data4 = new CustomData();
        data4.setProductDetail(String.valueOf(getResources().getText(R.string.text)));
        data4.setProductName("Pancake");
        data4.setProductPrice(20.21);
        data4.setProductIcon(R.drawable.pancake);

        CustomData data5 = new CustomData();
        data5.setProductDetail(String.valueOf(getResources().getText(R.string.text)));
        data5.setProductName("Pizza");
        data5.setProductPrice(20.21);
        data5.setProductIcon(R.drawable.pizza);

        CustomData data6 = new CustomData();
        data6.setProductDetail(String.valueOf(getResources().getText(R.string.text)));
        data6.setProductName("Pizza");
        data6.setProductPrice(20.21);
        data6.setProductIcon(R.drawable.pizza);

        custom.add(data);
        custom.add(data2);
        custom.add(data3);
        custom.add(data4);
        custom.add(data5);
        custom.add(data6);

        return custom;
    }
}
