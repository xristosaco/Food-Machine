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
public class FoodMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner io =new Scanner(System.in);
        
        //1) θα πρεπει να χερεταει
        System.out.println("Welcome. what would you like?");
        
        //2) θα πρεπει να λεει τα προιοντα
        System.out.println("Chocolate 1");
        System.out.println("Chips 2");
        System.out.println("Icecream 3");
        System.out.println("Soda Water 4");
        System.out.println("Water 5");
        System.out.println("Enter the number");
        int order= io.nextInt();
        
        Chocolate choPrise= new Chocolate();
        Chips cpPrise= new Chips();
        Icecream icprise= new Icecream();
        SodaWater sdPise = new SodaWater();
        Water waPrise = new Water();
        
        
        
        
        switch (order){
            case 1:
                choPrise.chocolatePrise(order);
                break; 
            case 2:
                cpPrise.cipsPrise(order);
                break;
            case 3:
                icprise.icecreamPrise(order);
                break;
            case 4 :
                sdPise.sodaWaterprise(order);
                break;
                
            case 5:
                waPrise.waterPrise(order);
                break;
        
        }
        
        System.out.println("You want somthing else?");
        System.out.println("Yes 1 ");
        System.out.println("No 2");
        int yesNo= io.nextInt();
        
        //
        //4) να σου σου λεει τι προιοντα αγορασες
        //5) την τελικη τιμη
        //6) αν τα χρηματα ειναι κατω απο την αξια τον προιοντων να σου λεει καποιο μνμ
        //7) να επιστρεφει τα ρεστα
        //8) να κανει validation
    }
    
}
