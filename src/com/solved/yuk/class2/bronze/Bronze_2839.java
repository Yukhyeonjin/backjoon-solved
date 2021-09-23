package com.solved.yuk.class2.bronze;

import java.io.*;

public class Bronze_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int output = -1;
        if(input % 5 == 0) output = input / 5;
        if(output == -1) {
            int i = 1;
            while (true) {
                if(i*5 >= input) break;
                if((input - i*5) % 3 == 0) {
                    int compareNum = i + ((input - i*5) / 3);
                    if(output == -1) output = compareNum;
                    else if(output >= compareNum) output = compareNum;
                    //System.out.printf("i : %d, output : %d \n", i, output);
                }
                i++;
            }
            if(input % 3 == 0 && output == -1) output = input / 3;
            else if(input % 3 == 0 && input / 3 <= output) output = input / 3;
        }
        bw.write(Integer.toString(output));

        bw.flush();
        bw.close();
    }
}
