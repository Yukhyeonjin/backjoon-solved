package com.solved.yuk.etc.silver;

import java.util.*;
import java.io.*;

public class Silver_7785 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Set<String> set = new HashSet<String>();
        int n = Integer.parseInt(br.readLine());
        String input[];
        for(int i = 0; i < n; i ++){
            input = br.readLine().split(" ");
            if("enter".equals(input[1])) {
                if(!set.contains(input[0])) set.add(input[0]);
            }
            else if("leave".equals(input[1])) {
                if(set.contains(input[0])) set.remove(input[0]);
            }
        }
        List<String> list = new ArrayList<String>(set);
        Collections.sort(list, Collections.reverseOrder());
        for(int i = 0; i < list.size(); i ++){
            bw.write(list.get(i)+"\n");
        }
        
        
        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
