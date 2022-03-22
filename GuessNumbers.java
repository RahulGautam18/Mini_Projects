import java.util.Scanner;
class GuessNumbers{
    public static void main(String[] args){
        //MINI PROJECT

        Scanner sc = new Scanner(System.in);
       // This is  obj  of  Scanner Class  in java.util.package...

        int myNumber = (int)(Math.random()*100);
		//This is random method of Math Class... 
		
        int userNumber=0;
		//This is int type of variable...

        do{//It's do while loop
            System.out.println("Guess my number..1-100");
            userNumber =sc.nextInt();
            if(userNumber == myNumber){
                System.out.println("YOU Won ...");
                break;
            }
            else if(userNumber>myNumber){
                System.out.println("your number  is too large");
            }
            else{
                System.out.println("your number is too small");
            }
        }while(userNumber>0);
        System.out.println("My number was: ");
        System.out.println(myNumber);
    }

}