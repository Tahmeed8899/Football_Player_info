package com.example.simplemediaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PlayerInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_info);

        ImageView playerImageView = findViewById(R.id.playerImageView);
        TextView playerNameView = findViewById(R.id.playerNameView);
        TextView playerInfoView = findViewById(R.id.playerInfoView);
        Button playVideoButton = findViewById(R.id.playVideoButton);

        Intent intent = getIntent();
        String playerName = intent.getStringExtra("player_name");
        int playerImage = intent.getIntExtra("player_image", 0);
        String playerInfo = intent.getStringExtra("player_info");
        int playerVideo = intent.getIntExtra("player_video", 0);

        playerImageView.setImageResource(playerImage);
        playerNameView.setText(playerName);
        playerInfoView.setText(playerInfo);

        playVideoButton.setOnClickListener(v -> {
            Intent videoIntent = new Intent(PlayerInfoActivity.this, PlayerVideoActivity.class);
            videoIntent.putExtra("player_video", playerVideo);
            startActivity(videoIntent);
        });
    }
}
