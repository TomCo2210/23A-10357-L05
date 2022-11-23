package dev.tomco.a23a_10357_l05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;

import dev.tomco.a23a_10357_l05.Model.Playlist;
import dev.tomco.a23a_10357_l05.Model.Song;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Playlist playlist = new Playlist();
        playlist.setName("Top 50");

        playlist.getSongs().add(new Song()
                .setName("פנתרה")
                .setArtist("נועה קירל")
                .setDuration(185)
                .setReleaseDate(System.currentTimeMillis()/1000)
                .setRating(4.3f)
                .setViews(18001491)
                .addTag("Pop")
                .addTag("Israeli")
        );

        playlist.getSongs().add(new Song()
                .setName("Gangnam Style")
                .setArtist("PSY")
                .setDuration(252)
                .setReleaseDate(System.currentTimeMillis()/1000)
                .setRating(4.9f)
                .setViews(4_060_000_000l)
                .addTag("K-Pop")
                .addTag("Korean")
        );


        String json = new Gson().toJson(playlist);
        Log.d("JSON", json);

        String json2 = "{\"name\":\"Top 50\",\"songs\":[{\"artist\":\"נועה קירל\",\"duration\":185,\"name\":\"פנתרה\",\"rating\":4.3,\"releaseDate\":1669208739,\"tags\":[\"Pop\",\"Israeli\"],\"views\":18001491},{\"artist\":\"PSY\",\"duration\":252,\"name\":\"Gangnam Style\",\"rating\":4.9,\"releaseDate\":1669208739,\"tags\":[\"K-Pop\",\"Korean\"],\"views\":4060000000}]}";
        Playlist playlist2 = new Gson().fromJson(json2,Playlist.class);
        Log.d("Playlist From JSON", playlist2.toString());
    }
}