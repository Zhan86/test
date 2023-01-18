import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TicTacToe board = new TicTacToe();
        board.newGame();
        System.out.println(Arrays.deepToString(board.getField()).replace("],", "], \n"));
        System.out.println(board.makeMove(1, 1));
        System.out.println(Arrays.deepToString(board.getField()).replace("],", "], \n"));
        System.out.println(board.makeMove(2, 1));
        System.out.println(Arrays.deepToString(board.getField()).replace("],", "], \n"));
        System.out.println(board.makeMove(1, 2));
        System.out.println(Arrays.deepToString(board.getField()).replace("],", "], \n"));
        System.out.println(board.makeMove(2, 2));
        System.out.println(Arrays.deepToString(board.getField()).replace("],", "], \n"));
        System.out.println(board.makeMove(3, 3));
        System.out.println(Arrays.deepToString(board.getField()).replace("],", "], \n"));
        System.out.println(board.makeMove(1, 3));
        System.out.println(Arrays.deepToString(board.getField()).replace("],", "], \n"));
        System.out.println(board.makeMove(2, 3));
        System.out.println(Arrays.deepToString(board.getField()).replace("],", "], \n"));
        System.out.println(board.makeMove(3, 2));
        System.out.println(Arrays.deepToString(board.getField()).replace("],", "], \n"));
        System.out.println(board.makeMove(3, 1));
        System.out.println(Arrays.deepToString(board.getField()).replace("],", "], \n"));

    }
}