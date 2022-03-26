public class Queen extends ChessPiece{

    public Queen(String color) {
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
            int i =1;
            while (true) {
                if (!checkPos(line-i) ){
                    break;
                }
                if ( (line-i) == toLine ) {
                    return true;
                }
                i ++;
            }
            i =1;
            while (true) {
                if (!checkPos(line+i) ){
                    break;
                }
                if ( (line+i) == toLine ) {
                    return true;
                }
                i ++;
            }
            i =1;
            while (true) {
                if ( !checkPos(column-i)){
                    break;
                }
                if ( (column-i) == toColumn ) {
                    return true;
                }
                i ++;
            }
            i =1;
            while (true) {
                if ( !checkPos(column+i)){
                    break;
                }
                if ( (column+i) == toColumn ) {
                    return true;
                }
                i ++;
            }
            i =1;
            while (true) {
                if (!checkPos(line-i) || !checkPos(column+i)){
                    break;
                }
                if ( (line-i == toLine && column+i == toColumn) ) {
                    return true;
                }
                i ++;
            }
            i =1;
            while (true) {
                if (!checkPos(line+i) || !checkPos(column-i)){
                    break;
                }
                if ( (line+i == toLine && column-i == toColumn) ) {
                    return true;
                }
                i ++;
            }
            i =1;
            while (true) {
                if (!checkPos(line-i) || !checkPos(column-i)){
                    break;
                }
                if ( (line-i == toLine && column-i == toColumn) ) {
                    return true;
                }
                i ++;
            }
            i =1;
            while (true) {
                if (!checkPos(line+i) || !checkPos(column+i)){
                    break;
                }
                if ( (line+i == toLine && column+i == toColumn) ) {
                    return true;
                }
                i ++;
            }
            return false;
        } else {
            return false;
        }
    }

    public String getColor(){
        return super.color;
    }

    public String getSymbol(){
        return "Q";
    }

}
