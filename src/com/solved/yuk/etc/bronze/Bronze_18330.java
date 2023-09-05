package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_18330 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()),
            k = Integer.parseInt(br.readLine()), result = 0;
        k += 60;
        if(n > k) {
            result += (k*1500);
            n -= k;
            result += (n*3000);
        } else {
            result += (n*1500);
        }
        bw.write(result+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

