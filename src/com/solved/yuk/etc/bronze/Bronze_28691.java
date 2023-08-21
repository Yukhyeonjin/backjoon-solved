package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28691 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        if("M".equals(input)) bw.write("MatKor");
        else if("W".equals(input)) bw.write("WiCys");
        else if("C".equals(input)) bw.write("CyKor");
        else if("A".equals(input)) bw.write("AlKor");
        else if("$".equals(input)) bw.write("$clear");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

