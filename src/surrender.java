
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
public class surrender {

    public static int surrender(int surrenderFlag, Player playerOne, Player playerTwo) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (surrenderFlag == 0) {
            System.out.print("\nWhich player would like to surrender? ");
            userInput = scanner.nextLine();
            //p1 surrenders
            if (userInput.equals("1") || userInput.equals(playerOne.getPlayerID())) {
                System.out.println(playerOne.getPlayerID() + " has surrendered!");
                surrenderFlag = 1;
            } //p2 surrenders
            else if (userInput.equals("2") || userInput.equals(playerTwo.getPlayerID())) {
                System.out.println(playerTwo.getPlayerID() + " has surrendered!");
                surrenderFlag = 2;
            } else {
                System.out.println("Wrong input given. Either type the player name or the "
                        + "player number.");
            }
        }
        return surrenderFlag;

    }

}
