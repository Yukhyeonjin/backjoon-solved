package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze_5176 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine()), p, m[], result;
        String input[];
        while (k != 0){
            input = br.readLine().split(" ");
            p = Integer.parseInt(input[0]); m = new int[Integer.parseInt(input[1])];
            result = p;
            for(int i = 0; i < p; i ++){
                int sheet = Integer.parseInt(br.readLine());
                if(m[sheet-1] == 0) {
                    m[sheet-1] = 1;
                    result--;
                }
            }
            bw.write(result+"\n");
            k--;
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
