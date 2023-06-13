package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Bronze_1864 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new HashMap<>();
        map.put("-" ,0);
        map.put("\\",1);
        map.put("(" ,2);
        map.put("@" ,3);
        map.put("?" ,4);
        map.put(">" ,5);
        map.put("&" ,6);
        map.put("%" ,7);
        map.put("/" ,-1);
        String input; int length, sum;
        while (!"#".equals(input = br.readLine())){
            sum = 0;
            length = input.length();
            for(int i = 0; i < length; i ++){
                sum += (map.get(String.valueOf(input.charAt(i))) * Math.pow(8, length-1-i));
            }
            bw.write(sum+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

