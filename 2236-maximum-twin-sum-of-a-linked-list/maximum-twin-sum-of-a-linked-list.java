/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 //Approach-1 (Using vector/array)

class Solution {
    public int pairSum(ListNode head) {
        // List<Integer> vec = new ArrayList<>();

        // while (head != null){
        //     vec.add(head.val);
        //     head = head.next;
        // }
        // int i = 0;
        // int j = vec.size()- 1;
        // int result = 0;

        // while(i < j) {
        //     result = Math.max(result, vec.get(i)+ vec.get(j));
        //     i++;
        //     j--;
        // }
        // return result;

//Approach-2 (Using Stack)
        Stack<Integer> st = new Stack<>();
        ListNode curr = head;

        while (curr != null) {
            st.push(curr.val);
            curr = curr.next;
        }

        curr = head;
        int count = 1;
        int n = st.size();
        int result = 0;

        while (count <= n / 2) {
            result = Math.max(result, curr.val + st.peek());
            curr = curr.next;
            st.pop();
            count++;
        }

        return result;
    }
}