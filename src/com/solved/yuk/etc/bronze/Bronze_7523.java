package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_7523 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        String input[];
        for(int i  = 0; i < t; i++){
            input = br.readLine().split(" ");
            long n = Long.parseLong(input[0]),
                 m = Long.parseLong(input[1]);
            bw.write("Scenario #"+(i+1)+":\n");
            bw.write(gaus(n,m)+"\n\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static long gaus(long n, long m){
        long sum = 0;
        for(long i  = n; i <= m; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

