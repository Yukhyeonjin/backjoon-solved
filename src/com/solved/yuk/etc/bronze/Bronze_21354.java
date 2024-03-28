package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_21354 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int apple = Integer.parseInt(input[0]) * 7;
        int pear = Integer.parseInt(input[1]) * 13;
        if(apple > pear) bw.write("Axel");
        else if(apple < pear) bw.write("Petra");
        else bw.write("lika");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
