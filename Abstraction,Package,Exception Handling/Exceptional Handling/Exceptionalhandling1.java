import java.util.Scanner;

class Exceptionalhandling1{
    public static void main(String[] args) {
       
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements in the array: ");
            int n = sc.nextInt();
            System.out.println("Enter the elements in the array");
            int a[] = new int[n];


       
            for(int i = 0; i < n; i++){
                if(sc.hasNextInt()){
               a[i] = sc.nextInt();}
               else{
                   throw new NumberFormatException();
               }}
            
            System.out.println("Enter the index of the array element you want to access: ");
            int m = sc.nextInt();
           
            System.out.println("The array element at index "+m+" = "+a[m]);
        
        
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getClass());
        }
        catch(NumberFormatException e ){

            System.out.println(e);
        }
    }
}