/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   Node newN = new Node();
    newN.data = data;
    
    if ((null == head)&&(position == 0)){
       newN.next = null;
       return newN;
   }
    if(position == 0 ){
        newN.next = head;
        return newN;
    }
    Node node = head;
    Node prevNode = head;
    for (int i=0 ; i<position ; i++){
        prevNode = node;
        if (node.next == null){
            break;
        }
        node = node.next;
    }
    prevNode.next = newN;
    newN.next = node;
    return head;
}
