package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.*;

public class Silver_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int N = Integer.parseInt(br.readLine());
        int num = 0;
        while(N > 0) {
            num++;
            String str = Integer.toString(num);   // int to string 형변환
            if(str.contains("666"))
                N--;
        }
        bw.write(Integer.toString(num));

        bw.flush();
        bw.close();
    }
}
