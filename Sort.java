public class Sort{
    public static void main(String args[]){
        int num [] = {1,4,7,5,6,8,10,9,3,2};
        int a, b, d, i;
        int size;

        size = 10; //number of elements to sort

        //display original array
        System.out.print("Original array is: ");
        for ( i = 0; i <= size; i++ )
        System.out.print(" " + num[i]);
        System.out.println();

        //This is a bubble sort
        for(a = 1; a < size; a++)
        for(b = size - 1; b >= a; b--) {
            if (num[b-1] > num[b]) //if out of order
            //exchange elements
            d = num[b-1];
            num[b-1] = num[b];
            //num[b] = d;
        }

        //display sorted array
        System.out.print("Sorted array is: ");
        for( i = 0; i < size; i++)
        System.out.print(" " + num[i]);
        System.out.println(); 
    }
}