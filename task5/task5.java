package task5;

public class task5 {
  public static void printMatrix(char[][] poleGry) {
    int n = poleGry.length;
    System.out.println("------------------------");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(poleGry[i][j] + "|");
      }
      System.out.println();
    }
    System.out.println("------------------------");

  }
  public static void updatePole(int row, int col, boolean[][] logicalPole) {
      int n = logicalPole.length;
  
      for (int j = 0; j < n; j++) {
        logicalPole[row][j] = false;
      }

      for (int j = 0; j < n; j++) {
        logicalPole[j][col] = false;
      }
  
      int r = row;
      int c = col;
      while (r >= 0 && c >= 0) {
        logicalPole[r][c] = false;
        r--;
        c--;
      }
  
      r = row;
      c = col;
      while (r < 8 && c < 8) {
        logicalPole[r][c] = false;
        r++;
        c++;
      }
  
      r = row;
      c = col;
      while (r < 8 && c >= 0) {
        logicalPole[r][c] = false;
        r++;
        c--;
      }
  
      r = row;
      c = col;
      while (r >= 0 && c < 8) {
        logicalPole[r][c] = false;
        r--;
        c++;
      }
    }
  
    public static char[][] copyArray(char[][] original) {
      char[][] copy = new char[original.length][];
      for (int i = 0; i < original.length; i++) {
        copy[i] = original[i].clone();
      }
      return copy;
    }
  
    public static boolean[][] copyArray(boolean[][] original) {
      boolean[][] copy = new boolean[original.length][];
      for (int i = 0; i < original.length; i++) {
        copy[i] = original[i].clone();
      }
      return copy;
    }
  
    public static void frameQueens(char[][] board, boolean[][] logicalPole, int rowNumber) {
      if (rowNumber == 8) {
        printMatrix(board);
        return;
      }
  
      int n = board.length;
      for (int column = 0; column < n; column++) {
        if (logicalPole[rowNumber][column]) {
          char[][] newBoard = copyArray(board);
          boolean[][] newlogicalPole = copyArray(logicalPole);
          newBoard[rowNumber][column] = 'Q';
          newlogicalPole[rowNumber][column] = false;
          updatePole(rowNumber, column, newlogicalPole);
          frameQueens(newBoard, newlogicalPole, rowNumber + 1);
        }
      }
    }
  
    public static void frameQueens() {
      int N = 8;
      char[][] board = new char[8][8];
      boolean[][] logicalPole = new boolean[8][8];
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          board[i][j] = ' ';
          logicalPole[i][j] = true;
        }
      }
      frameQueens(board, logicalPole, 0);
    }
  
    public static void main(String[] args){
      frameQueens();
    }
}