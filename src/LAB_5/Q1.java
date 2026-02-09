package LAB_5;

import java.util.Scanner;
import com.LAB5.QueueImpl;

class QueueDemo implements QueueImpl {
    int[] queue = new int[10];
    int front = -1, rear = -1;

    public void insert(int item) {
        if (rear == 9) {
                System.out.println("Queue Overflow");
                return;
        }
            if (front == -1)
                front = 0;
            queue[++rear] = item;
        }
    public void delete() {
            if (front == -1 || front > rear) {
                System.out.println("Queue Underflow");
                return;
            }
            System.out.println("Deleted: " + queue[front++]);
        }

    public void display() {
      if (front == -1 || front > rear) {
                System.out.println("Queue is empty");
                return;
       }
      for (int i = front; i <= rear; i++)
                System.out.print(queue[i] + " ");
            System.out.println();
        }
    }

public class Q1 {
    public static void main(String[] args) {
        QueueDemo q = new QueueDemo();
        System.out.println("Enter the number of items to be inserted");
        int n=new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the number to be inserted");
            int item=new Scanner(System.in).nextInt();
            q.insert(item);
            q.display();
        }
        q.delete();
        q.display();
    }
}
