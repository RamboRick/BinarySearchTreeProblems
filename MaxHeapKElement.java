package basic06;
import java.util.*;
public class MaxHeapKElement {
    public List<Integer> mink(int[] array, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<k; i++){
            maxHeap.offer(array[i]);
        }

        for(int i = k; i < array.length;i++){
            if(array[i] < maxHeap.peek()){
                maxHeap.offer(array[i]);
                maxHeap.poll();
            }
        }
        List<Integer> res = new ArrayList<>();
        while(!maxHeap.isEmpty()){
            res.add(maxHeap.poll());
        }
        return res;
    }
}
