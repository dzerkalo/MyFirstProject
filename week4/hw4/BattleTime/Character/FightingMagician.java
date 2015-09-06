package ACO7.week4.hw4.BattleTime.Character;

/**
 * Created by acer on 20.08.2015.
 */
public class FightingMagician extends Character {

    private int health = 600;
    private int power = 60;
    private int speed = 40;
    private int spells = 5;
    private int defence = 40;

    public int getHelth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSpells() {
        return spells;
    }

    public int getDefence() {
        return defence;
    }

    @Override
    public int headAttack() {
        return power + speed + spells - defence + (int) Math.random()*300;
    }

    @Override
    public int corpusAttack() {
        return power + speed + spells - defence + (int) Math.random()*120;
    }

    @Override
    public int legttack() {
        return power + speed + spells - defence + (int) Math.random()*70;
    }

    @Override
    public int health() {
        return health;
    }

    public void showInfo(){
        System.out.println("Health: " + health);
        System.out.println("Power: " + power);
        System.out.println("Speed: " + speed);
        System.out.println("Spells: " + spells);
        System.out.println("Defence: " + defence);

    }
}
