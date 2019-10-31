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
public class SodaWater {
    Scanner io = new Scanner (System.in);
    public int sodaWaterprise(int prise){
        System.out.println("Prise or SodaWater is 1");
        int sdPrise=io.nextInt();
        System.out.println("Your change is "+(sdPrise-1));
    return prise;
}
}
