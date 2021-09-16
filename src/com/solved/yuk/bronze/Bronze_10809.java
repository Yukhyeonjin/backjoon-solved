package com.solved.yuk.bronze;

import java.io.*;

public class Bronze_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 97 : a, 122 : z
        String input = br.readLine();
        int[] alphabet = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        for (int i = 0; i < input.length(); i ++) {
            if(alphabet[(int)input.charAt(i) - (int)'a'] != -1) continue;
            alphabet[(int)input.charAt(i) - (int)'a'] = i;
        }
        String output = "";
        for (int i = 0; i < alphabet.length; i ++) {
            output = output + alphabet[i] + " ";
        }
        bw.write(output.trim());

        bw.flush();
        bw.close();
    }
}
