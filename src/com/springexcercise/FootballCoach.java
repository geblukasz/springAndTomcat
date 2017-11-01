package com.springexcercise;

public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Let's get some soccer practice!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
