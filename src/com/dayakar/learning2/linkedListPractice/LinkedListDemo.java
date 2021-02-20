package com.dayakar.learning2.linkedListPractice;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList llist=new LinkedList();
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.addItems(88);

        System.out.println("\nCreated Linked list is:");
        llist.printList();
        llist.delete(88); // Delete node with data 1

        System.out.println("\nLinked List after Deletion of 88:");
        llist.printList();
        llist.insertAfter(llist.head.next,99);
        System.out.println();
        llist.printList();



    }
}
class LinkedList{
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

     Node head;
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    /* Inserts a new Node at end of the list. */
    public void addItems(int data){
            Node new_node=new Node(data);
        if (head==null){
            head=new_node;
          return;
        }
         new_node.next=null;
        Node temp=head;

        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;

    }

    public void printList(){

        Node temp=head;

        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;

        }
    }


    /* Inserts a new Node at after given node of the list. */
    public void insertAfter(Node previous,int data){

        if (previous==null){
            System.out.println("Previous node cannot be null");
            return;
        }
        Node new_Node=new Node(data);
        new_Node.next=previous.next;
        previous.next=new_Node;

    }

    /* delete a Node with key of the list. */

    public void delete(int key){

        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key)
        {
            head = temp.next; // Changed head
            return;
        }
        while (temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }


        if (temp==null) return;

        prev.next=temp.next;
    }

    public void deleteAt(int position){
        if (head==null){
            return;
        }

        if (position==0){
            head=head.next;
        }



    }

}

