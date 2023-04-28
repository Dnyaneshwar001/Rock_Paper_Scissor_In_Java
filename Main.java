import java.util.Scanner;
import java .util.Random;

class rockpaper{
    public static void main(String arrr[])
    {
        System.out.println("0: Rock --> 1:Paper--> 2:scissor ");
        System.out.println("Enter the any number ");
        Scanner sc=new Scanner(System.in);
        int userin=sc.nextInt();

        Random R=new Random();
        int compin=R.nextInt(3);

        if(userin==compin)
        {
            System.out.println("MATCH DRAW");

        }
        else if(userin==0 && compin==2 || userin==1 && compin==0 || userin==2 && compin==1)
        {
            System.out.println("YOU WINN");
        }
        else{
            System.out.println("YOU LOSS");
        }
        System.out.println("COMPUTER CHOICE: "+compin);

    }
}