import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playerAMove = "";
        String playerBMove = "";
        String continueYN = "";

        do
        {
            System.out.print("Player A enter your move. Enter Rock, Paper, or Scissors [RPS]: ");
            playerAMove = in.nextLine();
                while(!(playerAMove.equalsIgnoreCase("R")||playerAMove.equalsIgnoreCase("P")||playerAMove.equalsIgnoreCase("S")))
               {
                   System.out.print("Player A enter your move. Enter Rock, Paper, or Scissors [RPS]: ");
                   playerAMove = in.nextLine();
               }
            System.out.print("Player B enter your move. Enter Rock, Paper, or Scissors [RPS]: ");
                playerBMove = in.nextLine();
                while (!(playerBMove.equalsIgnoreCase("R")||playerBMove.equalsIgnoreCase("P")||playerBMove.equalsIgnoreCase("S")))
                {
                    System.out.print("Player B enter your move. Enter Rock, Paper, or Scissors [RPS]: ");
                    playerBMove = in.nextLine();
                }

                //Player A - Rock
                if(playerAMove.equalsIgnoreCase("R"))
                {
                    if (playerBMove.equalsIgnoreCase("R"))
                    {
                        System.out.println("Rock vs. Rock, it's a TIE!");
                    }
                    else if (playerBMove.equalsIgnoreCase("P"))
                    {
                        System.out.println("Paper covers Rock, Player B WINS!");
                    }
                   // else if (playerBMove.equalsIgnoreCase("S"))
                    else if (playerBMove.equalsIgnoreCase("S"))
                    {
                        System.out.println("Rock breaks Scissors, Player A WINS!");
                    }
                }

                //Player A - Paper
                else if(playerAMove.equalsIgnoreCase("P"))
                {
                    if (playerBMove.equalsIgnoreCase("R"))
                    {
                        System.out.println("Paper covers Rock, Player A WINS!");
                    }
                    else if (playerBMove.equalsIgnoreCase("P"))
                    {
                        System.out.println("Paper vs. Paper, it's a TIE!");
                    }
                    else if (playerBMove.equalsIgnoreCase("S"))
                    {
                        System.out.println("Scissors cut Paper, Player B WINS!");
                    }
                }

                //Player A - Scissors
                else if (playerAMove.equalsIgnoreCase("S"))
                {
                    if (playerBMove.equalsIgnoreCase("R"))
                    {
                        System.out.println("Rock breaks Scissors, Player B WINS!");
                    }
                    else if (playerBMove.equalsIgnoreCase("P"))
                    {
                        System.out.println("Scissors cut Paper, Player A WINS!");
                    }
                    else if (playerBMove.equalsIgnoreCase("S"))
                    {
                        System.out.println("Scissors vs. Scissors, it's a TIE!");
                    }
                }

            System.out.print("Do you want to play Rock, Paper, Scissors Game [Y/N]?");
            continueYN = in.nextLine();
        }
        while(continueYN.equalsIgnoreCase("Y"));
    }

}