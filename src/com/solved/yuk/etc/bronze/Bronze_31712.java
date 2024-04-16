package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31712 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int cu = Integer.parseInt(input[0]);
        int du = Integer.parseInt(input[1]);
        int fs = 0;
        input = br.readLine().split(" ");
        int cd = Integer.parseInt(input[0]);
        int dd = Integer.parseInt(input[1]);
        int ss = 0;
        input = br.readLine().split(" ");
        int cp = Integer.parseInt(input[0]);
        int dp = Integer.parseInt(input[1]);
        int ts = 0;

        int hp = Integer.parseInt(br.readLine()), sec = 0;
        hp -= du+dd+dp;
        if(hp <= 0) bw.write(sec+"");
        else {
            while (true){
                sec++;
                fs++;
                ss++;
                ts++;
                if(fs == cu) {
                    hp -= du;
                    fs = 0;
                }
                if(ss == cd) {
                    hp -= dd;
                    ss = 0;
                }
                if(ts == cp) {
                    hp -= dp;
                    ts = 0;
                }
                if(hp <= 0) break;
            }
            bw.write(sec+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
