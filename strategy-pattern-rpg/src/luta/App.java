package luta;

import negocio.Axe;
import negocio.BareHands;
import negocio.Cangaceiro;
import negocio.Fishmonger;
import negocio.Knife;
import negocio.Minotaur;

public class App {
    public static void main(String[] args) throws Exception {
        int batleDamage = 0;

        Cangaceiro lampiao = new Cangaceiro();
        lampiao.setName("Lampiao");
        lampiao.setWeapon(new Fishmonger());
        lampiao.display();

        Minotaur boiBandido = new Minotaur();
        boiBandido.setName("Boi Bandido");
        boiBandido.setWeapon(new Axe());
        boiBandido.display();

        //batalha
        System.out.println("\n++++++++++++++++");
        System.out.println("Inicio da luta:");
        System.out.println("++++++++++++++++");

        batleDamage += lampiao.executeAttack();
        batleDamage += lampiao.executeAttack();
        batleDamage += lampiao.executeAttack();
        batleDamage += lampiao.executeAttack();
        batleDamage += lampiao.executeAttack();

        System.out.println("A peixeira quebrou...");
        lampiao.setWeapon(new Knife());

        batleDamage += lampiao.executeAttack();
        batleDamage += lampiao.executeAttack();

        System.out.println("A faca quebrou...");
        lampiao.setWeapon(new BareHands());

        batleDamage += lampiao.executeAttack();
        System.out.println(lampiao.getName() + " quebrou os dedos e nao pode mais atacar...");

        boiBandido.subLifePoints(batleDamage);
        batleDamage = 0;
        System.out.println(">>> Pontos de vida restantes do " + boiBandido.getName() + ": " + boiBandido.getLifePoints());


        batleDamage += boiBandido.executeAttack();
        batleDamage += boiBandido.executeAttack();

        lampiao.useMedicine();

        batleDamage += boiBandido.executeAttack();
        batleDamage += boiBandido.executeAttack();
        System.out.println(boiBandido.getName() + " cansou...");

        lampiao.subLifePoints(batleDamage);
        batleDamage = 0;
        System.out.println(">>> Pontos de vida restantes do " + lampiao.getName() + ": " + lampiao.getLifePoints());   

        //resultado
        System.out.println(("----------------------------------------------------"));
        if(lampiao.getLifePoints() > boiBandido.getLifePoints()) {
          System.out.println(("Vencedor: " + lampiao.getName()));
        }
        else if(lampiao.getLifePoints() < boiBandido.getLifePoints()) {
          System.out.println(("Vencedor: " + boiBandido.getName()));
        }
        else {
          System.out.println("Empate...");
        }
        System.out.println(("----------------------------------------------------"));  
    }
}
