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
public class Chocolate {
    Scanner io= new Scanner(System.in);
    public int chocolatePrise(int prise){
        System.out.println("Chocolate Prise is 1.5 ");
        int choco= io.nextInt();
        System.out.println("Your change is "+(choco-1.5));
    return prise;
    }
}
