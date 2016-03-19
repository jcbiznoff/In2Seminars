package com.example;

/**
 * Created by jaychung on 3/5/16.
 */
public class Test1Class {
/*
x y
0 0 - > 0 0
1 1 - > 1 1
2 1 - > 2 1
3 2 - > 3 2
4 2  -> 4 2
 */

    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            y = x - y;
            System.out.println(x + " " + y + " ");
            x = x + 1;
        }
    }
}


//y = y+x
//y = y + 2; if(y>4) y = y -1;
//x = x+1; y=y+x;
//if(y<5){x = x + 1; if(y<3) {x= x-1;}} y= y + 2;