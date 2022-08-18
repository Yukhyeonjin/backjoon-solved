package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_2521 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine()),
            N = Integer.parseInt(br.readLine()), sum = 0, min = -1;
        for(int i = M; i <= N; i++){
            if( i < 2) {
                continue;
            }
            else if ( i == 2){
                sum += i;
                if(sum == i) min = i;
                continue;
            }
            boolean flag = false;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                sum += i;
                if(sum == i) min = i;
            }
        }
        if(sum == 0) bw.write(min+"");
        else bw.write(sum + "\n" + min);


        bw.flush();
        br.close();
        bw.close();
    }
}
