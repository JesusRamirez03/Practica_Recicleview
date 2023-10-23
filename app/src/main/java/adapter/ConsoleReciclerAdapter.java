package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica_recicleview.R;

import java.util.ArrayList;
import java.util.List;

import models.Console;

public class ConsoleReciclerAdapter extends RecyclerView.Adapter<ConsoleReciclerAdapter.MyViewHolder> {
    List<Console> consoleList = new ArrayList<>();
    Context ctx;

    public ConsoleReciclerAdapter(List<Console> consoleList, Context ctx) {
        this.consoleList = consoleList;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ConsoleReciclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(R.layout.activity_consoles,parent,false);
        return new ConsoleReciclerAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ConsoleReciclerAdapter.MyViewHolder holder, int position) {
        Console console = consoleList.get(position);
        holder.txtname.setText(console.getName());
        holder.txtgen.setText(console.getGen());
        holder.imgv.setImageResource(console.getInage());
    }

    @Override
    public int getItemCount() {
        return consoleList.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imgv;
        TextView txtname, txtgen;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgv = itemView.findViewById(R.id.imgu);
            txtname = itemView.findViewById(R.id.txtName);
            txtgen = itemView.findViewById(R.id.txtGen);
        }
    }
}
