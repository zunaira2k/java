public class assignment03 {
    public static void main(String[] args){
    
        if(args.length == 0){
            System.out.println("No Values");
        }
        
        else{int cnt=1;
            for(String i : args){
            System.out.print(i);
            if(cnt!=args.length){
                System.out.print(",");
                cnt++;
            }
        }
        }
    }
}
