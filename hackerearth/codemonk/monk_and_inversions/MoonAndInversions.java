package hackerearth.codemonk.monk_and_inversions;

import java.io.*;
import java.util.StringTokenizer;

public class MoonAndInversions {

  public static BufferedReader getBufferedReader() throws Exception {
    BufferedReader br;
    File file = new File("in.txt");
    boolean existsFile = file.exists();

    if (existsFile) {
      br = new BufferedReader(new FileReader(file));
    } else {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    if (existsFile)
      System.out.println("------- Start Local Execution -------");

    return br;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = getBufferedReader();
    int t = Integer.parseInt(br.readLine());

    // ------------- start algorithm
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < t; i++) {
      int m = Integer.parseInt(br.readLine());
      int[][] matrix = new int[m][m];

      // read
      for (int j = 0; j < m; j++) {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int k = 0; k < matrix.length; k++) {
          matrix[j][k] = Integer.parseInt(st.nextToken());
        }
      }

      // count
      int count = 0;
      for (int y = 0; y < m; y++) {
        for (int r = 0; r < m; r++) {
          for (int j = y; j < m; j++) {
            for (int k = r; k < m; k++) {
              if (matrix[y][r] > matrix[j][k]) {
                count++;
              }
            }
          }
        }

      }
      System.out.println(count);

    }

  }

}