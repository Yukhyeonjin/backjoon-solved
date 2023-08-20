package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29163 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), even = 0, odd = 0;
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < input.length; i ++){
            if(Integer.parseInt(input[i]) % 2 == 0) even ++;
            else odd++;
        }
        if(even > odd) bw.write("Happy");
        else bw.write("Sad");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

