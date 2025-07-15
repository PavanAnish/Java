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

            //sort
        for (int i=0;i<num;i++){
            for (int j=i+1;j<num;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            System.out.println("Sorted Array:");
            for(int i=0;i<num;i++){
                System.out.print(arr[i] + " ");
            }

            int test = 0;
            for(int i=0;i<num;i++){
                for(int j=i+1;j<num;j++){
                    if(arr[i]!=test){
                    if(arr[i]==arr[j]){
                        System.out.println("Common Element: " + arr[i]);
                        test = arr[i];
                    }
                    
                    }else{
                    continue;
                }
            }
                
                }
                
                }   
            }

                    
            
            






