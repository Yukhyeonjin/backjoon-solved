package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16727 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int p1 = Integer.parseInt(input[0]),
            s1 = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int p2 = Integer.parseInt(input[1]),
            s2 = Integer.parseInt(input[0]),
            p = p1+p2, s = s1+s2;
        if(p > s) {
            bw.write("Persepolis");
        }
        else if(p < s) {
            bw.write("Esteghlal");
        }
        else {
            if(s1 > p2) bw.write("Esteghlal");
            else if(s1 < p2) bw.write("Persepolis");
            else bw.write("Penalty");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

