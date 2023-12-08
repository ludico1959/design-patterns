package negocio;

public class BareHands implements Weapon {
  private int totalDamage = 5;

  @Override
  public void use() {
    System.out.println("Eu me garanto no soco!");
  }

  @Override
  public int getTotalDamage() {
    return this.totalDamage;
  } 
}
