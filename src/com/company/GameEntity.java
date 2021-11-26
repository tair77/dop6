package com.company;

public class GameEntity {
    private int health;
    private int damage;
    private String ultimate;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getUltimate() {
        return ultimate;
    }

    public void setUltimate(String ultimate) {
        this.ultimate = ultimate;
    }
    public String info() {
        return "Amount of health:" + health + " " + "Damage:" + damage + " " + "Ultimate ability:" + ultimate + " " ;


    }

}
