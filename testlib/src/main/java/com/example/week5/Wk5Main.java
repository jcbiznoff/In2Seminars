package com.example.week5;

import com.example.week4.AmericanoCoffee;
import com.example.week4.Coffee;

/**
 * Created by jaychung on 3/19/16.
 */
public class Wk5Main {

    public static void main(String[] args) {
//        Coffee coffee = new Coffee();
//        System.out.println(coffee.getCategory());
//
//        coffee.getCategory(1);

        //Coffee coffee = new Coffee();
        Coffee coffee;
        coffee = new Coffee();

        //AmericanoCoffee americanoCoffee;


        Coffee coffee2 = new AmericanoCoffee();
        coffee2.getName();

       // AmericanoCoffee americanoCoffee = new Coffee();

        //coffee2.getName();
        //americanoCoffee.getAmericaconName();



        Book myBook = new Book();

        System.out.println(myBook.getAuthorName());

        myBook.setAuthorName("Steven King");

        System.out.println(myBook.getAuthorName());
    }


}
