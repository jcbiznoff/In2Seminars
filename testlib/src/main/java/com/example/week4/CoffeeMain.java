package com.example.week4;

/**
 * Created by jaychung on 3/19/16.
 */
public class CoffeeMain {

    String name;
    boolean isHot;
    int numEspressoShots;
    int numSteamedMilk;
    int numCupsWater;
    String origin;
    int size; //0,1,2
    String flavor; //"Bitter", "Sweet" "Light" ,"Dark"

    public CoffeeMain() {
        System.out.println("Parent Coffeee");
    }

    public CoffeeMain(int numEspressoShots, int numSteamedMilk, int numCupsWater, boolean isHot) {

        this.numEspressoShots = numEspressoShots;
        this.numSteamedMilk = numSteamedMilk;
        this.numCupsWater = numCupsWater;
        this.isHot = isHot;
    }

    public void setEspressoShots(int numShots) {
        this.numEspressoShots = numShots;
    }

    public String getCoffeeName() {
        if ((this.numEspressoShots == this.numCupsWater) && this.numSteamedMilk == 0 && this.isHot) {
            return "Americano";
        }
        if ((this.numEspressoShots == this.numCupsWater) && this.numSteamedMilk == 0 && !this.isHot) {
            return "Ice Americano";
        }
        if ((this.numEspressoShots == this.numCupsWater) && (this.numCupsWater == this.numSteamedMilk) && this.isHot) {
            return "Cafe Latte";
        }

        return "";
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getName() {
        return "Just Coffee";
    }


    public int getName(int abc) {
        abc = 1;
        return abc;
    }


}
