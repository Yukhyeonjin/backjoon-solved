package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.Arrays;

public class Silver_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split("");
        int arr[] = new int[input.length];
        for(int i = 0; i< input.length;i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        for(int i = input.length-1; i >= 0; i --){
            bw.write(arr[i]+"");
        }


        bw.flush();
        bw.close();
    }
}
