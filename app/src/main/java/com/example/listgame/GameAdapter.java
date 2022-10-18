package com.example.listgame;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ViewHolder> {
    private final ArrayList<Game> values;
    private final LayoutInflater inflater;

    public GameAdapter(Context context, ArrayList<Game> values){
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public GameAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_game,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GameAdapter.ViewHolder holder, final int position) {
        final Game game = values.get(position);
        holder.txtName.setText(game.name);
        holder.txtGenre.setText(game.genre);
        holder.txtDesc.setText(game.desc);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(),String.valueOf(position),Toast.LENGTH_LONG);
                Intent intent = new Intent(holder.itemView.getContext(), DetailGame.class);
                intent.putExtra("name",game.getName());
                intent.putExtra("genre",game.getGenre());
                intent.putExtra("desc",game.getDesc());
                v.getContext().startActivity(intent);
//                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtName, txtGenre, txtDesc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txt_name);
            txtGenre = itemView.findViewById(R.id.txt_genre);
            txtDesc = itemView.findViewById(R.id.txt_description);
        }
    }
}
