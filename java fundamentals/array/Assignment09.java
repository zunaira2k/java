import java.util.Scanner;
public class Assignment09 {
    public static void main(String[] args)
    {
        try(Scanner sc= new Scanner(System.in);){
            int n= sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
               
            }
            int[] arr2=new int[n];
            int cnt=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]!=10)
                {
                    arr2[cnt]=arr[i];
                    cnt++;
                }
               
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr2[i]+" ");
               
            }
        }
    }
}
