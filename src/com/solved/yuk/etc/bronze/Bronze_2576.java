package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0, min = 101;
        for(int i = 0; i < 7; i ++){
            int num = Integer.parseInt(br.readLine());
            if(num % 2 == 1){
                sum+=num;
                min = Math.min(min, num);
            }
        }
        if(sum == 0 && min == 101){
            bw.write("-1");
        }else bw.write(sum+"\n"+min);


        bw.flush();
        bw.close();
    }
}
