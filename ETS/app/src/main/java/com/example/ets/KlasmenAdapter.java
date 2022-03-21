package com.example.ets;

import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.VideoView;

public class KlasmenAdapter extends RecyclerView.Adapter<KlasmenAdapter.ViewHolder> {

    Klasmen[] klasmens;
    Context context;

    public KlasmenAdapter(Klasmen[] klasmens, Context context) {
        this.klasmens = klasmens;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.klasmen_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Klasmen klasmens = klasmen[position];
        holder.textTeam.setText(klasmens.getTextTeam());
        holder.textPoin.setText(klasmens.getTextPoin());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, klasmens.getTextTeam(), Toast.LENGTH_SHORT).show();
            }
        });{

        }
    }

    @Override
    public int getItemCount() {
        return klasmens.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder (@NonNull View itemView){
            super(itemView);
        }
    }
}

