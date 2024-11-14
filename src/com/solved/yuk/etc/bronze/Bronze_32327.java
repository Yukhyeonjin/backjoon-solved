package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32327 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        int size = Integer.parseInt(br.readLine());
        int D;
        while ( (D = Integer.parseInt(br.readLine())) < size ) {
            size += D;
        }
        bw.write(size+"");
        

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}
