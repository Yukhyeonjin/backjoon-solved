package com.solved.yuk.bronze;

import java.io.*;

public class Bronze_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++) {
            String input = br.readLine();
            int sum = 0;
            int point = 1;
            for(int j = 0; j < input.length(); j ++) {
                if(input.charAt(j) == 'X') {
                    point = 1;
                    continue;
                }
                else {
                    if(j != 0 && input.charAt(j-1) == 'O') point++;
                    sum += point;
                }
            }
            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
    }
}
