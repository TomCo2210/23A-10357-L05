package dev.tomco.a23a_10357_l05.Model;

import java.util.ArrayList;

public class Song {
    private String name = "";
    private String artist = "";
    private int duration = 0; //in seconds
    private float rating = 0.0f;
    private long releaseDate = 0;
    private Long views = 0l;
    private ArrayList<String> tags = new ArrayList<>();

    public Song() {
    }

    public String getName() {
        return name;
    }

    public Song setName(String name) {
        this.name = name;
        return this;
    }

    public String getArtist() {
        return artist;
    }

    public Song setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public Song setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public float getRating() {
        return rating;
    }

    public Song setRating(float rating) {
        this.rating = rating;
        return this;
    }

    public long getReleaseDate() {
        return releaseDate;
    }

    public Song setReleaseDate(long releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public long getViews() {
        return views;
    }

    public Song setViews(long views) {
        this.views = views;
        return this;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public Song setTags(ArrayList<String> tags) {
        this.tags = tags;
        return this;
    }

    public Song addTag(String tag) {
        this.tags.add(tag);
        return this;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                ", rating=" + rating +
                ", releaseDate=" + releaseDate +
                ", views=" + views +
                ", tags=" + tags +
                '}';
    }
}
