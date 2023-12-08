package negocio;

public class Fishmonger implements Weapon {
  private int totalDamage = 45;

  @Override
  public void use() {
    System.out.println("Peixeira empunhada!");
  }

  @Override
  public int getTotalDamage() {
    return this.totalDamage;
  }

}
