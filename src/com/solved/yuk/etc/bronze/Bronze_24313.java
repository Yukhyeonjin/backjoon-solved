package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Bronze_24313 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        br.close();

        if (a1*n0 + a0 <= c*n0 && c >= a1) { //참인 경우를 if문으로 만들어 작성한 것을 볼 수 있다.
            bw.write("1");
        } else {
            bw.write("0");
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}