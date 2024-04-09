public class rotate2 {
    
    Node head;

     class Node
    {
        int data;
        Node pointer;

        Node(int val)
        {
             data = val;
             pointer = null;
        }
    }

    rotate2()
    {
      head = null;
    }

    public void InsertAtEnd(int val)
    {
      Node newNode = new Node(val);

        if(head == null)
        {
          head = newNode;
        }else{

          Node temp = head;

          while(temp.pointer != null)
          {
            temp = temp.pointer;
          }

          temp.pointer = newNode;
        }
    }

    public void display()
    {
       Node temp = head;

       while (temp != null) {
        System.out.print(temp.data + "=>");
        temp = temp.pointer;
       }

    }

    public void InsertAtMiddle()
    {

    }

    public void RotateLinkedLis(int k)
    {
      Node temp = head;
      int  Node_length = 1;
      Node Rotate_Head;

      if(head == null || k == 0)
      {
        System.out.println("THE LINKED LIST OR YOUR Kth VALUE IS EMPTY .. PLEASE GIVE THE VALUES..");
      }

      while (Node_length != k) {
        Node_length++;
        temp = temp.pointer;
      }

      Rotate_Head = temp;

      while (temp.pointer != null) {
        temp = temp.pointer;
      }
      temp.pointer = head;

      head = Rotate_Head.pointer;
      Rotate_Head.pointer = null;

      System.out.println(head);

    }
}
