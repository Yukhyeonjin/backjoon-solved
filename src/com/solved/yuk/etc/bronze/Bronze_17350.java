package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_17350 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        boolean chk = false;
        for(int i = 0;i < N; i++){
            String line = br.readLine();
            if(line.equals("anj")) chk = true;
        }
        if(chk) bw.write("뭐야;\n");
        else bw.write("뭐야?\n");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

