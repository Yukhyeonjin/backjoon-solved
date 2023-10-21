package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28808 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" "), line;
        int n = Integer.parseInt(input[0]),
            m = Integer.parseInt(input[1]), result=0;
        for(int i = 0; i < n; i ++){
            line = br.readLine();
            if(line.contains("+")) result++;
        }
        bw.write(result+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
