package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5692 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            int number = Integer.parseInt(br.readLine());
            int FBnum = 0;
            int count = 0;

            if(number == 0) break;
            for (int i = number ; i > 0; i /= 10) {
                int num = i % 10;
                FBnum += num * factorial(++count);
            }
            bw.write(FBnum+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static int factorial(int count) {
        if(count == 1) return 1;
        return count * factorial(count - 1);
    }
}
