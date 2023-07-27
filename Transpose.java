public class Transpose {
  public static void main(String[] args) {
    int transpose[][] = new int[3][3];

    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int size = arr[0].length;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        transpose[j][i] = arr[i][j];
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(" " + transpose[i][j]);
      }
      System.out.println();
    }

  }
}
