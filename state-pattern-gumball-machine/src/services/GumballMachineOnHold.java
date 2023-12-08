package services;

public class GumballMachineOnHold implements GumballMachineState {

  public GumballMachineOnHold() {
    System.out.println("> Aguardando moedas...");
  }

  @Override
  public GumballMachineState insertCoin() {
    System.out.println("MSG: Moeda inserida!");

    return new GumballMachineReceivedCoin();
  }

  @Override
  public GumballMachineState ejectCoin() {
    System.out.println("MSG: Nao ha como ejetar uma moeda no slot!");

    return new GumballMachineOnHold();
  }

  @Override
  public GumballMachineState triggerLever() {
    System.out.println("MSG: Alavanca acionada, mas sem moedas!");

    return new GumballMachineOnHold();
  }

  @Override
  public GumballMachineState deliverGum(int totalGumballs) {
    System.out.println("MSG: Insira uma moeda primeiro!");

    return new GumballMachineOnHold();
  }
  
}
