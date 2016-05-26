import java.util.List;

/**
 * Created by Administrator on 2016/5/25.
 */
public class RemoveNode {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next =null;

        RemoveNode ll =new RemoveNode();

        ListNode l1 = ll.removeNthFromEnd(node1,2);
        while(l1!=null){
            System.out.print(l1.val);
            l1 = l1.next;
        }
    }

   public static ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 1;
        int i=0,j=0;
        ListNode first = head;
        while(head.next!=null) {
            head = head.next;
            length++;
        }
        head = first;

        while(i<(length-n)-1){
            i++;
            head = head.next;
        }
       if(length-n-1<0)
       {
           first =first.next;
       }
       if(head.next!=null) {
           head.next = head.next.next;
           return first;
       }else {
           return null;
       }
   }

//public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        int length  = 0;
//        ListNode first = head;
//        while (first != null) {
//            length++;
//            first = first.next;
//        }
//        length -= n;
//        first = dummy;
//        while (length > 0) {
//            length--;
//            first = first.next;
//        }
//        first.next = first.next.next;
//        return dummy.next;
//    }

//public ListNode removeNthFromEnd(ListNode head, int n){
//
//        int i=0;
//        int length = 1;
//        int j=0;
//        ListNode tmp = head;
//        while (head.next!=null)
//        {
//            head =head.next;
//            length++;
//        }
////        System.out.print(length);
//        head = tmp;
//        if(n==1){
//            while(i<length-1){
//
//                head =head.next;
//                i++;
//            }
//            if(head==tmp)
//                tmp=null;
//            System.out.print(head.val);
//            System.out.print(head.next);
//            head = null;
//        } else{
//            while(j<length-n-1){
//                tmp =tmp.next;
//                j++;
//            }
//            tmp.next =tmp.next.next;
//        }
//        return tmp;
//    }
}

