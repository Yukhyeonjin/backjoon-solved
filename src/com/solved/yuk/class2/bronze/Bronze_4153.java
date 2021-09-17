package com.solved.yuk.class2.bronze;

import java.io.*;

public class Bronze_4153 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt((input[0])),
                y = Integer.parseInt((input[1])),
                z = Integer.parseInt((input[2]));
            if(x + y + z == 0) break;
            int max = Math.max(Math.max(x, y), z);
            if(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2) == 2*Math.pow(max,2)) bw.write("right\n");
            else bw.write("wrong\n");
        }

        bw.flush();
        bw.close();
    }
}
