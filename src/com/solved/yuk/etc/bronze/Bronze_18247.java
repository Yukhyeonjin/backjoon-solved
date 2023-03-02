package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_18247 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = 12;
        int Tcase = Integer.parseInt(br.readLine());

        for(int i = 0; i < Tcase; i++) {
            String input[] = br.readLine().split(" ");

            int N = Integer.parseInt(input[0]);
            //행
            int M = Integer.parseInt(input[1]);
            //열
            if(N < 12 || M < 4) {
                bw.write(-1+"\n");
                //N이 12보다 작고 M이 4보다 작으면
                //성립할 수 없다.
            }
            else {
                int answer = (11 * M) + 4;
                //L 까지의 전체 자석에서  (M-4) 를 뺴주면 L4의 위치가 된다.
                bw.write(answer+"\n");
            }

        }
        bw.flush();
        br.close();
        bw.close();
    }
}
