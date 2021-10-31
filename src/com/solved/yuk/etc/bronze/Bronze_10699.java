package com.solved.yuk.etc.bronze;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bronze_10699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Date dt = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("YYYY-MM-dd");
        bw.write(ft.format(dt));


        bw.flush();
        bw.close();

    }
}
