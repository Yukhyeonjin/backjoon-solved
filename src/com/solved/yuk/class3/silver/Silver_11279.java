package com.solved.yuk.class3.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Silver_11279 {
    public static List<Integer> heap;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        // 최대 힙 : 트리가 내림차순으로 정렬된 트리
        heap = new ArrayList<>();
        heap.add(0); // 1 인덱스부터 시작하기 위해 0인덱스 0값으로 지정

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            int value = Integer.parseInt(br.readLine());
            if(value == 0){ bw.write(delete()+"\n");
            }else {
                insert(value);
            }
        }


        bw.flush();
        bw.close();
    }

    public static void insert(int value){
        heap.add(value);
        int index = heap.size()-1; // 추가 된 값의 인덱스
        while (index > 1 && heap.get(index/2) < heap.get(index)){ // 인덱스가 루트가 아니며, 부모 노드와의 값 비교 부모 노드 보다 값이 작으면 변경
            int changeValue = heap.get(index/2);
            heap.set(index/2,value);
            heap.set(index,changeValue);
            index = index/2;
        }
    }

    public static int delete(){
        if(heap.size() == 1) return 0;

        int value = heap.get(1);

        //루트 노드 제거 후 최하위 노드를 루트 노드로 이동
        heap.set(1, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        int index = 1; // 이동한 노드의 인덱스
        while (index*2 < heap.size()){ // 노드가 루트가 아닐 경우
            int changeValue = heap.get(index*2),
                changeIndex = index*2; // 자식 왼쪽 노드 인덱스, 왼쪽 노드 값
            if(changeIndex + 1 < heap.size() && changeValue < heap.get(changeIndex+1)){ // 오른쪽 노드가 존재 하면서, 왼쪽 노드보다 오른쪽 노드가 값이 클 때
                changeValue = heap.get(changeIndex+1); // 자식 오른쪽 노드 인덱스
                changeIndex += 1; // 오른쪽 노드 값
            }
            if(heap.get(index) > changeValue) break; // 자식 노드보다 부모 노드 값이 더 크면 break
            int tmp = heap.get(index);
            heap.set(changeIndex, tmp);
            heap.set(index, changeValue);
            index = changeIndex;
        }
        return value;
    }
}
