import javax.swing.*;
import java.awt.*;

public class ChessboardGUI extends JFrame {

    private static final int ROWS = 7;
    private static final int COLS = 6;
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

        pack(); // Adjusts the JFrame size to fit the components
        setLocationRelativeTo(null);
        setVisible(true);
    }

    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ChessboardGUI();
        });
    }
}
