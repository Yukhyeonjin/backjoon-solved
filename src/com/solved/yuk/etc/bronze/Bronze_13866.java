package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_13866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int[] skill = new int[input.length];
        for(int i = 0; i < skill.length; i ++){
            skill[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(skill);
        bw.write(Math.abs((skill[3]+skill[0]) - (skill[2]+skill[1]))+"");


        bw.flush();
        bw.close();
    }
}
