package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26592 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i ++){
            String input[] = br.readLine().split(" ");
            double area = Double.parseDouble(input[0]);
            double base = Double.parseDouble(input[1]);

            double height = area * 2 / base;
            bw.write(String.format("The height of the triangle is %.2f units",height));
            bw.newLine();
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
