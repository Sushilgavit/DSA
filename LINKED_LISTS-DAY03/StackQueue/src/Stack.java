import java.util.Queue;
import java.util.Scanner;

class Stack
{
    int stack[], tos,MaxSize;
    void CreateQueue(int size)
    {
     stack =new int[size];
     MaxSize=size;
     tos=-1;
    }

    void push (int e)
    {
        stack[++tos]=e;
    }
    boolean isFull()
    {
        if (tos==MaxSize-1)
            return true;
        else
            return false    ;

    }

    int pop()
    {
        int temp=stack[tos--];
        return temp;
    }
    boolean isEmpty()
    {
        if(tos==-1)
            return true;
        else
            return false;
    }

    void print_stack()
    {
        for(int i=tos;i>-1;i--)
            System.out.println(stack[i]);
    }



    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of stack");
        int size=sc.nextInt();
        Stack o=new Stack();
        o.CreateQueue(size);

        int ch ;
        do {
            System.out.println(("\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
            ch=sc.nextInt();
                    switch (ch)
                    {
                        case 1:
                            if (!o.isEmpty())
                            {
                                System.out.println("enter the number");
                            }
                    }

        }while (ch!=0);

    }

}

