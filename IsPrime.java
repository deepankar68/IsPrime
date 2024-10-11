import java.util.*;
public class IsPrime {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many nums you want to take: ");
        int t = input.nextInt();
        System.out.print("Enter nums separeted by white space: ");
        for(int i = 0; i<t; i++){
        int n = input.nextInt();
        int count = 0;
        for(int div = 1; div <= n; div++){
            if(n % div == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime")
        }
        }


        
    }
}