class MathOperation{
   
    public static void main(String[] args) throws ArithmeticException, NumberFormatException {
        try{
        if(args.length == 5){
            int[] a = new int[args.length];
            for(int i = 0; i < args.length; i++){
                a[i] = Integer.parseInt(args[i]);
            }
            int sum = 0;
            int avg = 0;
            for(int i = 0; i < args.length; i++){
                sum = sum+ a[i];
            }
            avg = sum/args.length;

            System.out.println("Sum = "+sum+" Average = "+avg);
             
        }
        else{
            System.out.println("Please enter five integer in the command line while executing the code");
        }
        
    }
    catch(NumberFormatException e){
        System.out.println(e);

    }

    catch(ArithmeticException e){
        System.out.println(e);
    }
}
}