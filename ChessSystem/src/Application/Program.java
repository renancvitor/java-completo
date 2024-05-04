package Application;

import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessMatch;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());

        scanner.close();
    }
}
