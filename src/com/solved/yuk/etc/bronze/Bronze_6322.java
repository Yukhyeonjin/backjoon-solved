package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6322 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line, input[];
        int count = 1;
        while (!(line = br.readLine()).equals("0 0 0")){
            input = line.split(" ");
            double a = Double.parseDouble(input[0]),
                   b = Double.parseDouble(input[1]),
                   c = Double.parseDouble(input[2]);
            if(a == -1){
                a = Math.sqrt(Math.pow(c,2)-Math.pow(b,2));
                if(c <= a || c <= b || a + b < c) bw.write("Triangle #"+count+"\nImpossible.\n");
                else bw.write("Triangle #"+count+"\na = "+String.format("%.3f",a)+"\n");
            }else if(b == -1){
                b = Math.sqrt(Math.pow(c,2)-Math.pow(a,2));
                if(c <= a || c <= b || a + b < c) bw.write("Triangle #"+count+"\nImpossible.\n");
                else bw.write("Triangle #"+count+"\nb = "+String.format("%.3f",b)+"\n");
            }else if(c == -1){
                c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
                if(c <= a || c <= b || a + b < c) bw.write("Triangle #"+count+"\nImpossible.\n");
                else bw.write("Triangle #"+count+"\nc = "+String.format("%.3f",c)+"\n");
            }
            count++;
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
