public class Chessboard {

    private ChessPiece[][] pieces;

    public Chessboard() {
        pieces = new ChessPiece[6][7];  
        initializeBoard();
    }

    private void initializeBoard() {
        // Blue pieces
        pieces[0][0] = new ChessPiece("Plus Piece", "Blue");
        pieces[0][1] = new ChessPiece("Hourglass", "Blue");
        pieces[0][2] = new ChessPiece("Time Piece", "Blue");
        pieces[0][3] = new ChessPiece("Sun Piece", "Blue");
        pieces[0][4] = new ChessPiece("Time Piece", "Blue");
        pieces[0][5] = new ChessPiece("Hourglass", "Blue");
        pieces[0][6] = new ChessPiece("Plus Piece", "Blue");

        pieces[1][0] = new ChessPiece("Point Piece", "Blue");
        pieces[1][1] = new ChessPiece("Point Piece", "Blue");
        pieces[1][2] = new ChessPiece("Point Piece", "Blue");
        pieces[1][3] = new ChessPiece("Point Piece", "Blue");
        pieces[1][4] = new ChessPiece("Point Piece", "Blue");
        pieces[1][5] = new ChessPiece("Point Piece", "Blue");
        pieces[1][6] = new ChessPiece("Point Piece", "Blue");

        // Yellow pieces
        pieces[5][0] = new ChessPiece("Plus Piece", "Yellow");
        pieces[5][1] = new ChessPiece("Hourglass", "Yellow");
        pieces[5][2] = new ChessPiece("Time Piece", "Yellow");
        pieces[5][3] = new ChessPiece("Sun Piece", "Yellow");
        pieces[5][4] = new ChessPiece("Time Piece", "Yellow");
        pieces[5][5] = new ChessPiece("Hourglass", "Yellow");
        pieces[5][6] = new ChessPiece("Plus Piece", "Yellow");

        pieces[4][0] = new ChessPiece("Point Piece", "Yellow");
        pieces[4][1] = new ChessPiece("Point Piece", "Yellow");
        pieces[4][2] = new ChessPiece("Point Piece", "Yellow");
        pieces[4][3] = new ChessPiece("Point Piece", "Yellow");
        pieces[4][4] = new ChessPiece("Point Piece", "Yellow");
        pieces[4][5] = new ChessPiece("Point Piece", "Yellow");
        pieces[4][6] = new ChessPiece("Point Piece", "Yellow");
    }

    public ChessPiece getPieceAt(int row, int col) {
        return pieces[row][col];
    }
}
