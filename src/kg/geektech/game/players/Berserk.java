package kg.geektech.game.players;

public class Berserk extends Hero {
    private int damageAbsorbed;
    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
      for (int i = 0; i < heroes.length ; i++) {
      if (this.getHealth() > 0 ) {
       damageAbsorbed = boss.getDamage() * 3/5;
       boss.setHealth(boss.getHealth() - this.getDamage() - damageAbsorbed);
          System.out.println("Barserk absorbed following damage and refiected it: " + damageAbsorbed);
          break;

      }
      }
    }
}
