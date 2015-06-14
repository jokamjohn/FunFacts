package me.johnkagga.funfacts;

import java.util.Random;

/**
 * Created by John on 6/14/2015.
 */
public class FunBook {

    public String [] mFacts = {
            "Ants stretch when they wake up in the morning",
            "Ostriches run faster than horses",
            "Olympic medals are actually made mostly of silver",
            "You are born with 300 bones, by the time you adult you will hav 206",
            "It takes about 8 minutes for the light from the sun to reach the earth",
            "Some bamboo plants can grow 8 metres a day",
            "Tanzania is bigger than Uganda",
            "some penguins can leap 2-3 metres a day from the water",
            "John Kagga is Jokam",
            "My mummy is the best mummy ever"
    };
    public String getFact() {

        String fact = "";
        //Adding a Random generator
        Random randomGenerator = new Random();
        //Generating the random number and using the array length as the values
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        // populating the mColor
        fact = mFacts[randomNumber];

        return fact;
    }



}
