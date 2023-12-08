package services;

public interface GumballMachineState {

  public abstract GumballMachineState insertCoin();
  public abstract GumballMachineState ejectCoin();
  public abstract GumballMachineState triggerLever();
  public abstract GumballMachineState deliverGum(int totalGumballs);
  
}
