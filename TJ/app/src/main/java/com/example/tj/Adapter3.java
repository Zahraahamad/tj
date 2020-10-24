package com.example.tj;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter3 extends RecyclerView.Adapter {
    ArrayList<class3> experience;
    Context context;
    Dialog myDialog;

    public Adapter3(ArrayList<class3> experience, Context context) {
        this.experience = experience;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View s = LayoutInflater.from(parent.getContext()).inflate(R.layout.experience, parent, false);
        final ViewHolder sh  = new ViewHolder(s);
        myDialog = new Dialog(context);
        myDialog.setContentView(R.layout.dialog);
        sh.apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Thank you for applying we will contact you via gmail for further info" + String.valueOf(sh.getAdapterPosition()), Toast.LENGTH_LONG).show();
            }
        });





        return sh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((Adapter3.ViewHolder) holder).imageView3.setImageResource(experience.get(position).getImage());
        ((Adapter3.ViewHolder) holder).Job3.setText(experience.get(position).getJob());
        ((Adapter3.ViewHolder) holder).companyname3.setText(experience.get(position).getCompany() + "");
        ((Adapter3.ViewHolder) holder).number3.setText(experience.get(position).getSalary() + "");


    }

    @Override
    public int getItemCount() {
        return experience.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView3;
        public TextView Job3;
        public TextView Salary3;
        public TextView Company3;
        public TextView number3;
        public TextView companyname3;
        public Button apply;
        public View view3;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView3 = itemView.findViewById(R.id.imageView1);
            Job3 = itemView.findViewById(R.id.textView1);
            number3 = itemView.findViewById(R.id.textView3);
            Salary3 = itemView.findViewById(R.id.textView2);
            Company3 = itemView.findViewById(R.id.textView4);
            apply = itemView.findViewById(R.id.button3);
            companyname3 = itemView.findViewById(R.id.textView5);
        }
    }
}
