package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_27434 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.valueOf(br.readLine());
        bw.write(fact(1,N)+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static BigInteger fact(int a,int n){
        BigInteger ret=BigInteger.valueOf(a);

        if(a<n){
            int b=(a+n)/2;
            ret=fact(a,b).multiply(fact(b+1,n)); //두개로 나눠서 풀이
        }
        return ret;
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

