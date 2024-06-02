package com.example.simplemediaapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder> {

    private List<Player> playerList;
    private Context context;

    public PlayerAdapter(List<Player> playerList, Context context) {
        this.playerList = playerList;
        this.context = context;
    }

    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_item, parent, false);
        return new PlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder holder, int position) {
        Player player = playerList.get(position);
        holder.playerName.setText(player.getName());
        holder.playerImage.setImageResource(player.getImageResourceId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, PlayerInfoActivity.class);
            intent.putExtra("player_name", player.getName());
            intent.putExtra("player_image", player.getImageResourceId());
            intent.putExtra("player_info", player.getInfo());
            intent.putExtra("player_video", player.getVideoResourceId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }

    public static class PlayerViewHolder extends RecyclerView.ViewHolder {
        ImageView playerImage;
        TextView playerName;

        public PlayerViewHolder(@NonNull View itemView) {
            super(itemView);
            playerImage = itemView.findViewById(R.id.playerImage);
            playerName = itemView.findViewById(R.id.playerName);
        }
    }
}
