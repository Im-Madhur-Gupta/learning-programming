/**
 * Definition for singly-linked list.
 * public class ListNode1 {
 *     int val;
 *     ListNode1 next;
 *     ListNode1(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class linked_list_1st_common_node {
    public ListNode1 getIntersectionNode(ListNode1 headA, ListNode1 headB) {
        // SOLUTION 1 - Uses the fact that the values in the linked list are only +ive
        // So, if values are made negative as well then this soln won't work/
//         ListNode1 iterA=headA, iterB=headB;
//         while(iterA!=null){ // Marked all nodes of A as -ive/visited.
//             iterA.val*=-1;
//             iterA=iterA.next;
//         }
//         while(iterB!=null){ // checked whether any of B's are -ive/visited if yes then we have found our node
//                             // if no then iterB should hold null.
//             if(iterB.val<0){
//                 break;
//             }
//             iterB=iterB.next;
//         }
//         iterA=headA;
//         while(iterA!=null){ // making whole of A +ive/unvisited again to retain original structure
//             iterA.val*=-1;
//             iterA=iterA.next;
//         }

//         return iterB;

        // SOLUTION 2 - Will work in all cases, ie for all ques. variations.
        int s1=0,s2=0;
        ListNode1 iterA=headA, iterB=headB;
        while(iterA!=null){ // calculating size of A
            s1++;
            iterA=iterA.next;
        }
        while(iterB!=null){ // calculating size of B
            s2++;
            iterB=iterB.next;
        }

        int diff = s1-s2;
        iterA=headA;
        iterB=headB;
        if(diff>0){ // A is longer than B
            for(int i=0;i<diff;i++){
                iterA=iterA.next; // Lambi wali ka pointer diff baar next karna he.
            }
        }
        else if(diff<0){ // B is longer than A
            for(int i=0;i< -1*diff;i++){ // as diff is negative now, I need to multiply it with -1.
                iterB=iterB.next; // Lambi wali ka pointer diff baar next karna he.
            }
        }
        // your pointers will now be at such elements after which the elements left in the linked lists would be same in number.
        while(iterA!=null && iterB!=null){
            if(iterA==iterB){
                return iterA;
            }
            iterA=iterA.next;
            iterB=iterB.next;
        }
        return null;
    }
}