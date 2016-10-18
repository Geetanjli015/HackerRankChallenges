/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
    Node nodeNew = new Node();
    nodeNew.data = data;
    if (null == head){
        nodeNew.next = null;
        return nodeNew;
    }
    Node node = head;
    while(null != node.next){
        node=node.next;
    }
        node.next=nodeNew;
        nodeNew.next = null;
        return head;
// This is a "method-only" submission. 
// You only need to complete this method. 
  
}
