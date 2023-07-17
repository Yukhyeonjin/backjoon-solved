package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Bronze_28290 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, String> map = new HashMap<>();
        map.put("fdsajkl;", "in-out");
        map.put("jkl;fdsa", "in-out");
        map.put("asdf;lkj", "out-in");
        map.put(";lkjasdf", "out-in");
        map.put("asdfjkl;", "stairs");
        map.put(";lkjfdsa", "reverse");
        String input = br.readLine();
        bw.write(map.containsKey(input) ? map.get(input) : "molu" );

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
