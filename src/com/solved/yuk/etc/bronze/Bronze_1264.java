package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            String input = br.readLine();
            if(input.equals("#")) break;
            input = input.toLowerCase().replaceAll(" ","");
            int count = 0;
            for(int i = 0 ; i < input.length(); i ++){
                if(input.charAt(i) == 'i' || input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'o' || input.charAt(i) == 'u') count++;
            }
            bw.write(count+"\n");
        }


        bw.flush();
        bw.close();
    }
}
