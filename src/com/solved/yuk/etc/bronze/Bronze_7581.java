package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_7581 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        String input[];
        int a, b, c, d;
        while (!"0 0 0 0".equals(line = br.readLine())) {
            input = line.split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            c = Integer.parseInt(input[2]);
            d = Integer.parseInt(input[3]);
            if(a == 0) {
                a = d/(c*b);
            }
            else if(b == 0) {
                b = d/(c*a);
            }
            else if(c == 0) {
                c = d/(b*a);
            }
            else if(d == 0) {
                d = a*b*c;
            }
            bw.write(a +" " + b + " " + c + " " + d);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

