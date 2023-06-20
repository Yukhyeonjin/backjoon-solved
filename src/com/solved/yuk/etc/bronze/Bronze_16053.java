package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_16053 {
    static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int k1 = Integer.parseInt(input[0]),
            k2 = Integer.parseInt(input[2]),
            k3 = Integer.parseInt(input[4]);
        String o1 = input[1],
               o2 = input[3];
        int result1 = cal(cal(k1, k2, o1), k3, o2),
            result2 = cal(k1, cal(k2, k3, o2), o1);
        if(result1 > result2) bw.write(result2+"\n"+result1);
        else bw.write(result1+"\n"+result2);

        bw.flush();
        br.close();
        bw.close();
    }

    static int cal (int a, int b, String o){
        int result = 0;
        if("+".equals(o)) result = a + b;
        else if("-".equals(o)) result = a - b;
        else if("*".equals(o)) result = a * b;
        else if("/".equals(o)) result = a / b;
        return result;
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
