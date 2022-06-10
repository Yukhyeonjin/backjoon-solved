package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_14581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String k = ":fan::fan::fan:\n" +
                   ":fan::kkkkkreplkkkkk::fan:\n" +
                   ":fan::fan::fan:";

        k = k.replaceFirst("kkkkkreplkkkkk", br.readLine());
        bw.write(k);

        bw.flush();
        bw.close();
    }
}
