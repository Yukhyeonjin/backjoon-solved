package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Bronze_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input[] = br.readLine().split(" ");
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < input.length; i ++){
            map.put(Integer.parseInt(input[i]), map.get(Integer.parseInt(input[i])) == null ? 1 : map.get(Integer.parseInt(input[i]))+1);
        }
        int number = Integer.parseInt(br.readLine());
        int count = map.get(number) == null ? 0 : map.get(number);
        bw.write(count +"");

        bw.flush();
        bw.close();
    }
}
