package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26546 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i ++){
            String input[] = br.readLine().split(" ");
            int x = Integer.parseInt(input[1]);
            int y = Integer.parseInt(input[2]);
            for(int j = 0; j < input[0].length(); j ++){
                if( j >= x && j < y){}
                else bw.write(String.valueOf(input[0].charAt(j)));
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
