package com.ui;

import com.utility.*;
import java.util.*;

public class UserInterface {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Fill the UI code
    System.out.println("Enter the no of Policy names you want to store");
    int n = Integer.parseInt(sc.nextLine());
    Bazaar bazaar = new Bazaar();
    bazaar.setPolicyMap(new TreeMap<>());

    for (int i = 0; i < n; i++) {
      System.out.println("Enter the Policy ID");
      int pId = Integer.parseInt(sc.nextLine());
      System.out.println("Enter the Policy Name");
      String pName = sc.nextLine();

      bazaar.addPolicyDetails(pId, pName);
    }

    Map<Integer, String> policyMap = bazaar.getPolicyMap();

    for (Map.Entry<Integer, String> policy : policyMap.entrySet()) {
      System.out.println(policy.getKey() + " " + policy.getValue());
    }

    System.out.println("Enter the policy type to be searched");
    String pType = sc.next();

    List<Integer> policies = bazaar.searchBasedOnPolicyType(pType);

    for (int p : policies) {
      System.out.println(p);
    }
  }
}
