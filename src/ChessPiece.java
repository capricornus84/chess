abstract class ChessPiece {
    String color;
    boolean check = true;
    String pieceType;
    int line;
    int column;

    public ChessPiece(String color) {
        this.color = color;
    }

    public String getColor (){
        return color;
    }
    abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    abstract String getSymbol();

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}
