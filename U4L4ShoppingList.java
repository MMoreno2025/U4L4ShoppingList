//Malia Moreno | 21 November 2024//
package com.mycompany.u4l4shoppinglist;
import java.util.Scanner;
import java.util.ArrayList;

public class U4L4ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList shoppingList = new ArrayList();       //defining shopping list array//
        
        boolean breakTrue = false;  //boolean to break the loop//
        while(breakTrue != true){   //make loop run infinantly until user inputs "s"//
            System.out.print("Please input an item (press s to stop):\t");
            String scanInput = scan.next();
            
            if(scanInput.equalsIgnoreCase("s")){        //stops loop if person inputs "s"//
                breakTrue = true;
            }else{
                shoppingList.add(scanInput);        //adds an item to the array//
            }
        }
        
        boolean break2True = false;
        while(break2True != true){
            System.out.println("\nShopping list:\n");       //sepearte shoping list from inputs//
            int index = 0;      //make way to stop while loop//
            while(index < shoppingList.size()){
                System.out.println((index+1)+") "+shoppingList.get(index));     //print out shopping list//
                index++;
            }

            System.out.print("\nWould you like to remove anything? (y/n)\t");
            String removeInput = scan.next();
            if(removeInput.equalsIgnoreCase("y")){
                System.out.print("What is the number of the item you would like to remove?\t");
                int removeNum = scan.nextInt();
                shoppingList.remove((removeNum-1));
            }
            
            System.out.print("\nWould you like to add anything? (y/n)\t");
            String addItem = scan.next();
            if(addItem.equalsIgnoreCase("y")){
                System.out.print("What would you like to add?\t");
                shoppingList.add(scan.next());
            }else{
                break2True = true;
            }
        }
        
    }
}
