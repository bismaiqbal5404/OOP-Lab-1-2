

package group.java5;

import java.util.Scanner;

public class Java5 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        final int COOKIES_PER_BOX = 12;
        final int BOXES_PER_CARTON = 24;
        final double PRICE_PER_BOX = 1.14;
        final double PRICE_LEFTOVER_BOX = 0.57;
        
      
        System.out.print("Enter the number of cookies : ");
        int totalCookies = scanner.nextInt();
        int fullBoxes = totalCookies / COOKIES_PER_BOX;
        int leftoverCookies = totalCookies - (fullBoxes * COOKIES_PER_BOX); 
        int fullCartons = fullBoxes / BOXES_PER_CARTON;
        int leftoverBoxes = fullBoxes - (fullCartons * BOXES_PER_CARTON); 
        double money = (fullBoxes * PRICE_PER_BOX) + (leftoverBoxes * PRICE_LEFTOVER_BOX);
        System.out.println("Total cookies produced: " + totalCookies);
        System.out.println("Full cartons: " + fullCartons);
        System.out.println("Leftover boxes: " + leftoverBoxes);
        System.out.println("Leftover cookies  : " + leftoverCookies);
        System.out.print("Total money made:" + money);
        
    
    }
}

    

