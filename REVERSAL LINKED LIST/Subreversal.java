public class Subreversal {
    
    Node head;

    class Node{
        int data;
        Node pointer;
        Node(int val){
            data = val;
            pointer=null;
        }
    }

    Subreversal()
    {
        head = null;
    }

    public void InsertAtBegining(int val)
    {
        
        Node newNode = new Node(val);
        
        if(head == null)
        {
            head = newNode;
        }else{
            newNode.pointer = head;
            head = newNode;
        }
    }

    public void DisplayDatas()
    {
        Node temp = head;
        
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.pointer;
        }
    }

    public void ReversalList()
    {
        Node prev = null;
        Node current = head;
        Node next = current.pointer;

        while (current != null) {
            
            next = current.pointer;
            current.pointer = prev;
            prev = current;
            current = next;
        }

        head = prev; 
    }
}
