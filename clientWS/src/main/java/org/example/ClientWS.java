package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        Compte cp = proxy.getCompte(2);
        System.out.println("Compte N : " + cp.getCode());
        System.out.println(cp.getSolde());
        System.out.println(cp.getDateCreattion());
       List<Compte> compteList = proxy.listComptes();
       for (Compte c : compteList){
           System.out.println("------------------");
           System.out.println("Code Compte : " + cp.getCode());
           System.out.println("Solde : " +  cp.getSolde());
           System.out.println("Date Creation : " + cp.getDateCreattion());
       }
    }
}
