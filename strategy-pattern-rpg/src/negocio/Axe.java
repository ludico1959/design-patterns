package negocio;

public class Axe implements Weapon {
  private int totalDamage = 100;

  @Override
  public void use() {
    System.out.println("Machado empunhado!");
  }

  @Override
  public int getTotalDamage() {
    return this.totalDamage;
  }
}
