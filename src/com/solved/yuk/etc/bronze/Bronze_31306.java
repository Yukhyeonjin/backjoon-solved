package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Bronze_31306 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine(); char c;
        int caseOne = 0, caseTwo = 0;
        for (int i = 0; i < input.length(); i++){
            c = input.charAt(i);
            if(c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'){
                caseOne ++;
                caseTwo ++;
            }
            if(c == 'y') caseTwo++;
        }
        bw.write(caseOne + " " + caseTwo);


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}