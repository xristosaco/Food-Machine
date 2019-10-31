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
public class Chips {
    Scanner io= new Scanner (System.in);
    
    public int cipsPrise(int prise){
        System.out.println("Prise of Chips is 0.9");
        int chPrise= io.nextInt();
        System.out.println("Your change is "+(chPrise-0.9));
        return prise;
    }
}
