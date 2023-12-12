package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25286 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), y, m,
            days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] input;
        for(int i = 0; i < T; i ++){
            input = br.readLine().split(" ");
            y = Integer.parseInt(input[0]);
            m = Integer.parseInt(input[1]);
            if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) days[1] = 29;
            else days[1] = 28;

            if(m == 1) bw.write((y-1) + " " + (m+11) + " " + (days[m+10]));
            else bw.write(y + " " + (m-1) + " " + (days[m-2]));
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