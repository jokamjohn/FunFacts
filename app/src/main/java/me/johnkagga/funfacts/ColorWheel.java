package me.johnkagga.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by John Kagga on 6/14/2015.
 */
public class ColorWheel {

    public String [] mColor = {
            //color hex
                                "#39add1",
                                "#3079ab",
                                "#c25975",
                                "#e15258",
                                "#f9845b",
                                "#838cc7",
                                "#7d669e",
                                "#53bbb4",
                                "#51b46d",
                                "#e0ab18",
                                "#637a91",
                                "#f092b0",
                                "#b7c0c7"
    };
    public int getColor() {

        String color = "";
        //Adding a Random generator
        Random randomGenerator = new Random();
        //Generating the random number and using the array length as the values
        int randomNumber = randomGenerator.nextInt(mColor.length);
        // populating the mColor
        color = mColor[randomNumber];
        //converting the string to int
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }

}
