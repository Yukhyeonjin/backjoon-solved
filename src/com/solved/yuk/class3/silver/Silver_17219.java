package com.solved.yuk.class3.silver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Silver_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]),
                M = Integer.parseInt(firstLine[1]);
        Map<String, String> pwMap = new HashMap<String, String>();
        String[] domainAndPassword;
        String domain, pw;
        for(int i = 0; i < N; i ++){
            domainAndPassword = br.readLine().split(" ");
            domain = domainAndPassword[0];
            pw = domainAndPassword[1];
            pwMap.put(domain, pw);
        }
        for(int i = 0; i < M; i ++){
            domain = br.readLine();
            bw.write(pwMap.get(domain)+"\n");
        }

        bw.flush();
        bw.close();
    }
}
