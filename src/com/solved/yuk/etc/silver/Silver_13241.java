package com.solved.yuk.etc.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Silver_13241 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        long A = Long.parseLong(input[0]),
             B = Long.parseLong(input[1]);
        bw.write(A*B/gcd(A,B)+"");

        bw.flush();
        br.close();
        bw.close();
    }

    static long gcd (long a, long b){
        if(b == 0) {
            return a;
        }
        else {
            return gcd(b ,a % b);
        }
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
