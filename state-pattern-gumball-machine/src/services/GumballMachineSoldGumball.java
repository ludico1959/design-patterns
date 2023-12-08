package services;

public class GumballMachineSoldGumball implements GumballMachineState {

  public GumballMachineSoldGumball() {
    System.out.println("> Aguardando entrega do chiclete...");
  }

  @Override
  public GumballMachineState insertCoin() {
    System.out.println("MSG: Espere o chiclete ser entregue!");

    return new GumballMachineSoldGumball();
  }

  @Override
  public GumballMachineState ejectCoin() {
    System.out.println("MSG: Moeda rejeitada!");

    return new GumballMachineOnHold();
  }

  @Override
  public GumballMachineState triggerLever() {
    System.out.println("MSG: Alavanca acionada, mas sem moedas!");

    return new GumballMachineSoldGumball();
  }

  @Override
  public GumballMachineState deliverGum(int totalGumballs) {
    System.out.println("MSG: Pegue o chiclete na portinha!");

    if (totalGumballs == 0) {
      return new GumballMachineSoldOut();
    }

    return new GumballMachineOnHold();
  }
  
}
