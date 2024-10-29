package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32587 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String A[] = br.readLine().split("");
        String B[] = br.readLine().split("");
        int aWin = 0, bWin = 0;
        for (int i = 0; i < n; i++){
            String a = A[i];
            String b = B[i];
            switch (a) {
                case "R":
                    if (b.equals("S")) aWin++;
                    else if (b.equals("P")) bWin++;
                    break;
                case "S":
                    if (b.equals("P")) aWin++;
                    else if (b.equals("R")) bWin++;
                    break;
                case "P":
                    if (b.equals("R")) aWin++;
                    else if (b.equals("S")) bWin++;
                    break;
            }
        }
        if(aWin > bWin) bw.write("victory");
        else bw.write("defeat");

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}