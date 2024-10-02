package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17869 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long n = Long.parseLong(br.readLine());
        int count = 0;
        while (n > 1) {
            if(n % 2 == 0) n /= 2;
            else n +=1;
            count++;
        }
        bw.write(count+"");
        

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}
