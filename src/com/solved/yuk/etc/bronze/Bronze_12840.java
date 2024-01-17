package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_12840 {
    final static int day = 86400;
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int h = Integer.parseInt(input[0]),
            m = Integer.parseInt(input[1]),
            s = Integer.parseInt(input[2]), q = Integer.parseInt(br.readLine()),
            cur = 3600 * h + 60 * m + s, c;
        for(int i = 0; i < q; i ++){
            input = br.readLine().split(" ");
            if(Integer.parseInt(input[0]) == 1) {
                c = Integer.parseInt(input[1]);
                cur = (cur + c) % day;
            }
            else if(Integer.parseInt(input[0]) == 2) {
                c = Integer.parseInt(input[1]);
                cur = (cur - c) % day;
                while (cur < 0) {
                    cur += day;
                }
            }
            else if(Integer.parseInt(input[0]) == 3) {
                bw.write(cur/3600 + " " + (cur / 60) % 60 + " " + cur % 60 + "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

