package com.solved.yuk.etc.bronze;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Bronze_4150 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<BigInteger> list = new ArrayList<BigInteger>();
        list.add(new BigInteger("0"));
        list.add(new BigInteger("1"));
        list.add(new BigInteger("1"));
        int n = Integer.parseInt(br.readLine());
        for(int i = 3; i <= n; i ++){
            list.add(list.get(i-1).add(list.get(i-2)));
        }
        bw.write(list.get(n).toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

