package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32722 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int third = Integer.parseInt(br.readLine());
        if((first == 1 || first == 3) && (second == 6 || second == 8) && (third == 2 || third == 5)) {
            bw.write("JAH");
        }
        else bw.write("EI");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
