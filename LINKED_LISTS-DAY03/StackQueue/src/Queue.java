

import java.util.Scanner;

public class Queue {

    int queue[],front,rear,MaxSize;

    void createQueue(int size)
    {
        MaxSize=size;
        queue=new int[MaxSize];
        front=0;
        rear=-1;

    }
    void enqueue(int e)
    {
        rear++;
        queue[rear]=e;

    }
    int dequeue()
    {
        int temp=queue[front];
        front++;
        return temp;

    }
    void printqueue()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(queue[i]);
        }
    }

    Boolean is_full()
    {
        if(rear==MaxSize-1)
            return true;
        else
            return false;

    }
    Boolean is_empty()
    {
        if(front>rear)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the queue");
        int size=sc.nextInt();




    }

}