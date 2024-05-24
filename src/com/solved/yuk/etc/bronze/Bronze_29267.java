package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_29267 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int now = 0, save = 0;
        String line;
        for(int i = 0; i < n; i++) {
            line = br.readLine();
            if("save".equals(line)) {
                save = now;
            }
            else if("load".equals(line)) {
                now = save;
            }
            else if("shoot".equals(line)) {
                now -= 1;
            }
            else if("ammo".equals(line)) {
                now += k;
            }
            bw.write(now+"");
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
