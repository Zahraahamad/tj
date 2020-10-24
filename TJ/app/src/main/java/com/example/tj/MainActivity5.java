package com.example.tj;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ArrayList<class1> jobs = new ArrayList<>();

        class1 c1 = new class1("Grocery store cashier", R.drawable.idcard, 50, "Alshaya Group");
        class1 c2 = new class1("Receptionist", R.drawable.idcard, 350, "Dar Al Shifa hospital");
        class1 c3 = new class1("baker & Pastry maker", R.drawable.idcard, 45, "Kuwait Flour Mills & Bakeries");
        class1 c4 = new class1("Machine Operator", R.drawable.idcard, 50, "KOC");
        class1 c5 = new class1("Store keeper", R.drawable.idcard, 125, "Alshaya Group");
        class1 c7 = new class1("Movie Theater Cashier", R.drawable.idcard, 80, "KNCC");
        class1 c8 = new class1("Clean Worker", R.drawable.idcard, 100, "Umclean");
        class1 c9 = new class1("Coordinator", R.drawable.idcard, 160, "Dasman Diabetes Institute");
        class1 c10 = new class1("Cashier", R.drawable.idcard, 109, "kdd");

        jobs.add(c1);
        jobs.add(c2);
        jobs.add(c3);
        jobs.add(c4);
        jobs.add(c5);
        jobs.add(c7);
        jobs.add(c8);
        jobs.add(c9);
        jobs.add(c10);
        RecyclerView recyclerView = findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


        Adapter1 ad = new Adapter1(jobs, this);
        recyclerView.setAdapter(ad);
    }

    public void showAlertDialog(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Android studio");
        alert.setMessage("thank you for applying,We will send the response to your gmail");
        alert.create().show();
    }

}