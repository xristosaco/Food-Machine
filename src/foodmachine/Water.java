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
public class Water {
     Scanner io = new Scanner (System.in);
    public int waterPrise(int prise){
        System.out.println("Prise or Water is 0.5");
        int waPrise=io.nextInt();
        System.out.println("Your change is "+(waPrise-0.5));
    return prise;
}
}
