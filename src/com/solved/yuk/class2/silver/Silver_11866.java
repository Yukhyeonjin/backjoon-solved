package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Silver_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
                K = Integer.parseInt(input[1]),
                pointer = 1;
        Set<Integer> set = new HashSet<Integer>();
        bw.write("<");
        for(int i = 1; i <= N; i ++){
            for(int j = 1; j <= K;){
                if(pointer > N) pointer = 1;
                if(j == K){ // K번째에 도착했을 때
                    if(!set.contains(pointer)) {
                        set.add(pointer);
                        bw.write(Integer.toString(pointer));
                        pointer++;
                        break;
                    }
                }else {
                    if(!set.contains(pointer)) j++;
                }
                pointer++;
            }
            if(i != N) bw.write(", ");
        }
        bw.write(">");

        bw.flush();
        bw.close();
    }
}
