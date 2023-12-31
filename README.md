# Tic-Tac-Toe Game
This is a simple command-line implementation of the Tic-Tac-Toe game in Java. It allows two players to take turns placing their tokens on a 3x3 game board until one player wins or the game ends in a tie.

## Getting Started
To run the game, you'll need a Java development environment and a compatible Java runtime installed on your system.
Clone or download the project repository to your local machine.
Open the project in your preferred Java IDE or compile the Java files manually using the command line.
Locate the TicTacToeGame.java file and execute it to start the game.
Follow the prompts and instructions provided in the console to play the game.

## Game Rules
The game is played on a 3x3 grid.
Two players take turns placing their tokens on the empty squares of the grid.
Player 1 uses the "X" token, and Player 2 uses the "O" token.
Each player selects the position for their token by entering the row and column numbers.
The row and column numbers should be in the range of 1 to 3.
The game ends when one player successfully forms a horizontal, vertical, or diagonal line of three tokens, or when all positions on the grid are filled.
If a winning condition is achieved, the winning player is declared.
If all positions on the grid are filled without a winner, the game ends in a tie.

## Classes
The project consists of three main classes:
TicTacToeGame: This class contains the main method and handles the game flow, including user input and turn management.
Board: The Board class represents the game board. It manages the placement of tokens, checks for winning conditions, and determines if the board is full.
Square: The Square enum class defines the possible values that can be placed on the game board, including X, O, and BLANK.

## Contributing
This project is for educational purposes and intended as a basic implementation of the Tic-Tac-Toe game. Therefore, contributions are not expected. However, if you have suggestions or improvements, you can fork the project, make your changes, and submit a pull request.

## License
The project is licensed under the GNU License. Feel free to use, modify, and distribute the code as per the terms of the license.

## Acknowledgments
This project was created as a learning exercise for a class lab project. It was created as per the lab instructions.
