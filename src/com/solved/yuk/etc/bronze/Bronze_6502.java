package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6502 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[];
        double r,w,l; int i = 1;
        while (true) {
            input = br.readLine().split(" ");
            if("0".equals(input[0])) break;
            r = Double.parseDouble(input[0]);
            w = Double.parseDouble(input[1]);
            l = Double.parseDouble(input[2]);
            if(r >= Math.sqrt(l/2 * l/2 + w/2 * w/2)){
                bw.write("Pizza " + i + " fits on the table.\n");
            }
            else {
                bw.write("Pizza "+ i + " does not fit on the table.\n");
            }
            i++;
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}