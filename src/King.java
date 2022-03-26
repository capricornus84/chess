public class King extends ChessPiece{

    public King(String color) {
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
            if ((line+1) == toLine){
                return true;
            } else if ((line-1) == toLine){
                return true;
            } else if ((column+1) == toColumn){
                return true;
            } else if ((column-1) == toColumn){
                return true;
            } else if ( (line-1) == toLine && (column+1) == toColumn ) {
                return true;
            } else if ( (line-1) == toLine && (column-1) == toColumn ) {
                return true;
            } else if ( (line+1) == toLine && (column+1) == toColumn ) {
                return true;
            } else if ( (line+1) == toLine && (column-1) == toColumn ) {
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
        return "K";
    }
    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        if (checkPos(line) && checkPos(column)) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (chessBoard.board[i][j] != null) {
                        if (!chessBoard.board[i][j].getColor().equals(color) && chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } else return false;
    }
}
