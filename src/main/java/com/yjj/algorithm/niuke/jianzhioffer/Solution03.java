package com.yjj.algorithm.niuke.jianzhioffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: YinJunJie
 * @date: 2020/5/16 21:16
 * @description:
 */
public class Solution03 {
    public static void main(String[] args) {
        ListNode n1=new ListNode(1);
        ListNode n2 =new ListNode(2);
        ListNode n3 =new ListNode(3);
        ListNode n4 =new ListNode(4);
        ListNode n5 =new ListNode(5);
        ListNode n6 =new ListNode(6);
        ListNode n7 =new ListNode(7);
        ListNode n8 =new ListNode(8);
        ListNode n9 =new ListNode(9);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        n8.next=n9;
        List list=printListFromTailToHead(n1);
        System.out.println(list);
    }
    // 1->2->3->4->5->6->7->8
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList=new ArrayList();
        ListNode res=  reverseListNode(listNode,listNode.next);
       listNode.next=null;
       do {
           arrayList.add(res.val);
           res=res.next;
       }
        while (res!=null);
        return arrayList;
    }

    public static ListNode reverseListNode(ListNode pre,ListNode next){
        while (next!=null){
            if (next.next!=null){
                ListNode nextNext=next.next;
                next.next=pre;
                return reverseListNode(next,nextNext);
            }else {
                next.next=pre;
                return next;
            }
        }
        return pre;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

