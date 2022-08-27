package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        while((n = Integer.parseInt(br.readLine())) != -1){
            int sum = 0;
            StringBuilder str = new StringBuilder();
            str.append(n + " = ");
            for(int i = 1; i < n; i ++){
                if(n % i == 0 ){
                   sum += i;
                   str.append(i + " + ");
                }
                if(sum > n) break;
            }
            if(sum == n){
                bw.write(str.substring(0, str.length() - 3)+"\n");
            }else {
                bw.write(n + " is NOT perfect.\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
