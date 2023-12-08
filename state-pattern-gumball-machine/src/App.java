import services.GumballMachine;

public class App {
  public static void main(String[] args) throws Exception {

    GumballMachine gumballMachine = new GumballMachine(4);

    gumballMachine.insertCoin();
    gumballMachine.triggerLever();
    gumballMachine.deliverGum();
    //chicletes restantes: 3

    gumballMachine.insertCoin();
    gumballMachine.triggerLever();
    gumballMachine.ejectCoin();
    //chicletes restantes: 3

    gumballMachine.insertCoin();
    gumballMachine.insertCoin();
    gumballMachine.triggerLever();
    gumballMachine.triggerLever();
    gumballMachine.deliverGum();
    //chicletes restantes: 2

    gumballMachine.insertCoin();
    gumballMachine.triggerLever();
    gumballMachine.deliverGum();
    //chicletes restantes: 1
    
    gumballMachine.insertCoin();
    gumballMachine.triggerLever();
    gumballMachine.deliverGum();
    //chicletes restantes: 0
    //assumir estado de esgotado
    
    gumballMachine.insertCoin();
    gumballMachine.triggerLever();
    gumballMachine.deliverGum();
    //chicletes restantes: 0
    //exibir mensagens de esgotado

    showMachineStatus(gumballMachine.getTotalGumballs(), gumballMachine.getTotalCash());
    gumballMachine.reset(50);
    showMachineStatus(gumballMachine.getTotalGumballs(), gumballMachine.getTotalCash());
    
  }

  public static void showMachineStatus(int noGumballs, double cash) {
    System.out.println("-------------------------------");
    System.out.println(String.format("STATUS MAQUINA:\n - qtd chicletes = %d\n - dinheiro = R$ %.2f", 
                      noGumballs, cash));
    System.out.println("-------------------------------");
  }

}
