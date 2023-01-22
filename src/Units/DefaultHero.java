package Units;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class DefaultHero implements Behavior, Comparable<DefaultHero> {
    protected String name;
    protected int attack;
    protected int defense;
    protected int[] damage;
    protected int maxHealth;
    protected int health;
    protected int speed;

    public DefaultHero(String name, int attack, int defense, int[] damage, int maxHealth, int speed) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.damage = damage;
        this.maxHealth = maxHealth;
        this.speed = speed;
        this.health = maxHealth - new Random().nextInt(maxHealth);
    }

    @Override
    public String toString() {
        return String.valueOf(getClass()).replace("class Units.", "") +
                ", Name = '" + name + '\'' +
                ", attack = " + attack +
                ", defense = " + defense +
                ", damage = " + Arrays.toString(damage) +
                ", Max health = " + maxHealth +
                ", speed = " + speed;
    }

    @Override
    public String getInfo() {
        return String.valueOf(getClass()).replace("class Units.", "") + ", Name = " + name + ", Damage taken = " + (maxHealth - health) +
                ", current health = " + health;
    }

    @Override
    public void step(ArrayList<DefaultHero> party) {
        System.out.println("This unit does nothing so far");
    }
    @Override
    public int compareTo(DefaultHero o) {
        return this.maxHealth - o.maxHealth;
    }

}
