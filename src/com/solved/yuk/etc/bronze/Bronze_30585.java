package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_30585 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int w = Integer.parseInt(input[1]);
        int x = 0, y = 0;
        for (int i = 0; i < h; i++) {
            input = br.readLine().split("");
            for (int j = 0; j < w; j++) {
                if("0".equals(input[j])) x++;
                else y++;
            }
        }
        if(x > y) {
            bw.write(h * w - x + "");
        }
        else {
            bw.write(h * w - y + "");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

