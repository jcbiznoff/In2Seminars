package com.example.week4;

/**
 * Created by jaychung on 3/19/16.
 */
public class ArrayTest {

    public int[] bag;
    public int[] bag2;

    public ArrayTest(){

        int person1 = 10;
        int person2 = 20;


        bag = new int[4];
        bag[0] = 1;
        bag[1] = 2;
        bag[2] = 3;
        bag[3] = 4;

        bag2 = new int[]{1,2,3,4};

        //bag = {1,2,3,4};
        //bag = new int[];

        //iteration
//        System.out.println(bag[0]);
//        System.out.println(bag[1]);
//        System.out.println(bag[2]);
//        System.out.println(bag[3]);

        for(int i=0 ; i<4; i++){
            System.out.println(bag[i]);
        }



        //access
        //access error

    }
}
