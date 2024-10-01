package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6750 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String result = "YES";
        for (int i = 0; i < input.length(); i++) {
            String c = String.valueOf(input.charAt(i));
            if(!(c.equals("I") || c.equals("O")|| c.equals("S")|| c.equals("H")|| c.equals("Z")|| c.equals("X")|| c.equals("N"))) {
                result = "NO";
                break;
            }
        }
        bw.write(result);

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}