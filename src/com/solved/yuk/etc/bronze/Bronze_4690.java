package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_4690 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int a = 2; a <= 100; a++){
            for(int b = 2; b <= a; b++){
                for(int c = b; c <= a; c++){
                    for(int d = c; d <= a; d++) {
                        if(a*a*a == b*b*b + c*c*c + d*d*d){
                            bw.write("Cube = " + a + ", Triple = (" + b+","+c+","+d+")\n");
                        }
                    }
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }

}