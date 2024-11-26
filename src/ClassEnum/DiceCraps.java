package ClassEnum;

import java.security.SecureRandom;

public class DiceCraps {

    private static final SecureRandom randomNumbers = new SecureRandom();

    enum Status {CONTINUE, WON, LOST};

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static int rollDice(){

        int firstDie = 1 + randomNumbers.nextInt(6);
        int secondDie = 1 + randomNumbers.nextInt(6);

        int sum = firstDie + secondDie;

        System.out.println("Player rolled " + firstDie + " + " +  secondDie + " = " + sum);

        return sum;
    }

    public static void gameWinner(){

        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice){
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.println("My Point is: " + myPoint);
        }
        if (gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();

            if (sumOfDice == myPoint){
                gameStatus = Status.WON;
            }
            else{
                if (sumOfDice == SEVEN){
                    gameStatus = Status.WON;
                }
            }
        }

        if (gameStatus == Status.WON){
            System.out.println("Player Wins");
        }
        else {
            System.out.println("Player Loses");
        }
    }
}
