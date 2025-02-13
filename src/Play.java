import java.util.Scanner;
public class Play {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player 1 is X, Player 2 is O");
        System.out.println("Enter the row and column to play");
        TicTacToe game = new TicTacToe();
        int row;
        int col;
        while(!game.isGameOver()) {
            game.printBoard();
            // your code here
            System.out.println();
            System.out.println("Player " + game.getCurrentPlayer() + "'s turn");
            row = scanner.nextInt();
            col = scanner.nextInt();
            game.play(row, col);
            System.out.println();
        }
        game.printBoard();
        if(game.getWinner() == 0){
            System.out.println("It's a draw!");
        } else{
            System.out.println("Player " + game.getWinner() + " won!");
        }
        scanner.close();
    }
}
