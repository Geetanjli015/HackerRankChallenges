/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  Node node = head;
    if (position == 0){
      return head.next;
   }
    Node current= node;
    Node previous = current;
    Node nextnode = current;
   for (int i =0; i<position; i++){
       previous = current;
       current = previous.next;
       nextnode = current.next;
   }
    previous.next = nextnode;
    return node;
}


