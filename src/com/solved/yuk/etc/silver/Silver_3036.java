package com.solved.yuk.etc.silver;

import java.io.*;
import java.math.BigInteger;

public class Silver_3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input[] = br.readLine().split(" ");
        int firstRing = Integer.parseInt(input[0]);
        for(int i = 1; i < N; i ++){
            int ring = Integer.parseInt(input[i]);
            if(firstRing % ring == 0) bw.write(firstRing / ring+ "/" + "1\n");
            else {
                bw.write(firstRing / gcd(firstRing, ring) + "/"+ring / gcd(firstRing, ring)+"\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

    // 두 수의 최대공약수 구하기
    public static int gcd (int a, int b){
        BigInteger num1 = BigInteger.valueOf(a);
        BigInteger num2 = BigInteger.valueOf(b);
        BigInteger gcd = num1.gcd(num2);

        return gcd.intValue();
    }
}
