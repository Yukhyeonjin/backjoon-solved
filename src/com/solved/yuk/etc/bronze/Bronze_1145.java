package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int arr[] = new int[input.length], min = 101;
        for(int i = 0; i < input.length; i ++){
            arr[i] = Integer.parseInt(input[i]);
            min = Math.min(min, arr[i]);
        }
        int count = 0;
        while (true){
            for(int i = 0; i < input.length; i ++){
                if(min % arr[i] == 0) count++;
            }
            if(count >= 3) break;
            count = 0;
            min++;
        }
        bw.write(min+"");

        bw.flush();
        bw.close();
    }
}
