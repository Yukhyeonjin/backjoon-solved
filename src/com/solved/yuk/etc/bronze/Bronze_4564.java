package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4564 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        String[] input;
        while(!"0".equals(line = br.readLine())) {
            input = line.split("");
            if(input.length == 1 && "0".equals(input[0])) break;
            else if(input.length == 1) {
                bw.write(input[0]+"\n");
                continue;
            }
            bw.write(line+" ");
            while(true) {
                int result = 1;
                for (String s : input) {
                    result *= Integer.parseInt(s);
                }
                bw.write(result+" ");
                if(result < 10) {
                    bw.newLine();
                    break;
                }
                line = String.valueOf(result);
                input = line.split("");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
