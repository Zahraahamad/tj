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

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Adapter2 extends RecyclerView.Adapter {
    ArrayList<class2> parts;
    Context context;
    Dialog  myDialog;

    public Adapter2(ArrayList<class2> parts, Context context) {
        this.parts = parts;
        this.context = context;
        Dialog myDilog;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View c = LayoutInflater.from(parent.getContext()).inflate(R.layout.parttime, parent, false);
         final Viewholder ch = new Viewholder(c);
        myDialog = new Dialog(context);
       myDialog.setContentView(R.layout.dialog);
        ch.apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Thank you for applying we will contact you via gmail for further info" + String.valueOf(ch.getAdapterPosition()), Toast.LENGTH_LONG).show();
            }
        });
        return ch;


    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((Adapter2.Viewholder) holder).imageView2.setImageResource(parts.get(position).getImage());
        ((Adapter2.Viewholder) holder).Job2.setText(parts.get(position).getJob());
        ((Adapter2.Viewholder) holder).companyname2.setText(parts.get(position).getCompany() + "");
        ((Adapter2.Viewholder) holder).number2.setText(parts.get(position).getSalary() + "");

    }

    @Override
    public int getItemCount() {
        return parts.size();
    }
    public static class Viewholder extends RecyclerView.ViewHolder {
        public ImageView imageView2;
        public TextView Job2;
        public TextView Salary2;
        public TextView Company2;
        public TextView number2;
        public TextView companyname2;
        public Button apply;
        public View view2;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageView2 = itemView.findViewById(R.id.imageView1);
            Job2 = itemView.findViewById(R.id.textView1);
            number2 = itemView.findViewById(R.id.textView3);
            Salary2 = itemView.findViewById(R.id.textView2);
            Company2 = itemView.findViewById(R.id.textView4);
            companyname2 = itemView.findViewById(R.id.textView5);
            apply = itemView.findViewById(R.id.button3);

        }
    }
}
