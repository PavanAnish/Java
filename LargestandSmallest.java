import java.util.Scanner;

class LargestandSmallest{    
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
            int Lar = arr[0];
	        int Sml = arr[0];	
            for(int i=0;i<num;i++){

                if (Lar >  arr[i]){
                    Lar = arr[i];
                }else if (Sml < arr[i])
                    {Sml = arr[i];
                    }}
            System.out.println("Largest"+Lar);
            System.out.println("Smallest"+Sml);
            

        
            
            


    }


}