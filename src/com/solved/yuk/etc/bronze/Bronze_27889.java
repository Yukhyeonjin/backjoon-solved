package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_27889 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        if("NLCS".equals(input)) bw.write("North London Collegiate School");
        else if("BHA".equals(input)) bw.write("Branksome Hall Asia");
        else if("KIS".equals(input)) bw.write("Korea International School");
        else if("SJA".equals(input)) bw.write("St. Johnsbury Academy");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

