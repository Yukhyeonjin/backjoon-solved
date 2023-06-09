package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Bronze_28074 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split("");
        int cnt = 0; Set<String> set = new HashSet<>();
        for(int i = 0; i < input.length; i ++){
            if(input[i].equals("M")) set.add("M");
            else if(input[i].equals("O")) set.add("O");
            else if(input[i].equals("B")) set.add("B");
            else if(input[i].equals("I")) set.add("I");
            else if(input[i].equals("S")) set.add("S");
        }
        if (set.size() == 5) bw.write("YES");
        else bw.write("NO");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

