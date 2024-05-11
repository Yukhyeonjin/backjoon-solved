package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31775 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isK = false, isL = false, isP = false;
        for (int i = 0; i < 3; i ++){
            String input = br.readLine();
            char c = input.charAt(0);
            if(c == 'k') isK = true;
            else if(c == 'l') isL = true;
            else if(c == 'p') isP = true;
        }
        if(isK && isL && isP) bw.write("GLOBAL");
        else bw.write("PONIX");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
