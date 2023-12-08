package services;

public class GumballMachine {
  private int totalGumballs;
  private double totalCash;
  private GumballMachineState currentState;

  public GumballMachine() {
    this.totalGumballs = 100;
    this.totalCash = 0;
    this.currentState = new GumballMachineOnHold();
  }

  public GumballMachine(int noGumballs) {
    this.totalCash = 0;
    this.totalGumballs = noGumballs;
    this.currentState = new GumballMachineOnHold();
  }

  public int getTotalGumballs() {
    return this.totalGumballs;
  }

  public double getTotalCash() {
    return this.totalCash;
  }

  public void reset(int noGumballs) {
    this.totalGumballs = noGumballs;
    this.totalCash = 0;

    System.out.println("MSG: A maquina esta funcionando novamente!");
    this.currentState = new GumballMachineOnHold();
  }

  public void insertCoin() {
    this.currentState = this.currentState.insertCoin();
  }

  public void ejectCoin() {
    this.currentState = this.currentState.ejectCoin();
  }

  public void triggerLever() {
    this.currentState = this.currentState.triggerLever();
  }

  public void deliverGum() {
    this.totalCash = this.totalGumballs > 0 ? this.totalCash + 0.25 : this.totalCash;
    this.totalGumballs = this.totalGumballs > 0 ? this.totalGumballs - 1 : 0;

    this.currentState = this.currentState.deliverGum(this.totalGumballs);
  }
}
