
/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
    Node node = head;
    if( head == null){
        return;
    }
    ArrayList<Integer> l = new ArrayList<Integer>();
    while (node.next != null){
        l.add(node.data);
        node = node.next;
    }
    l.add(node.data);
    
    Collections.reverse(l);
    for (int i =0; i<l.size(); i++){
        System.out.println(l.get(i));
    } 
    //System.out.println();
    

}
