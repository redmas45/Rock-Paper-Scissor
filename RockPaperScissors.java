import java.util.*;

class RockPaperScissors
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter Number of Rounds: ");
        int round = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Player 1 Name: ");
        String player1 = sc.nextLine();

        System.out.print("Enter Player 2 Name: ");
        String player2 = sc.nextLine();

        String choices[] = {"rock","paper","scissor"};

        int player1wins =0;
        int player2wins =0;
        int tie = 0;

        System.out.println("Player 1: "+ player1);
        System.out.println("Player 2: "+ player2);
        System.out.printf("%-10s %-10s %-10s \n","Round", player1, player2);
        System.out.println("=======================================================");

        for(int i=1;i<=round;i++)
        {
            String choice1 = choices[rand.nextInt(3)];
            String choice2 = choices[rand.nextInt(3)];
            System.out.printf("%-10d %-10s %-10s \n",i, choice1, choice2);
            System.out.println("=======================================================");

            if(choice1.equals(choice2))
            {
                tie++;
            }
            else if((choice1.equals("rock")) && (choice2.equals("scissor")) ||
                    (choice1.equals("paper")) && (choice2.equals("rock")) ||
                    (choice1.equals("scissor")) && (choice2.equals("paper")))
                    {
                        player1wins ++;

                    }
            else
            {
                player2wins ++;
            }
        }

        System.out.println("\n");
        System.out.println(player1 + " wins :" + player1wins);
        System.out.println(player2 + " wins :" + player2wins);
        System.out.println("TIE : "+ tie);

        sc.close();

        
    }
}