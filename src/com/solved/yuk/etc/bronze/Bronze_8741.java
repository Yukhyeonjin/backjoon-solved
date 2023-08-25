package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Bronze_8741 {     
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb = new StringBuilder();
      int n = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < n; i++) 
         sb.append("1");
         
      for(int i = 0; i < n - 1; i++) 
         sb.append("0");
         
      bw.write(sb.toString());
      bw.close();
   }
}
