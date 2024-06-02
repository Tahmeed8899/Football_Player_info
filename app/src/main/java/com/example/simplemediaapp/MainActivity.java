package com.example.simplemediaapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlayerAdapter playerAdapter;
    private List<Player> playerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        playerList = new ArrayList<>();
        playerList.add(new Player("Ronaldinho Gaucho", R.drawable.player1_image, R.raw.player1_video, "The Brazilian Maestro\n"));
        playerList.add(new Player("Lionel Messi", R.drawable.player2_image, R.raw.player2_video, "Greatest of All Time\n"));
        playerList.add(new Player("Eden Hazard", R.drawable.player3_image, R.raw.player3_video, "The boy who dreamt\n"));
        playerList.add(new Player("Didier Drogba", R.drawable.player4_image, R.raw.player4_video, "Best Premier League Striker of his Generation\n"));
        playerList.add(new Player("John Terry", R.drawable.player5_image, R.raw.player5_video, "Captain Leader Legend\n"));
        playerList.add(new Player("Frank Lampard", R.drawable.player6_image, R.raw.player6_video, "Suuuper Frankie Lampaard\n"));

        playerAdapter = new PlayerAdapter(playerList, this);
        recyclerView.setAdapter(playerAdapter);
    }
}
