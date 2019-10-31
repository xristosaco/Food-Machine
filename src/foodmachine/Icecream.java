/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmachine;

import java.util.Scanner;

/**
 *
 * @author xristos
 */
public class Icecream {
    Scanner io = new Scanner (System.in);
    public int icecreamPrise(int prise){
        System.out.println("Prise or Icecream is 1.7");
        int icprise=io.nextInt();
        System.out.println("Your change is "+(icprise-1.7));
    return prise;
    }
}
