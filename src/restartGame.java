
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FF
 */
public class restartGame {

    public static int restartGame() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        int endGame = 0;
        System.out.print("\nResetting game, player names, and scores. Are you sure? (Y/N) ");
        userInput = scanner.nextLine();
        userInput = userInput.toUpperCase();
        if (userInput.equals("1") || userInput.equals("YES") || userInput.equals("Y")) {
            System.out.println("\nRestarting game...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\n\n");
            endGame = 1;
            return endGame;
        } else {
            System.out.println("It seems you aren't sure. Continuing game.\n");
            return endGame;
        }
    }

}
