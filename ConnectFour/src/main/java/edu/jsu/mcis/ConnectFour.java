package edu.jsu.mcis;

public class ConnectFour {
    public enum Token { RED, BLACK, EMPTY }
    public enum Result { NONE, RED_WIN, BLACK_WIN, TIE }
    public static final int COLUMNS = 7;
    private final int ROWS = 6;
    private Token[][] board;
    private boolean redTurn;
    
    public ConnectFour() {
        board = new Token[ROWS][COLUMNS];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = Token.EMPTY;
            }
        }
        redTurn = true;
    }
    
    public Token getTopOfColumn(int col) {
		for(int i=0; i < 6; i++){
			if (board[i][col] != Token.EMPTY) {
				return board[i][col];
			} 
		}
		return Token.EMPTY;
    }
	
	
    
    public int getHeightOfColumn(int col) {
		int count = 0;
		for(int i=0; i < 6; i++){
			if (board[i][col] != Token.EMPTY)
				count++;
		}
		 return count;
	}
    
    public boolean dropTokenInColumn(int col) {
		boolean ableToDropToken = false;
		for(int i=5; i > -1; i--){
			if (board[i][col] == Token.EMPTY){
				if(redTurn == true){
					board[i][col] = Token.RED;
					redTurn = !redTurn;
					ableToDropToken = true;
					break;
				}
				else 
					board[i][col] = Token.BLACK;
					redTurn = !redTurn;
					ableToDropToken = true;
					break;
			}		
		}
		return ableToDropToken;
	}

    
    public Result getResult() {
        return Result.RED_WIN;
    }
    
    
    // Here are a couple of private methods to give you
    // an idea of a more clever way to determine winners.
    public boolean doesRedWinVerticallyInColumn(int col) {
        String columnString = makeStringFromColumn(col);
        return (columnString.indexOf("RRRR") >= 0);
    }
    
    public String makeStringFromColumn(int col) {
        String s = "";
        for(int row = 0; row < ROWS; row++) {
            if(board[row][col] == Token.RED) s += "R";
            else if(board[row][col] == Token.BLACK) s += "B";
            else s += " "; 
        }
        return s;
    }
}












