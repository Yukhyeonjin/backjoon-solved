package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11970 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]),
            b = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int c = Integer.parseInt(input[0]),
            d = Integer.parseInt(input[1]);
        if(c >= b || d <= a){
            bw.write(b-a + d-c +"");
        } else {
            bw.write(Math.max(d,b) - Math.min(a,c)+"");
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

