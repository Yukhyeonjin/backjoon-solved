package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bronze_28014 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int ans = 1;
    for (int i = 1; i < array.length; i++) {
      if (array[i - 1] <= array[i]) {
        ans++;
      }
    }
    System.out.println(ans);
  }

}
