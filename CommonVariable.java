import java.util.Scanner;

class Common{    
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
                for(int j=i+1;j<num;j++){
                    if(arr[i]==arr[j]){
                        System.out.println("Common Element: " + arr[i]);
                        
                        
                        
                }
                    
                }
                
                    
            }

        
            
            


    }


}
