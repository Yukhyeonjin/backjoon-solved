package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_1769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] X = br.readLine().split("");
        int sum=0, count = 0;
        while (X.length > 1) {
            sum = 0;
            for(int i = 0; i < X.length; i ++){
                sum += Integer.parseInt(X[i]);
            }
            X = String.valueOf(sum).split("");
            count++;
        }
        if(count == 0){
            bw.write(0+"\n"+(Integer.parseInt(X[0])%3 == 0 ? "YES" : "NO"));
        }else bw.write(count+"\n"+(sum%3 == 0 ? "YES" : "NO"));

        bw.flush();
        bw.close();
    }
}
