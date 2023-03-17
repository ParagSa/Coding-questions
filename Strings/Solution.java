import java.io.*;
import java.util.*;

public class Solution {
    int front;
    int rear;
    static int que[];
    Solution(int max){
        que = new int[max];
        rear = -1;
        front = -1;
    }
    boolean isEmpty(){
        if(front == -1){
            return true;
        }else{
            return false;
        }
    }
    boolean isFull(){
        if(front == 0 && rear == que.length-1){
            return true;
        }else{
            return false;
        }
    }
    void insert(int data){
        if(isFull()){
           return;
        }
        else{
            if(front == -1){
                front = 0;
            }
            rear++;
            que[rear] = data;
            
        }
    }
    void delete(){
        if(isEmpty()){
             System.out.println("Queue is empty");

        }else{
            if(front>=rear){
                front = -1;
                rear = -1;
            }else{
                front++;
            }
        }
    }
    void display(){
        for(int i = front;i<=rear;i++){
            System.out.print("->"+que[i]);
        }
    }

    public static void main(String[] args) {
        int input;
        int j = 1;
        Solution s = new Solution(50);
        /*Solution s = new Solution(50);
        s.insert(10);
        s.insert(20);
        s.insert(30);
        s.display();
        System.out.println();
        s.delete();
        s.display();*/
        Scanner sc = new Scanner(System.in);
        int n;// = sc.nextInt();
        do{
            n = sc.nextInt();
            switch(n){
            case 1:
                input =  sc.nextInt();
                s.insert(input);
                break;
            case 2:
                s.delete();
                break;
            case 3:
                s.display();
                System.out.println();
                break;     
                
           }
        }
        while(j != 0);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}