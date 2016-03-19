package com.example;


public class MyClass {

    public static int calculateSum(int start){
        int sum = 0;
        for(int i = start ;i <100 ; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {

        int sum2 = calculateSum(0);
        System.out.println(sum2);

/*
        //byte ab = 1; //8 bit
        //byte abc = 10033;

        //short size = 2; //2byte 2^-8 <-> 2^8
        int numOfPeople = 19; //4 byte
        //.out.println(numOfPeople);

        long numOfPeopleInChina = 600000000;
        double height = 177.7; //8 byte

        //float weight = 45.5f;//4byte
        char firstInitial = 'n';
        boolean isBig = true;

        String name = "Hyunjin";

        int appleCount = 127;
        int bannaCount = 127;
        //int sum = appleCount + bannaCount;
        //System.out.println(sum);


        int sum = 0;
        for (int i = 0; i < 100; i = i + 1) {
            //System.out.println(i);
        }

        int i = 0;
        while (i < 100) {
        i = i + 1;
            System.out.println(i);

        }

        int ab = 10; //assignment: put right into left

        // i++ equals i= i + 1;
        // ++i

        i = 0;
        System.out.println(i++); // 0
        //i = 1;
        //i = 2
        System.out.println(++i); //2
        */

        for (int i = 0; i < 100; i++) {
            if (i == 0) {
                System.out.println("i is zero");
            } else if (i == 5) {
                System.out.println("i is five");
            } else if (i == 7) {
                System.out.println("i is seven");
            } else if (i > 10 && i < 100) {
                System.out.println("i is seven");
            } else {
                System.out.println("i is something else");
            }
            System.out.println(i);
        }

        int idx = 0;
        switch (idx) {
            case 0:
                System.out.println("idx is zero");
                break;
            case 5:
                System.out.println("idx is five");
                break;
            default:
                System.out.println("idx is something else");
                break;
        }
    }



}
