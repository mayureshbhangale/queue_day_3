public class Queue {
int Queue[];
int front;
int rear;
int size;
int element;
public Queue(int n){
    this.size=n;
    Queue=new int[size];
    front=rear=-1;
}
public void insert(int x){
    if(rear==-1){
        front=rear=0;
        Queue[rear]=x;
    }else if(rear+1>=size){
        System.out.println("Queue Overflow");
    }else
        Queue[++rear]=x;



    }
    public void display(){
    if(rear==-1){
        System.out.println("queue empty");
    }else{
        for(int i=front;i<=rear;i++){
            System.out.println(Queue[i] + " ");
        }
    }
    }
    public int remove(){
    if(rear==-1){
        System.out.println("queue empty");
        return -1;
    }else if(front==rear){
        element=Queue[front];
        front=rear=-1;
        return element;

    }else{
        element=Queue[front];
        front++;
        return element ;
    }
    }
}
