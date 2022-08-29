package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        for(int i = 0; i < input.length(); i ++){
            char c = input.charAt(i);
            if(c == 'A') c = 'X';
            else if(c == 'B') c = 'Y';
            else if(c == 'C') c = 'Z';
            else c = (char)((int)(c) - 3);
            bw.write(Character.toString(c));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
