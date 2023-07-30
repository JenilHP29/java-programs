import java.util.Scanner;
import java.util.Random;

class Game{
	Random rd = new Random();
	int x = rd.nextInt(100);
    byte noOfGuesses = 1;

    int takeUserInput(){//--> Take Input from User
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    boolean isCorrectNumber(int uNum){//--> Check weather user input is equal to computer generated number
        return uNum == x;
    }

    void tip(int userNum){//--> Help User to get closer to  computer generated number
        if(userNum > x){
            System.out.println("You Guessed too large!! Enter lower number");
        }
        else{
            System.out.println("You Guessed too small!! Enter higher number");
        }
    }

    byte getNoOfGuesses(){ return noOfGuesses; }//--> Return total Number of guesses
    void setNoOfGuesses(){noOfGuesses++;}//--> Increment no of guess
}
class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Guessing Game");
        while(true) {
            System.out.print("\nPress   1. To start\n\t2. To Exit\nEnter Your Choice here: ");
            Scanner sc = new Scanner(System.in);
            byte x = sc.nextByte();
            if(x==1) {//--> Game starts here
                Game player = new Game();
                while (true) {
                    System.out.print("Enter your guess(1-100) : ");
                    int userInput = player.takeUserInput();
                    boolean result = player.isCorrectNumber(userInput);
                    if (result) {
                        System.out.println("Congratulation!!! You Guessed correct");
                        break;
                    } else {
                        player.tip(userInput);
                        player.setNoOfGuesses();
                    }
                }
                System.out.printf("You Guessed in %d attempts\n", player.getNoOfGuesses());
            }
            else if(x==2) {
                System.out.println("Thanks For Playing :)");
                break;
            }
            else {
                System.out.println("Please Enter Valid Option");
            }
        }
    }
}
