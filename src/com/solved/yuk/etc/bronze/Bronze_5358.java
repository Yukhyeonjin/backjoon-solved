package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5358 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while ((input = br.readLine()) != null){
            for (int i = 0; i < input.length(); i ++){
                if(input.charAt(i) == 'i') bw.write("e");
                else if(input.charAt(i) == 'I') bw.write("E");
                else if(input.charAt(i) == 'e') bw.write("i");
                else if(input.charAt(i) == 'E') bw.write("I");
                else bw.write(String.valueOf(input.charAt(i)));
            }
            bw.newLine();
        }



        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

