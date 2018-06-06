package basic06;
import java.util.*;
public class BSTKeys {
    public List<Integer> getRange(TreeNode root, int min, int max){
        List<Integer> list = new ArrayList<>();
        helper(root,min,max,list);
        return list;
    }

    private void helper(TreeNode root,int min, int max, List<Integer> list){
        if(root == null){
            return;
        }
        if(root.value > min) helper(root.left,min,max,list);
        if(min <= root.value && root.value <= max){
            list.add(root.value);
        }
        if(root.value < max) helper(root.right, min, max, list);
    }
}
