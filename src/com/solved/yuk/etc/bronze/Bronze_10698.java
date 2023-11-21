package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10698 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()), x, y, sum, result;
        String cal, input[];
        for (int i = 0; i < n; i ++){
            bw.write("Case " + (i+1) + ": ");

            input = br.readLine().split(" ");
            x = Integer.parseInt(input[0]);
            y = Integer.parseInt(input[2]);

            result = Integer.parseInt(input[4]);
            cal = input[1];

            if("+".equals(cal)) sum = x+y;
            else sum = x-y;

            if(sum == result) bw.write("YES\n");
            else bw.write("NO\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
