package services;

public class GumballMachineReceivedCoin implements GumballMachineState {

  public GumballMachineReceivedCoin() {
    System.out.println("> Aguardando acionamento da alavanca...");
  }

  @Override
  public GumballMachineState insertCoin() {
    System.out.println("MSG: Ja ha uma moeda inserida no slot!");

    return new GumballMachineReceivedCoin();
  }

  @Override
  public GumballMachineState ejectCoin() {
    System.out.println("MSG: Nao ha como ejetar uma moeda no slot!");

    return new GumballMachineOnHold();
  }

  @Override
  public GumballMachineState triggerLever() {
    System.out.println("MSG: Alavanca acionada!");

    return new GumballMachineSoldGumball();
  }

  @Override
  public GumballMachineState deliverGum(int totalGumballs) {
    System.out.println("MSG: Gire a alavanca primeiro!");

    return new GumballMachineReceivedCoin();
  }

}
