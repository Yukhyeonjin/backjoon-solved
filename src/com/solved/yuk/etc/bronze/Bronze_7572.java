package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_7572 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 2014 : G0
        // 2020 : A6
        // 1 : J7
        int n = Integer.parseInt(br.readLine());
        String[] 십간 = {"7","8","9","0","1","2","3","4","5","6"},
                 십이지 = {"J","K","L","A","B","C","D","E","F","G","H","I"};
        bw.write(십이지[n%12-1 == -1 ? 11:n%12-1] + 십간[n%10-1 == -1 ? 9 : n%10-1]);

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

