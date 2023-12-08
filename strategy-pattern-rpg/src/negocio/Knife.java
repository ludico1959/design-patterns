package negocio;

public class Knife implements Weapon {
  private int totalDamage = 20;

  @Override
  public void use() {
    System.out.println("Faca empunhada!");
  }

  @Override
  public int getTotalDamage() {
    return this.totalDamage;
  }
}
