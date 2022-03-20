import java.util.Scanner;
public class Assignment12{
         public static void main(String[] args){
                try(Scanner sc= new Scanner(System.in);){
                    int[] arr=new int[3];
                    int[] arr1=new int[3];
                    int[] ans=new int[2];
                    for(int i=0;i<3;i++)
                    {
                        arr[i]=sc.nextInt();
                       
                    }
                    for(int i=0;i<3;i++)
                    {
                        arr1[i]=sc.nextInt();
                       
                    }
                    ans[0]=arr[1];
                    ans[1]=arr1[1];
                    for(int i=0;i<2;i++)
                    {
                       System.out.print(ans[i]+" ");
                       
                    }
        
        
                }
            }        
        }
    
