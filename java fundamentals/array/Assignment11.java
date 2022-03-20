import java.util.Scanner;
public class Assignment11 {
    public static void main(String[] args){
    try(Scanner sc= new Scanner(System.in);){
        int n= sc.nextInt();
        int[] arr=new int[n];
        boolean ans=true;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
           
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=1 && arr[i]!=4)
            {
                ans=false;
                break;
            }
           
        }
        if(ans)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    }
    }