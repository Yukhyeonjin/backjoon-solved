package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26645 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        /*
        * 200 ~ 209 : 8
        * 200 ~ 219 : 4
        * 200 ~ 229 : 2
        * 200 ~ 239 : 1
        * */
        if(N < 206) bw.write("1");
        else if(N < 218) bw.write("2");
        else if(N < 229) bw.write("3");
        else bw.write("4");

        bw.flush();
        br.close();
        bw.close();
    }

}
