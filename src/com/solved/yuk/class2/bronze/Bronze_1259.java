package com.solved.yuk.class2.bronze;

import java.io.*;

public class Bronze_1259 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if(input.equals("0")) break;
            String[] inputArr = input.split("");
            boolean flag = true;
            for(int i = 0; i < inputArr.length/2; i ++) {
                if(inputArr[i].equals(inputArr[inputArr.length-1-i])) continue;
                else {flag = false; break;}
            }
            String output = flag ? "yes" : "no";
            bw.write(output + "\n");
        }

        bw.flush();
        bw.close();
    }
}
