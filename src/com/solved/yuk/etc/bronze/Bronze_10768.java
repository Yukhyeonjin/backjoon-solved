package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10768 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int before = Integer.parseInt(br.readLine()),
            after = Integer.parseInt(br.readLine());
        if(before == 2 && after == 18){
            bw.write("Special");
        }else if(before < 2 || (before == 2 && after < 18)) bw.write("Before");
        else bw.write("After");

        bw.flush();
        bw.close();
    }
}
