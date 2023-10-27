public class FizzBazz {
    public static void main (String [] args){
        //start of the loop
        for (int x=0;x<=100;x++){
            //our conditional statements
            if(((x%3)==0 && (x%5)==0)){
                System.out.println("FizzBuzz: "+ x);
            } else if((x%3)==0){
                System.out.println("Fizz: "+ x);
            } else if((x%5)==0){
                System.out.println("Buzz: "+ x);
            } else {
                System.out.println("None of the two: "+ x);
            }
        }
    }
    
}
