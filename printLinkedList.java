class Solution {
   
    void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data); 
            current = current.next;        
            if (current != null) {          
                System.out.print(" ");
            }
        }
    }
}
