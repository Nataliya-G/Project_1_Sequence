/**
 * Created by User on 18.10.2017.
 */
public class Sequence {

    public static void main(String[] args) {

        int [] a = new int [3];
        for (int i = 0; i < a.length ; i++) {
            a[i] = (int)((Math.random()*9)+1);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] );
        }

         if(a[0] < a[1] && a[1] < a[2]) {
            System.out.println("\nAn increasing sequence");

        } else{
             System.out.println("\nNonincreasing sequence");
         }
    }
    
}


