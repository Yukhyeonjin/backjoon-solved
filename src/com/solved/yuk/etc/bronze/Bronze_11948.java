package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_11948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstArr[] = new int[4],
            secondArr[] = new int[2];
        for(int i = 0; i < 6; i ++){
            if(i < 4){
                firstArr[i] = Integer.parseInt(br.readLine());
            }else {
                secondArr[i-4] = Integer.parseInt(br.readLine());
            }
        }
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);
        bw.write((firstArr[1]+firstArr[2]+firstArr[3]+secondArr[1])+"");

        bw.flush();
        bw.close();
    }
}
