package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_20410 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        double m = Double.parseDouble(input[0]),
               seed = Double.parseDouble(input[1]),
               x1 = Double.parseDouble(input[2]),
               x2 = Double.parseDouble(input[3]);
        // x1 = (a * seed + c) % m
        // x2 = (a * x1 + c) % m
        int a,c; boolean flag = false;
        for(int i = 0; i <= m; i ++){
            for(int j = 0; j <= m; j ++){
                if(x1 == (i * seed + j) % m && x2 == (i * x1 + j) % m) {
                    a = i; c = j;
                    bw.write(a+" "+c);
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }


        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}
