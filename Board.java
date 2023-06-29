public class Board
{
	// fields
	private Square[][] tictactoeBoard;
	
	// constructor
	public Board()
	{                            
		this.tictactoeBoard = new Square[3][3];
		// tested and it works
		for (int firstArr = 0; firstArr < tictactoeBoard.length; firstArr++)
		{
			for (int innerArr = 0; innerArr < tictactoeBoard[firstArr].length; innerArr++)
			{
				this.tictactoeBoard[firstArr][innerArr] = Square.BLANK;
			}
		}
	}
	
	// toString
	public String toString()
	{
		String board = "";
		for (int firstArr = 0; firstArr < tictactoeBoard.length; firstArr++)
		{
			for (int innerArr = 0; innerArr < tictactoeBoard.length; innerArr++)
			{
				board = board + this.tictactoeBoard[firstArr][innerArr] + " ";
			}
			board = board + "\n";
		}
		return(board);
	}
	
	// methods
	public boolean placeToken(int row, int col, Square playerToken)
	{
		if (row > 0 && row <=3 && col > 0 && col <=3)
		{
			if (this.tictactoeBoard[(row-1)][(col-1)].equals(Square.BLANK))
			{
				this.tictactoeBoard[(row-1)][(col-1)] = playerToken;
				return(true);
			}
		}
		return(false);
	}
	
	public boolean checkIfFull()
	{
		for (int firstArr = 0; firstArr < tictactoeBoard.length; firstArr++)
		{
			for (int innerArr = 0; innerArr < tictactoeBoard.length; innerArr++)
			{
				if (this.tictactoeBoard[firstArr][innerArr].equals(Square.BLANK))
				{
					return(false);
				}
			}
		}
		return(true);
	}
	
	private boolean checkIfWinningHorizontal(Square playerToken)
	{
		int streaks = 0;
		for (int firstArr = 0; firstArr < tictactoeBoard.length; firstArr++)
		{
			for (int innerArr = 0; innerArr < tictactoeBoard.length; innerArr++)
			{
				if (tictactoeBoard[firstArr][innerArr] == playerToken)
				{
					streaks++;
				}
			}
			// reset streaks variable
			if (streaks == 3)
			{
				return(true);
			}
			streaks = 0;
		}
		return(false);
	}
	
	private boolean checkIfWinningVertical(Square playerToken)
	{
		int streaks = 0;
		for (int column = 0; column < tictactoeBoard.length; column++)
		{
			for (int row = 0; row < tictactoeBoard.length; row++)
			{
				if (tictactoeBoard[row][column] == playerToken)
				{
					streaks++;
				}
			}
			// reset streaks variable
			if (streaks == 3)
			{
				return(true);
			}
			streaks = 0;
		}
		return(false);
	}
	
	public boolean checkIfWinning(Square playerToken)
	{
		return(checkIfWinningHorizontal(playerToken) || checkIfWinningVertical(playerToken));
	}
}