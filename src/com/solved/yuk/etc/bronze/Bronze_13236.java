package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13236 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        while (true){
            bw.write(n+" ");
            if(n == 1) break;
            else if (n % 2 == 0) {
                n /= 2;
            }
            else if (n % 2 == 1) {
                n = (n*3)+1;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
