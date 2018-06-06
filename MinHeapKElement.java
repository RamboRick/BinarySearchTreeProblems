package basic06;
import java.util.*;
public class MinHeapKElement {
    public List<Integer> minK(int[] array, int k){
        List<Integer> list= new ArrayList<>();
        for(int a : array){
            list.add(a);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(list);

        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < k; i++){
            res.add(minHeap.poll());
        }
        return res;
    }
}
