package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while (!"0 0".equals(line = br.readLine())){
            String input[] = line.split(" ");
            int a = Integer.parseInt(input[0]),
                    b = Integer.parseInt(input[1]);
            if(b % a == 0){
                bw.write("factor");
            }
            else if(a % b == 0){
                bw.write("multiple");
            }
            else {
                bw.write("neither");
            }
            bw.newLine();
        }


        bw.flush();
        bw.close();
    }
}