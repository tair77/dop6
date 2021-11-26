package com.company;

public class Skeleton extends Boss {
    private int arrowsAmount;
    Weapon  megaBow = new Weapon();

    public int getArrowsAmount(){
        return arrowsAmount;
    }
     public void setArrowsAmount(int arrowsAmount){
        this.arrowsAmount = arrowsAmount;
     }
     public String printInfo(){
        return super.printInfo() + " " + "Arrow that are currently in quiver: " + arrowsAmount;

     }
}
