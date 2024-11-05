package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13224 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int ball[] = {1,0,0};
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            int temp;
            if(c == 'A') {
                temp = ball[1];
                ball[1] = ball[0];
                ball[0] = temp;
            }
            else if(c == 'B') {
                temp = ball[2];
                ball[2] = ball[1];
                ball[1] = temp;
            }
            else if(c == 'C') {
                temp = ball[2];
                ball[2] = ball[0];
                ball[0] = temp;
            }
        }
        for (int i = 0; i < 3; i++){
            if(ball[i] == 1) bw.write(i+1+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}