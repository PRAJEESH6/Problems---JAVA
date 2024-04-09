class rotate{
    public static void main(String args[])
    {
        System.out.println("WELCOME PRAJEESH");

        rotate2 list = new rotate2();

        list.InsertAtEnd(100); 
        list.InsertAtEnd(200);
        list.InsertAtEnd(300);
        list.InsertAtEnd(400);
        list.InsertAtEnd(500);
        list.InsertAtEnd(600);
        list.InsertAtEnd(700);

        list.display();

        list.RotateLinkedLis(4);

        list.display();
    }
}