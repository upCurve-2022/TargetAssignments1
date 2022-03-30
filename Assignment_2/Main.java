import java.util.Scanner;

public class Main {

    public static void verify (String str) throws NonDeliverable {

        String[] invalidZipCode =new String[]{"113" ,"345" ,"234","453","634"};
        try{
            for(String s : invalidZipCode){
                if(s.equals(str)){
                    throw new NonDeliverable("Cannot be delivered at that zip code please enter a new code.");
                }
            }
            if(str.isEmpty()|| (str.trim()).isEmpty() ){
                throw new NonDeliverable("Invalid zip code . Enter a valid zip code.");
            }
            else{
                System.out.println("Delivery available in your area !!");
            }
        }
        catch (NonDeliverable ex){
            System.out.println("Exception occurred :\n" +ex);
        }


    }

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your zip code : ");

        String zipCode = sc.nextLine();

        try{
            verify(zipCode);
        }
        catch(NonDeliverable ex){
            System.out.println("Invalid zip code");
    }


    }
}
