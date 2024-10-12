package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32209 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Q = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        for (int i = 0; i < Q; i ++){
            String input[] = br.readLine().split(" ");
            int event = Integer.parseInt(input[0]);
            if(event == 1) {
                x += Integer.parseInt(input[1]);
            }
            else {
                y = Integer.parseInt(input[1]);
                x -= y;
                if( x < 0 ) break;
            }
        }
        if(x < 0) bw.write("Adios");
        else bw.write("See you next month");


        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}