package class3.boj7662;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Boj7662_1n9yun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TC = Integer.parseInt(br.readLine());
        for(int tc=1;tc<=TC;tc++){
            int k = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> doublePriorityQueue = new TreeMap<>();

            for(int i=0;i<k;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());

                if(st.nextToken().equals("I")) {
                    int num = Integer.parseInt(st.nextToken());
                    doublePriorityQueue.put(num, doublePriorityQueue.containsKey(num) ? doublePriorityQueue.get(num) + 1 : 1);
                }else if(!doublePriorityQueue.isEmpty()){
                    Map.Entry<Integer, Integer> firstEntry = doublePriorityQueue.firstEntry();
                    Map.Entry<Integer, Integer> lastEntry = doublePriorityQueue.lastEntry();
                    if(st.nextToken().equals("-1"))
                        if(firstEntry.getValue() > 1) doublePriorityQueue.put(firstEntry.getKey(), firstEntry.getValue() - 1);
                        else doublePriorityQueue.remove(firstEntry.getKey());
                    else {
                        if (lastEntry.getValue() > 1) doublePriorityQueue.put(lastEntry.getKey(), lastEntry.getValue() - 1);
                        else doublePriorityQueue.remove(lastEntry.getKey());
                    }
                }
            }

            System.out.println(doublePriorityQueue.isEmpty() ?
                    "EMPTY" :
                    doublePriorityQueue.lastEntry().getKey() + " " + doublePriorityQueue.firstEntry().getKey());
        }

    }
}
