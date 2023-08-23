package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_20232 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String arr[] = {"ITMO","SPbSU","SPbSU","ITMO","ITMO","SPbSU","ITMO","ITMO","ITMO","ITMO","ITMO","PetrSU, ITMO","SPbSU","SPbSU","ITMO","ITMO","ITMO","ITMO","SPbSU","ITMO","ITMO","ITMO","ITMO","SPbSU","ITMO"};
        int year = Integer.parseInt(br.readLine());
        bw.write(arr[year-1995]);


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

