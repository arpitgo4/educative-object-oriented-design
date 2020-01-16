package com.lld.mtb.model;

@Bean
public class Movie {
    private String name;
    private String id;
    private String runningTime;
    private String ratings;
    private String reviews;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", runningTime='" + runningTime + '\'' +
                ", ratings='" + ratings + '\'' +
                ", reviews='" + reviews + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}