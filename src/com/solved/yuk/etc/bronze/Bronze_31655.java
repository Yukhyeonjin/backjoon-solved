package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31655 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split("/");
        int AA = Integer.parseInt(input[0]);
        int BB = Integer.parseInt(input[1]);
        int CC = Integer.parseInt(input[2]);

        if(AA <= 12 && BB <= 12) bw.write("either");
        else if(AA > 12) bw.write("EU");
        else if(BB > 12) bw.write("US");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
