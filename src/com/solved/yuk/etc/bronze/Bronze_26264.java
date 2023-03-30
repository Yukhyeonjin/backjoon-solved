package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26264 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()),
            length = 0;
        String input = br.readLine();
        length = input.length();
        input = input.replaceAll("security","");
        int sLength = (length - input.length()) / 8;
        int bLength = input.length() / 7;
        bw.write(sLength > bLength ? "security!" : sLength < bLength ? "bigdata?" : "bigdata? security!");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

