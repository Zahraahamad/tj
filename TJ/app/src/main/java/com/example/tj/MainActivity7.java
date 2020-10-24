package com.example.tj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        ArrayList<class3> last = new ArrayList<>();
        class3 l1 = new class3("Clean Worker",R.drawable.idcard,100,"Umclean");
        class3 l2 = new class3("Coordinator",R.drawable.idcard,160,"Dasman Diabetes Institute");
        class3 l3 = new class3("Cashier",R.drawable.idcard,109,"kdd");
        class3 l4 = new class3("Grocery store cashier",R.drawable.idcard,50,"Alshaya Group");
        class3 l5 = new class3("Store keeper",R.drawable.idcard,125,"Alshaya Group");
        class3 l6 = new class3("Movie Theater Cashier",R.drawable.idcard,80,"KNCC");
        class3 l7 = new class3("Receptionist",R.drawable.idcard,350,"Dar Al Shifa hospital");
        class3 l8 = new class3("baker & Pastry maker",R.drawable.idcard,45,"Kuwait Flour Mills & Bakeries");
        class3 l9 = new class3("Machine Operator",R.drawable.idcard,50,"KOC");

        last.add(l1);
        last.add(l2);
        last.add(l3);
        last.add(l4);
        last.add(l5);
        last.add(l6);
        last.add(l7);
        last.add(l8);
        last.add(l9);

        RecyclerView recyclerView3 = findViewById(R.id.recyclerview3);
        recyclerView3.setHasFixedSize(true);
        RecyclerView.LayoutManager sn = new LinearLayoutManager(this);
        recyclerView3.setLayoutManager(sn);
        recyclerView3.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));


        Adapter3 bd = new Adapter3(last,this);
        recyclerView3.setAdapter(bd);
    }
}