package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32399 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        if("(1)".equals(input)) bw.write("0");
        else if("1()".equals(input)) bw.write("1");
        else if("1)(".equals(input)) bw.write("1");
        else if("()1".equals(input)) bw.write("1");
        else if(")(1".equals(input)) bw.write("1");
        else if(")1(".equals(input)) bw.write("2");


        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}