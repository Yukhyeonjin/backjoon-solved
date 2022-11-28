package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26082 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]), // 경쟁사 제품의 가격
            B = Integer.parseInt(input[1]), // 경쟁사 제품의 성능
            C = Integer.parseInt(input[2]); // WARBOY 가격
        int x = ((B/A)*3)*C;
        bw.write(x+"");
        

        bw.flush();
        br.close();
        bw.close();
    }
}
