package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]),
            b = Integer.parseInt(input[1]),
            c = Integer.parseInt(input[2]);
        if(a == b + c) bw.write(a+"="+b+"+"+c);
        else if(a == b - c) bw.write(a+"="+b+"-"+c);
        else if(a == b * c) bw.write(a+"="+b+"*"+c);
        else if(a == b / c) bw.write(a+"="+b+"/"+c);
        else if(c == a + b) bw.write(a+"+"+b+"="+c);
        else if(c == a - b) bw.write(a+"-"+b+"="+c);
        else if(c == a * b) bw.write(a+"*"+b+"="+c);
        else if(c == a / b) bw.write(a+"/"+b+"="+c);


        bw.flush();
        bw.close();
    }
}
