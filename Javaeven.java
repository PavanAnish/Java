import java.util.Scanner;

class SumOfEven{    
    public static void main(String [] args){
            int [] arr = new int [20];
            int num;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of elements");
            num = sc.nextInt();
            for(int i=0;i<num;i++){
                    System.out.print("Enter number");
                    arr[i] = sc.nextInt();
            }

            System.out.print("");
            for(int i=0;i<num;i++){
                if (arr[i]%2==0){
                    System.out.println(arr[i]);
                }
                
                    
            }

        
            
            


    }


}