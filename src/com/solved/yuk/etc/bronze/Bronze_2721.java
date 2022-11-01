package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i ++){
            int n = Integer.parseInt(br.readLine()), Tn[] = new int[n+2];
            Tn[0] = 0; Tn[1] = 1;
            for(int j = 2; j <= n+1; j ++){
                Tn[j] = j+Tn[j-1];
            }
            int Wn = 0;
            for(int k = 1; k <= n; k ++){
                Wn = Wn + (k*Tn[k+1]);
            }
            bw.write(Wn+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
