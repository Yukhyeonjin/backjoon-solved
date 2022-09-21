package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int E = Integer.parseInt(input[0]), // 1 <= E <= 15
            S = Integer.parseInt(input[1]), // 1 <= S <= 28
            M = Integer.parseInt(input[2]); // 1 <= M <= 19
        int e = 1, s = 1, m = 1, year = 1;
        while (true){
            if(E == e && S == s && M == m) break;
            e = e + 1 == 16 ? 1 : e + 1;
            s = s + 1 == 29 ? 1 : s + 1;
            m = m + 1 == 20 ? 1 : m + 1;
            year++;
        }
        bw.write(year+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
