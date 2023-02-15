package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int JOI = 0, IOI = 0;
        for(int i = 0; i < input.length()-2; i++){
            String str = String.valueOf(input.charAt(i)) + String.valueOf(input.charAt(i+1)) + String.valueOf(input.charAt(i+2));
            if("JOI".equals(str)) JOI++;
            if("IOI".equals(str)) IOI++;
        }
        bw.write(JOI+"\n"+IOI);

        bw.flush();
        br.close();
        bw.close();
    }

}
