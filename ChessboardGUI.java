import javax.swing.*;
import java.awt.*;

public class ChessboardGUI extends JFrame {

    private static final int ROWS = 6;
    private static final int COLS = 7;
    private JButton[][] squares;

    public ChessboardGUI() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Chessboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(new GridLayout(ROWS, COLS));
        squares = new JButton[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                squares[i][j] = new JButton();
                squares[i][j].setOpaque(true);
                squares[i][j].setBackground(Color.WHITE);
                squares[i][j].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 128), 3));
                add(squares[i][j]);
            }
        }

        // Set a preferred size for the JFrame
        setPreferredSize(new Dimension(800, 600));
    }

    public void start() {
        pack(); // Adjusts the JFrame size to fit the components
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void updateChessboard(Chessboard chessboard) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                ChessPiece piece = chessboard.getPieceAt(i, j);
                if (piece != null) {
                    squares[i][j].setIcon(piece.getImage());
                } else {
                    squares[i][j].setIcon(null);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ChessboardGUI chessboardGUI = new ChessboardGUI();
            Chessboard chessboard = new Chessboard(); // Create a Chessboard instance
            chessboardGUI.updateChessboard(chessboard); // Update the GUI with the initial state
            chessboardGUI.start();
        });
    }
}
