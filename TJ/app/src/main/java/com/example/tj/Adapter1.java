package com.example.tj;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
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

public class Adapter1 extends RecyclerView.Adapter {
    ArrayList<class1> list;
    Context context;
    Dialog myDilog;

    public Adapter1(ArrayList<class1> list, Context context) {
        this.list = list;
        this.context = context;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fulltime, parent, false);
        final ViewHolder vh = new ViewHolder(v);
        myDilog = new Dialog(context);
        myDilog.setContentView(R.layout.dialog);
        vh.apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Thank you for applying we will contact you via gmail for further info"+String.valueOf(vh.getAdapterPosition()),Toast.LENGTH_LONG).show();
            }
        });

        return vh;


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).imageView.setImageResource(list.get(position).getImage());
        ((ViewHolder) holder).Job.setText(list.get(position).getJob());
        ((ViewHolder) holder).companyname.setText(list.get(position).getCompany() + "");
        ((ViewHolder) holder).number.setText(list.get(position).getSalary() + "");

    }








    @Override
    public int getItemCount() {
        return list.size();
    }

      public static class ViewHolder extends RecyclerView.ViewHolder {
       public ImageView imageView;
       public TextView textView1;
       public TextView textView2;
       public ImageView img;
       public TextView Job;
       public TextView Salary;
       public TextView Company;
       public TextView number;
       public TextView companyname;
        public Button apply;
       public View view;





        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView4);
            img = itemView.findViewById(R.id.img);
            textView1 = itemView.findViewById(R.id.text1);
            textView2 = itemView.findViewById(R.id.text2);
            Job = itemView.findViewById(R.id.textView12);
            number = itemView.findViewById(R.id.textView10);
            Salary = itemView.findViewById(R.id.textView13);
            Company = itemView.findViewById(R.id.textView17);
            companyname = itemView.findViewById(R.id.textView11);
            apply = itemView.findViewById(R.id.button3);

        }







        }

        }



