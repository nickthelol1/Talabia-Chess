import javax.swing.ImageIcon;

public class ChessPiece {

    private String type;
    private ImageIcon image;
    private String color;
    private int row;
    private int col;

    public ChessPiece(String type, String color) {
        this.type = type;
        this.color = color;
        loadImage();
    }

    private void loadImage() {
        String imagePath = "images/" + color + "/" + type + ".jpeg";
        image = new ImageIcon(getClass().getResource(imagePath));
    }

    public ImageIcon getImage() {
        return image;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
