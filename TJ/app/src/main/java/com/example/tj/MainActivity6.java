package com.example.tj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ArrayList<class2> part = new ArrayList<>();
        class2 b1 = new class2("Store keeper",R.drawable.idcard,125,"Alshaya Group");
        class2 b2 = new class2("Movie Theater Cashier",R.drawable.idcard,80,"KNCC");
        class2 b3 = new class2("Clean Worker",R.drawable.idcard,100,"Umclean");
        class2 b4 = new class2("Coordinator",R.drawable.idcard,160,"Dasman Diabetes Institute");
        class2 b5 = new class2("Cashier",R.drawable.idcard,109,"kdd");
        class2 b6 = new class2("Grocery store cashier",R.drawable.idcard,50,"Alshaya Group");
        class2 b7 = new class2("Receptionist",R.drawable.idcard,350,"Dar Al Shifa hospital");
        class2 b8 = new class2("baker & Pastry maker",R.drawable.idcard,45,"Kuwait Flour Mills & Bakeries");
        class2 b9 = new class2("Machine Operator",R.drawable.idcard,50,"KOC");
        part.add(b1);
        part.add(b2);
        part.add(b3);
        part.add(b4);
        part.add(b5);
        part.add(b6);
        part.add(b7);
        part.add(b8);
        part.add(b9);
        RecyclerView recyclerView2 = findViewById(R.id.recyclerview2);
        recyclerView2.setHasFixedSize(true);
        RecyclerView.LayoutManager mn = new LinearLayoutManager(this);
        recyclerView2.setLayoutManager(mn);
        recyclerView2.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));


        Adapter2 ad = new Adapter2(part,this);
        recyclerView2.setAdapter(ad);

    }
}