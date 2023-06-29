package com.solved.yuk.etc.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bronze_26495 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = {"0000\n0  0\n0  0\n0  0\n0000", "   1\n   1\n   1\n   1\n   1",
                        "2222\n   2\n2222\n2\n2222"   , "3333\n   3\n3333\n   3\n3333",
                        "4  4\n4  4\n4444\n   4\n   4", "5555\n5\n5555\n   5\n5555"   ,
                        "6666\n6\n6666\n6  6\n6666"   , "7777\n   7\n   7\n   7\n   7",
                        "8888\n8  8\n8888\n8  8\n8888", "9999\n9  9\n9999\n   9\n   9"},
        input = br.readLine().split("");
        for(int i = 0; i < input.length; i ++){
            bw.write(arr[Integer.parseInt(input[i])]);
            if(i != input.length-1) bw.write("\n\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
