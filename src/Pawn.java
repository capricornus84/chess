public class Pawn extends ChessPiece{

    public Pawn(String color) {
        super(color);
    }
    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line==toLine && column==toColumn){
            return false;
        }
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn) && (chessBoard.board[toLine][toColumn] ==null ||
                !chessBoard.board[toLine][toColumn].getColor().equals(this.color) && chessBoard.board[toLine][toColumn]!=null)) {
            if (line==1 && getColor().equals("White") && (line+2) == toLine){
                return true;
            } else if (line==1 && getColor().equals("Black") && (line+2) == toLine){
                return true;
            } else if (line!=1 && (line+1) == toLine){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String getColor(){
        return super.color;
    }

    public String getSymbol(){
        return "P";
    }

}
