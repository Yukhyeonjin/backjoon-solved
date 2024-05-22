package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31867 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), odd = 0, even = 0;
        String input[] = br.readLine().split("");
        for(int i = 0; i < N; i ++){
            if(Integer.parseInt(input[i]) % 2 == 0) even++;
            else odd++;
        }
        if(even > odd) bw.write("0");
        else if(even < odd) bw.write("1");
        else bw.write("-1");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
