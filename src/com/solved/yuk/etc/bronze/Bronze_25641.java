package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25641 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()),
            sLen, tLen;
        String input = br.readLine(), st[] = input.split("");
        tLen = input.replaceAll("s","").length();
        sLen = input.replaceAll("t","").length();
        if(sLen == tLen) {
            bw.write(input);
        }
        else {
            int start = 0;
            for (int i = 0; i < st.length-1; i ++){
                if(st[i].equals("s")) sLen--;
                else if(st[i].equals("t")) tLen--;
                if(sLen == tLen) {
                    start = i+1;
                    break;
                }
            }
            for (int i = start; i < st.length; i ++){
                bw.write(st[i]);
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
