public class ChessApp {
    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard();
        ChessboardGUI chessboardGUI = new ChessboardGUI();
        ChessboardController controller = new ChessboardController(chessboard, chessboardGUI);

        controller.startGame();
    }
}