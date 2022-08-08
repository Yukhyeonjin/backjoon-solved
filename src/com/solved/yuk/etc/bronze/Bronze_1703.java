package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1703 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!"0".equals(input = br.readLine())){
            String strArr[] = input.split(" ");
            int a = Integer.parseInt(strArr[0]), sum = 1;
            for(int i = 1; i <= 2*a; i++){
                if(i % 2 == 0){
                    sum-=Integer.parseInt(strArr[i]);
                }else {
                    sum*=Integer.parseInt(strArr[i]);
                }
            }
            bw.write(sum+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
