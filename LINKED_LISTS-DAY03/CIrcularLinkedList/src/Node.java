public class Node
{
    int data;
    Node next;//self reference
    Node(int data)
    {
        this.data=data;
        this.next=null;//address of other Node
    }

}
