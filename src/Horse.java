public class Horse extends ChessPiece{

    public Horse(String color) {
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
            if ((line+2)==toLine && (column+1)==toColumn){
                return true;
            } else if ((line+2)==toLine && (column-1)==toColumn){
                return true;
            } else if ((line-2)==toLine && (column+1)==toColumn){
                return true;
            } else if ((line-2)==toLine && (column-1)==toColumn){
                return true;
            } else if ((line+1)==toLine && (column+2)==toColumn){
                return true;
            } if ((line-1)==toLine && (column+2)==toColumn){
                return true;
            } if ((line+1)==toLine && (column-2)==toColumn){
                return true;
            } if ((line-1)==toLine && (column-2)==toColumn){
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
        return "H";
    }

}
