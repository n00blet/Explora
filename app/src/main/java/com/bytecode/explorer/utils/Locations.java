package com.bytecode.explorer.utils;

import com.bytecode.explorer.R;

import java.util.Random;

/**
 * Created by Rakshith on 26-07-2015.
 */
public class Locations {

    private static final Random RANDOM = new Random();

    public static int getRandomLocationDrawable() {
        switch (RANDOM.nextInt(5)) {
            default:
            case 0:
                return R.drawable.image_1;
            case 1:
                return R.drawable.image_2;
            case 2:
                return R.drawable.image_3;
            case 3:
                return R.drawable.image_4;
            case 4:
                return R.drawable.image_5;
        }
    }

    public static final String[] mLocations = {

            "Hogenakal", "Nandi Hills", "Shivgange", "Bangalore Fort", "Rangaswamy Betta", "Coorg", "Kodachadri", "Mysore", "Cubbon Park"
    };
}
