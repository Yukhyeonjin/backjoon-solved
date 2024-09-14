package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11874 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int X = Integer.parseInt(br.readLine());
        for (int i = L; i <= D; i++) {
            if(getSum(i) == X) {
                bw.write(i+"\n");
                break;
            }
        }
        for (int i = D; i >= L; i--) {
            if(getSum(i) == X) {
                bw.write(i+"\n");
                break;
            }
        }


        bw.flush();
        br.close();
        bw.close();
    }
    
    public static int getSum(int num) {
        int sum = 0;
        while (true) {
            if (num == 0) break ;

            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}