import java.util.*;

class StonePaperScissor {
    public static void main(String[] args) {
        /*
            0 - Scissors
            1 - Paper
            2 - Stone
        */
        Scanner sc = new Scanner(System.in);
		Random rd = new Random();
        int i = 0;
        byte computer_score = 0, player_score = 0 ;
        while(i<5) {
            int B = rd.nextInt(3);
			//System.out.println(B);

            System.out.print("\nWhat you want to choose:\n0 - Scissors\t1 - Paper\t2 - Stone: ");
            int user_input = sc.nextInt();
            if (user_input == B) {
                System.out.println("Match tied!");
            }
            else if (user_input == 0 && B == 1) {
                System.out.println("You Win!");
                player_score++;
            }
            else if (user_input == 0 && B == 2) {
                System.out.println("Computer Win!");
                computer_score++;
            }
            else if (user_input == 1 && B == 0) {
                System.out.println("Computer Win!");
                computer_score++;
            }
            else if (user_input == 1 && B == 2) {
                System.out.println("You Win!");
                player_score++;
            }
            else if (user_input == 2 && B == 0) {
                System.out.println("You Win!");
                player_score++;
            }
            else if (user_input == 2 && B == 1) {
                System.out.println("Computer Win!");
                computer_score++;
            }
            i++;

        }
        System.out.println("\nFinal Result ");

        if(computer_score == player_score){
            System.out.println("Round Tied");
        }
        else if(computer_score>player_score){
            System.out.println("Computer Win The Round");
        }
        else if(computer_score < player_score){
            System.out.println("Player Win The Round");
        }

    }
}