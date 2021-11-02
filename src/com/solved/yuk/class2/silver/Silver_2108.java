package com.solved.yuk.class2.silver;

import java.io.*;
import java.util.*;

public class Silver_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class2
        int N = Integer.parseInt(br.readLine());
        int sum = 0, centerNumber, manyNumber, min = 4001, max = -4001;
        List<Integer> centerList = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxCount = 0;
        for(int i = 0; i < N; i ++){
            int number = Integer.parseInt(br.readLine());
            sum+=number;
            max = Math.max(number, max);
            min = Math.min(number, min);
            centerList.add(number);
            map.put(number, map.get(number) == null? 1 : map.get(number)+1);
            maxCount = Math.max(map.get(number), maxCount);
        }
        Collections.sort(centerList);
        centerNumber = centerList.get(centerList.size()/2);
        Iterator<Integer> itr = map.keySet().iterator();
        List<Integer> list = new ArrayList<Integer>();
        while (itr.hasNext()){
            int key = itr.next();
            int number = map.get(key);
            if(number == maxCount) list.add(key);
        }
        if(list.size() > 1) {
            Collections.sort(list);
            manyNumber = list.get(1);
        }else manyNumber = list.get(0);

        int avg = Math.round((float)sum/N), rangeNumber = max-min;
        bw.write(avg + "\n" + centerNumber + "\n" + manyNumber + "\n" + (max-min));

        bw.flush();
        bw.close();
    }
}
