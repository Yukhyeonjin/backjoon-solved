package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;

public class Bronze_30664 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger n;
        while (true){
            n = new BigInteger(br.readLine());
            if(n.equals(new BigInteger("0"))) break;
            else if(n.mod(new BigInteger("42")).toString().equals("0")) bw.write("PREMIADO");
            else bw.write("TENTE NOVAMENTE");
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

