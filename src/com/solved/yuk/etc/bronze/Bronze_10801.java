package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_10801 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A[] = br.readLine().split(" "),
               B[] = br.readLine().split(" ");
        int aWin = 0, bWin = 0, draw = 0;
        for(int i = 0; i < 10; i ++){
            if(Integer.parseInt(A[i]) > Integer.parseInt(B[i])) aWin++;
            else if(Integer.parseInt(A[i]) < Integer.parseInt(B[i])) bWin++;
            else draw++;
        }
        if(aWin > bWin) bw.write("A");
        else if(aWin < bWin) bw.write("B");
        else bw.write("D");

        bw.flush();
        br.close();
        bw.close();
    }
}
