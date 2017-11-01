package com.springexcercise;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

    private String[] fortuneQuotes = {"Today is your lucky day", "Boom boom boom", "Heyoo"};
    private Random random = new Random();

    @Override
    public String getFortune(){
        int randomquote = random.nextInt(fortuneQuotes.length);
        return fortuneQuotes[randomquote];
    }
}
