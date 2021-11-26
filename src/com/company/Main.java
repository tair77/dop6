package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
boss.setHealth(1000);
boss.setDamage(30);
boss.setUltimate("To tear");
boss.weapon.setWeaponName("Mortal");
boss.weapon.setWeaponType("m44");
boss.setWeapon(boss.weapon);
        System.out.println("Boss's health: " + boss.getHealth() + "Boss's damage: " + boss.getDamage() + "Boss's ultimate:" + "Boss's weapon's name: " + boss.weapon.getWeaponName() + "Boss's weapon's type: " + boss.weapon.getWeaponType());
Skeleton skeleton = new Skeleton();
skeleton.setHealth(1700);
skeleton.setDamage(35);
skeleton.setUltimate("Kill Arrow");
skeleton.setArrowsAmount(20);
skeleton.weapon.setWeaponName("Sefa");
skeleton.weapon.setWeaponType("Good");
skeleton.setWeapon(skeleton.weapon);

Skeleton skeleton1 =new Skeleton();
skeleton1.setHealth(1800);
skeleton1.setDamage(25);
skeleton1.setUltimate("Poison Arrow");
skeleton1.setArrowsAmount(60);
  skeleton1.weapon.setWeaponName("Cap Bar");
  skeleton1.weapon.setWeaponType("Bar");
skeleton1.setWeapon(skeleton1.weapon);
        System.out.println(boss.printInfo());
        System.out.println("---------------------------------------------------");
        System.out.println(skeleton.printInfo());
        System.out.println(skeleton1.printInfo());
    }
}
