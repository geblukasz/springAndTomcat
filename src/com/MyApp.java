package com;

public class MyApp {

    public static void main(String[] args) {

        Coach thecoach = new BaseballCoach();
        Coach trackCoach = new TrackCoach();

        System.out.println(trackCoach.getDailyWorkout());
    }
}
