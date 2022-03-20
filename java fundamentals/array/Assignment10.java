import java.util.Scanner;
public class Assignment10{
    public static void main(String[] args)
    {
        try(Scanner sc= new Scanner(System.in);){
            int n= sc.nextInt();
            int[] arr=new int[n];
            int[] arrodd=new int[n];
            int[] arreven=new int[n];
            int cnt=0;
            int count=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]%2==0)
                {
                    arreven[cnt]=arr[i];
                    cnt++;
                }
                else{
                    arrodd[count]=arr[i];
                    count++;
                }
            }
            int k=0;
            for(int i=0;i<n;i++){
                if(cnt>i)
                {
                    arr[i]=arreven[i];
                    cnt--;
                }
                else{
                    arr[i]=arrodd[k];
                    k++;
                }

            }
            for(int i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }

        }
    }
}