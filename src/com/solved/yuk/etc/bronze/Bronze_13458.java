package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int A; long sum = 0;
        String input[] = br.readLine().split(" "),
               BAndC[] = br.readLine().split(" ");
        int B = Integer.parseInt(BAndC[0]),
            C = Integer.parseInt(BAndC[1]);
        for(int i = 0; i < N; i ++){
            A = Integer.parseInt(input[i]);
            if(A <= B) sum += 1;
            else {
                A = A - B;
                sum++;
                if(A%C == 0){
                    sum = sum + (A/C);
                }
                else{
                    sum = sum + ((A/C)+1);
                }
            }
        }
        bw.write(sum+"");



        bw.flush();
        bw.close();
    }
}
