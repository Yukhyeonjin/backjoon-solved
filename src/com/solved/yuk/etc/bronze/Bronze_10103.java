package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), A = 100, B = 100, num1, num2;
        String input[];
        for(int i = 0; i < n; i ++){
            input = br.readLine().split(" ");
            num1 = Integer.parseInt(input[0]);
            num2 = Integer.parseInt(input[1]);
            if(num1 > num2){
                B-=num1;
            }else if (num1 < num2) {
                A-=num2;
            }
        }
        bw.write(A+"\n"+B);

        bw.flush();
        bw.close();

    }
}
