public class EvenOdd {
/*code to print odd, even, or divisable by 4 among numbers from 1 to 100 */
public static void main(String [] args){
     for (int x = 0; x <= 100; x++){
            //System.out.println("Started the loop");
            if((x%2)==0){
                System.out.println("Even Number: "+ x);
            } else if((x%2)==1){
                System.out.println("Odd Number: "+ x);
            }
        }
    }
}

   
