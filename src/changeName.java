
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FF
 */
public class changeName {
    
    public static void changeName(Player playerOne, Player playerTwo) {
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        String userInput = "";

        System.out.print("\nWhich player would like to change their name? ");
        while (flag == 0) {
            userInput = scanner.nextLine();
            if (userInput.equals("1") || userInput.equals(playerOne.getPlayerID())) {
                System.out.println("What would you like to change your name to? ");
                playerOne.setPlayerID(scanner.nextLine());
                flag = 1;
            } //p2 changes name
            else if (userInput.equals("2") || userInput.equals(playerTwo.getPlayerID())) {
                System.out.print("What would you like to change your name to? ");
                playerTwo.setPlayerID(scanner.nextLine());
                flag = 1;
            } else {
                System.out.println("Wrong input given, try again. ");
            }
        }
    }
    
}
