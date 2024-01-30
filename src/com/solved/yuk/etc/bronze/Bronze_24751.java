package com.solved.yuk.etc.bronze;

import java.util.*;
import java.io.*;

public class Bronze_24751 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        double a = Double.parseDouble(br.readLine());
        bw.write(String.format("%.10f\n%.10f\n", 100 / a, 100 / (100-a)));
        
        
        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
