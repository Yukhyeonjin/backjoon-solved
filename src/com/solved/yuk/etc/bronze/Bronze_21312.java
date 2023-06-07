package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21312 {
    static int result = 0;

    private static void setResult(int cur) {
        if (result%2==1 && cur%2==0) {
            return;
        }
        if (result%2==0 && cur%2==1) {
            result = cur;
            return;
        }
        if (result < cur)
            result = cur;
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]),
            b = Integer.parseInt(input[1]),
            c = Integer.parseInt(input[2]);

        setResult(a);
        setResult(b);
        setResult(c);
        setResult(a*b);
        setResult(b*c);
        setResult(a*c);
        setResult(a*b*c);
        bw.write(result+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

