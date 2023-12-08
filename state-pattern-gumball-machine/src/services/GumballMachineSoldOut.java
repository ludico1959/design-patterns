package services;

public class GumballMachineSoldOut implements GumballMachineState {

  public GumballMachineSoldOut() {
    System.out.println("> Os chicletes da maquina esgotaram :(((");
  }

 @Override
  public GumballMachineState insertCoin() {
    System.out.println("MSG: A maquina esta temporariamente fechada!");

    return new GumballMachineSoldOut();
  }

  @Override
  public GumballMachineState ejectCoin() {
    System.out.println("MSG: A maquina esta temporariamente fechada!");

    return new GumballMachineSoldOut();
  }

  @Override
  public GumballMachineState triggerLever() {
    System.out.println("MSG: A maquina esta temporariamente fechada!");

    return new GumballMachineSoldOut();
  }

  @Override
  public GumballMachineState deliverGum(int totalGumballs) {
   System.out.println("MSG: A maquina esta temporariamente fechada!");

    return new GumballMachineSoldOut();
  }
  
}
