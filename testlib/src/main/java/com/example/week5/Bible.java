package com.example.week5;

import com.sun.org.apache.xpath.internal.operations.Mod;

/**
 * Created by jaychung on 3/26/16.
 */
public class Bible
        extends ReligiousBook implements Modifyable{

    public String getName(){
        return  "Bible";
    }

    @Override
    public void turnPages() {
        System.out.println("turn page");
    }

    @Override
    public void changeTextSize() {
        //
    }

    @Override
    public void changeBrightness() {
        //
    }

    @Override
    public void throwaway() {

    }
}
