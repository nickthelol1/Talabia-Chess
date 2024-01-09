import javax.swing.*;

public class ChessboardController {

    private Chessboard chessboard;
    private ChessboardGUI chessboardGUI;

    public ChessboardController(Chessboard chessboard, ChessboardGUI chessboardGUI) {
        this.chessboard = chessboard;
        this.chessboardGUI = chessboardGUI;
    }

    public void startGame() {
        SwingUtilities.invokeLater(() -> {
            chessboardGUI.updateChessboard(chessboard);
            chessboardGUI.start();
        });
    }
}