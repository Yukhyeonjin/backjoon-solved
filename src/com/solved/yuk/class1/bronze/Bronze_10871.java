package com.solved.yuk.class1.bronze;

import java.io.*;

public class Bronze_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), X = Integer.parseInt(input[1]);

        String[] inputArray = br.readLine().split(" ");
        String output = "";
        for(int i = 0; i < N; i ++){
            if(Integer.parseInt(inputArray[i]) < X){
                output = output + inputArray[i] + " ";
            }
        }
        bw.write(output.trim());

        bw.flush();
        bw.close();
    }
}
