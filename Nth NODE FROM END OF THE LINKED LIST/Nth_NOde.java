public class Nth_NOde {
    
    Node head;

    class Node{
        int data;
        Node pointer;
        Node(int val)
        {
          data = val;
          pointer = null;
        }
    }

    Nth_NOde(){
        head = null;
    }

    public void InsertAtBegining(int val)
    {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        }else{
             newNode.pointer = head;
             head = newNode;
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

    public void InsertAtEnd(int val)
    {

        Node temps = head;
        Node newNode = new Node(val);

        do {
            System.out.print( temps.data + " ");
            temps = temps.pointer;

            if(temps.pointer == null)
            {
                temps.pointer = newNode;
                newNode = null;
            }
        }while (temps != null);
    }

    public void InsertInMiddle(int val , int pos)
    {
        Node newNode = new Node(val);
        Node temp = head;

        for(int i = 0; i < pos; i++){

            temp = temp.pointer;
        }

        newNode.pointer = temp.pointer;
        temp.pointer    = newNode;

    }

    public void Nth_Node_ListData(int k)
    {
        Node starter = head;
        Node ender   = head;

        while(ender != null)
        {
            if(k == 0)
            {
                break;
            }
              ender = ender.pointer;
              k--;
        }

        while (ender != null) {
            
            starter = starter.pointer;
            ender   = ender.pointer;
        }

        System.out.println("***Nth NOde is from END OF LINKED LIST => " +starter.data + " ***");

      //  System.out.println("***Nth NOde is from BEGINING OF LINKED LIST => " + ender.data+ " ***");
    }
}
