package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32184 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        if(A == B) bw.write("1");
        else {
            int cnt = 1;
            int now = A % 2 == 0 ? A+1 : A+2;
            if(B%2 == 1) {
                cnt++;
                B -= 1;
            }

            for (int i = now; i <= B; ){
                cnt++;
                i+=2;
            }
            bw.write(cnt+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}