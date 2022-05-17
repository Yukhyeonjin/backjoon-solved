package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4892 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n0, n1, n2, n3, n4, line = 1;
        while ((n0 = Integer.parseInt(br.readLine())) != 0){
            n1 = 3*n0;
            if(n1 % 2 == 0) {
                n2 = n1 / 2;
                bw.write(line + ". even ");
            }
            else {
                n2 = (n1 + 1) / 2;
                bw.write(line + ". odd ");
            }
            n3 = 3*n2;
            n4 = n3/9;
            bw.write(n4+"\n");
            line++;
        }

        bw.flush();
        bw.close();
    }
}
