package negocio;

import java.util.Random;

public abstract class Character {
  private String name;
  private int lifePoints = 100;
  private Weapon weapon;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLifePoints() {
    return this.lifePoints;
  }

  public void subLifePoints(int lostLifePoints) {
    this.lifePoints -= lostLifePoints;

    if (this.lifePoints < 0) {
      this.lifePoints = 0;
    }
  }

  public Weapon getWeapon() {
    return this.weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;

    this.weapon.use();
  }

  public int executeAttack() {
    int damage = 0;
    Random random = new Random();

    System.out.println(this.name + " em posicao de ataque...");

    if(random.nextInt(2) == 1) {
      System.out.println("O ataque acertou o adversario!");

      damage = random.nextInt(weapon.getTotalDamage()) + 1;
    }
    else {
      System.out.println("O ataque nao atingiu o adversário!");
    }

    return damage;
  }

  public void useMedicine() {
    this.lifePoints += 10;

    if(this.lifePoints > 100) {
      this.lifePoints = 100;
    }
  }

  public void die() {
    System.out.println("O personagem falaceu em batalha...");
  }

  public abstract void display();
}
