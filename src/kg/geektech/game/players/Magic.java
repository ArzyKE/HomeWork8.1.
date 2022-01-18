package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    private int boostedDamage;

    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
        this.boostedDamage = boostedDamage;
    }
    public int getBoostedDamage(){
        return boostedDamage;
    }
   public void setBoostedDamage(int boostedDamage){
        this.boostedDamage = boostedDamage;
   }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int number = RPG_Game.random.nextInt(5) + 1;
        for (int i = 0; i < heroes.length; i++) {

            if (heroes[i].getHealth() > 0 && this != heroes[i])
                if (boostedDamage == 2) {
                    heroes[i].setDamage(heroes[i].getDamage() + this.boostedDamage);
                } else {
                    heroes[i].setDamage(heroes[i].getDamage());
                }
        }
    }
}
