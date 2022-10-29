package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // C(n+1) = C(n)/2     (C(n)이 짝수일 때)
        //        = 3*C(n)+1   (C(n)이 홀수일 때)

        int n = Integer.parseInt(br.readLine()), count = 1;
        while (true){
            if(n == 1) break;
            if (n % 2 == 0) n /= 2;
            else n = (3*n)+1;
            count++;
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
