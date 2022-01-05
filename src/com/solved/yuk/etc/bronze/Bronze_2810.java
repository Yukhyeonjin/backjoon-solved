package com.solved.yuk.etc.bronze;


import java.io.*;

public class Bronze_2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), sum = 1;
        String input = br.readLine();
        for(int i = 0; i < N;){
            char seet = input.charAt(i);
            sum++;
            if(seet == 'S'){
                i++;
            }else {
                i+=2;
            }
        }
        bw.write((N <= sum ? N : sum) +"");

        bw.flush();
        bw.close();
    }
}
