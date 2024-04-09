class reversal{
    public static void main(String args[])
    {
        System.out.println("WELCOME PRAJEESH");

        Subreversal L = new Subreversal();

        L.InsertAtBegining(10);
        L.InsertAtBegining(20);
        L.InsertAtBegining(30);
        L.InsertAtBegining(40);
        L.InsertAtBegining(50);

        L.DisplayDatas();
        

        L.ReversalList();
        L.DisplayDatas();
    }
}