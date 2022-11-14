package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_8723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]),
            b = Integer.parseInt(input[1]),
            c = Integer.parseInt(input[2]);
        
        if(a*a == (b*b + c*c) || b*b == (a*a + c*c) || c*c == (a*a + b*b)) bw.write(1+"");
        else if ((a == b) && (b == c)) bw.write(2+"");
        else bw.write(0+"");
        
        bw.flush();
        br.close();
        bw.close();
    }
}
