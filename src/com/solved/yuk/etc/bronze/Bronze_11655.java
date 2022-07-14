package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // a : 97, z : 122, A : 65, Z : 90
        String input = br.readLine();
        for(int i = 0; i <input.length(); i ++){
            char c = input.charAt(i);
            int cLen = (int)c;
            if(cLen+13 > 122 && cLen >= 97 && cLen <= 122){
                c = (char)(cLen+13 - 122 + 96);
            }
            else if(cLen+13 > 90 && cLen >= 65 && cLen <= 90){
                c = (char)(cLen+13 - 90 + 64);
            }
            else if(!(cLen >= (int)('0') && cLen <= (int)('9')) && c != ' ') {
                c = (char)(cLen + 13);
            }
            bw.write(c+"");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
