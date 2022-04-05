package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        for(int i = 0; i < line.length(); i ++){
            char ch = line.charAt(i);
            if(!(ch == 'C' || ch == 'A' || ch == 'M' || ch == 'B' || ch == 'R' || ch == 'I' || ch == 'D' || ch == 'G' || ch == 'E')){
                bw.write(ch);
            }

        }

        bw.flush();
        bw.close();
    }
}
