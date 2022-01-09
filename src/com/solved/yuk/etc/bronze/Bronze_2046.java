package com.solved.yuk.etc.bronze;


import java.io.*;

public class Bronze_2046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()),
            max = 0, maxlength = 0, count = 1, length;
        String[] input = br.readLine().split(" ");
        int min = Integer.parseInt(input[0]);
        for(int i = 0; i < N-1; i++){
            int num = Integer.parseInt(input[i]),
                nextNum = Integer.parseInt(input[i+1]);
            if(num < nextNum) {
                count++;
                if(i == N - 2){
                    length = nextNum - min;
                    maxlength = Math.max(length, maxlength);
                }
            } else {
                if(count > 1){
                    length = num - min;
                    maxlength = Math.max(length, maxlength);
                }
                min = nextNum;
                count = 1;
            }
        }
        bw.write(maxlength+"");

        bw.flush();
        bw.close();
    }
}
