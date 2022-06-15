package hackerearth.codemonk.monk_and_inversions;

import java.io.*;
import java.util.StringTokenizer;

public class MoonAndInversions {

  public static BufferedReader getBufferedReader() throws Exception {
    BufferedReader br;
    File file = new File("../../in.txt");
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
    for (int i = 0; i < t; i++) {
      StringBuilder sb = new StringBuilder();
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int n = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());

    }

    System.out.println("hola james");

  }

}