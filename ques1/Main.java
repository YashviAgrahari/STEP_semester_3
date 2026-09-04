package ques1;

public class Main
{
    static String playRound(String playerMove, String computerMove)
    {
        if(playerMove.equals(computerMove))
        {
            return "Draw";
        }
        else if(playerMove.equals("Rock") && computerMove.equals("Scissors"))
        {
            return "Player Wins";
        }
        else if(playerMove.equals("Paper") && computerMove.equals("Rock"))
        {
            return "Player Wins";
        }
        else if(playerMove.equals("Scissors") && computerMove.equals("Paper"))
        {
            return "Player Wins";
        }
        else
        {
            return "Computer Wins";
        }
    }

    public static void main(String[] args)
    {
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};

        String[] moves = {"Rock", "Paper", "Scissors"};

        int wins = 0;
        int losses = 0;
        int draws = 0;

        for(int i = 0; i < 5; i++)
        {
            int randomNumber = (int)(Math.random() * 3);
            String computerMove = moves[randomNumber];

            String result = playRound(playerMoves[i], computerMove);

            System.out.println("Round " + (i + 1));
            System.out.println("Player: " + playerMoves[i]);
            System.out.println("Computer: " + computerMove);
            System.out.println("Result: " + result);
            System.out.println();

            if(result.equals("Player Wins"))
            {
                wins++;
            }
            else if(result.equals("Computer Wins"))
            {
                losses++;
            }
            else
            {
                draws++;
            }
        }

        double winPercentage = (wins * 100.0) / 5;

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win Percentage: " + winPercentage + "%");
    }
}
