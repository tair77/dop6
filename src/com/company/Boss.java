package com.company;

public class Boss extends GameEntity{
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
          return super.info() + "Weapon type :" + weapon.getWeaponType() + " " + "Weapon name: " + weapon.getWeaponName();
    }

}
