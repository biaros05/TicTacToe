import java.util.Scanner;
public class TicTacToeGame
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to tictactoe! Ready to play?");
		System.out.println("before starting, when choosing the position of your token, please refer to this diagram:");
		System.out.println("  1 2 3");
		System.out.println("1 _ _ _");
		System.out.println("2 _ _ _");
		System.out.println("3 _ _ _");
		
		Board board = new Board();
		boolean gameOver = false;
		int player = 1;
		Square playerToken = Square.X;
		
		int row = 0;
		int column = 0;
		
		while(!(gameOver))
		{
			System.out.println(board);
			if( player == 1)
			{
				playerToken = Square.X;
			}
			else
			{
				playerToken = Square.O;
			}
			do
			{
				System.out.println("Please enter the row in which you want to place your token:");
				row = scan.nextInt();
				System.out.println("Please enter the column in which you want to place your token:");
				column = scan.nextInt();
			} while(!(board.placeToken(row, column, playerToken)));
			if (board.checkIfWinning(playerToken))
			{
				System.out.println("Player " + player + " is the winner!");
				gameOver = true;
			}
			else if (board.checkIfFull())
			{
				System.out.println("It's a tie!");
				gameOver = true;
			}
			else
			{
				player++;
				if (player > 2)
				{
					player = 1;
				}
			}
		}
	}
}