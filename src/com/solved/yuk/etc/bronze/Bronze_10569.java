package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10569 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String input[] = br.readLine().split(" ");
            int V = Integer.parseInt(input[0]),
                E = Integer.parseInt(input[1]);
            // V - E + x = 2
            // x = 2 - V + E
            bw.write((2-V+E)+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
