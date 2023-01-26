import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopInterview {
    //Q.1 Two Sum
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    //Q.13 Roman to Integer
    public int romanToInt(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int[] nums = new int[s.length()];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1])
                sum -= nums[i];
            else
                sum += nums[i];

        }
        return sum + nums[nums.length - 1];
    }

    //Q.14 Longest Common Prefix not finished
    public String longestCommonPrefix(String[] strs) {
        String res = "";
//        for (int i = 0; i < strs.length; i++) {
//            String a = strs[i];
//            for (int j = 0; j < strs[i].length(); j++) {
//                char temp = a.charAt()
//                if ( char temp = strs. char )
//            }
//        }
        return res;
    }

    //Q.46 Permutation not finished
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>();

        List<List<Integer>> answer = new ArrayList<>();

        return answer;
    }

    //Q.94 Binary Tree Inorder Traversal
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) { // bottom-top, left to right
        List<Integer> answer = new ArrayList<>();
        inorderHelper(root, answer);
        return answer;
    }

    private void inorderHelper(TreeNode root, List<Integer> answer) { // recursion method with O(n)
        if (root != null) {
            inorderHelper(root.left, answer);
            answer.add(root.val);
            inorderHelper(root.right, answer);
        }
    }

    //Q.104. Maximum Depth of Binary Tree
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    //Q.144 Binary Tree Preorder Traversal
    public List<Integer> preorderTraversal(TreeNode root) { // top-down, left to right
        List<Integer> answer = new ArrayList<>();
        preorderHelper(root, answer);
        return answer;
    }

    private void preorderHelper(TreeNode root, List<Integer> answer){ // recursion method with O(n)
        if(root != null){
            answer.add(root.val);
            preorderHelper(root.left,answer);
            preorderHelper(root.right,answer);
        }
    }

    //Q.237 Delete Node in a Linked List
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    //Q.344 Reverse String
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    //412 Fizz Buzz
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        int i = 1;
        while (i <= n) {
            if (i % 5 == 0 && i % 3 == 0) {
                answer.add("FizzBuzz");
                i++;
            } else if (i % 3 == 0) {
                answer.add("Fizz");
                i++;
            } else if (i % 5 == 0) {
                answer.add("Buzz");
                i++;
            } else {
                answer.add(Integer.toString(i));
                i++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TopInterview sol = new TopInterview();

    }
}
