package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Bronze_30087 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, String> seminar = new HashMap<>();
        seminar.put("Algorithm","204");
        seminar.put("DataAnalysis","207");
        seminar.put("ArtificialIntelligence","302");
        seminar.put("CyberSecurity","B101");
        seminar.put("Network","303");
        seminar.put("Startup","501");
        seminar.put("TestStrategy","105");
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            bw.write(seminar.get(br.readLine()));
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

