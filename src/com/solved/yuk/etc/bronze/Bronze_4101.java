package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!(input = br.readLine()).equals("0 0")){
            if(Integer.parseInt(input.split(" ")[0])>Integer.parseInt(input.split(" ")[1])) bw.write("Yes");
            else bw.write("No");
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
