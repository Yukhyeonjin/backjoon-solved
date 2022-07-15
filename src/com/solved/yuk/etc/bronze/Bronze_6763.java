package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6763 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine()),
            B = Integer.parseInt(br.readLine()),
            C = B-A;
        if(C <= 0){
            bw.write("Congratulations, you are within the speed limit!");
        }
        else if(C >= 1 && C <= 20){
            bw.write("You are speeding and your fine is $100.");
        }
        else if(C >= 21 && C <= 30){
            bw.write("You are speeding and your fine is $270.");
        }
        else if(C >= 31){
            bw.write("You are speeding and your fine is $500.");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
