package com.company.pojasum.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class BigSumController {

  @GetMapping("/big-sum")
  public String bigSum(@RequestParam("a") String a, @RequestParam("b") String b) {
    try {
      // Convertir les paramètres de la requête en BigInteger
      BigInteger bigA = new BigInteger(a);
      BigInteger bigB = new BigInteger(b);

      // Effectuer la somme
      BigInteger result = bigA.add(bigB);

      // Retourner le résultat comme chaîne de caractères
      return result.toString();
    } catch (NumberFormatException e) {
      // Gérer les erreurs de conversion
      return "Les paramètres doivent être des nombres valides.";
    }
  }
}

