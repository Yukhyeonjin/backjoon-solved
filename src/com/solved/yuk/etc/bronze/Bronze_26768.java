package com.solved.yuk.etc.bronze;

import java.util.Map;
import java.util.HashMap;
import java.io.*;

public class Bronze_26768 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String result = "";
        char c;
        for(int i = 0; i < input.length(); i ++){
            c = input.charAt(i);
            if(c == 'a') result+="4";
            else if(c == 'e') result+="3";
            else if(c == 'i') result+="1";
            else if(c == 'o') result+="0";
            else if(c == 's') result+="5";
            else result+=c;
        }
        bw.write(result);
        


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
