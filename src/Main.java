import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);

        System.out.println("enter the size of queue");
        int n=scan.nextInt();
        Queue a1=new Queue(n);
        System.out.println("----------MENU------------");
        int ch;

        do { System.out.println("1: Insert element in the queue\n2: print Queue\n3:remove Queue\n");
            System.out.println("enter your choice");

            ch=scan.nextInt();

            switch (ch) {
                case 1:
                    a1.insert(scan.nextInt());
                    break;
                case 2:
                    a1.display();
                    break;
                case 3:
                    a1.remove();
                    break;
//                case 4:
//                    a1.delete();
//                    break;
//                case 5:
//                    a1.insertionsort();
//                    break;
//                case 6:
//                    a1.search();
//                    break;
//                case 7:
//                    a1.reverse();
//                    break;
//                case 8:break;
                default:
                    System.out.println("invalid choice");
            }

        }while(ch!=8);


    }
}
