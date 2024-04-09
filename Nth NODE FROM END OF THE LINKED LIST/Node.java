class Node{
    public static void main(String args[])
    {
        System.out.println("WELCOME PRAJEESH");

        Nth_NOde list = new Nth_NOde();

        list.InsertAtBegining(10);
        list.InsertAtBegining(20);
        list.InsertAtBegining(30);
        list.InsertAtBegining(40);
        list.InsertAtBegining(50);
        list.InsertAtBegining(60);
        list.InsertAtBegining(200);

        list.display();

        System.out.println("   ");

        list.InsertAtEnd(100);
        list.display();

        System.out.println("   ");

        list.InsertInMiddle(1000, 4);
        list.display();

        list.Nth_Node_ListData(4);
        list.display();

        System.out.println("   ");
    }

}