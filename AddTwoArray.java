import java.util.*;

public class AddTwoArray {
    //add to Array

    public static void main(String[] args) {
        int[] a = {51, 16, 33, 2, 14, 21};
        int[] b = {33, 9, 56, 21, 39, 21};

        int[] c = new int[a.length];

        if(a.length == b.length){
            for (int i=0, j=0, k=0; i<a.length; i++,j++,k++){
                c[k] = a[i] + b[j];
            }
            System.out.print("Add Array List --> ");
            System.out.println(Arrays.toString(c));
        } else {
            System.out.println("length of both array not equal");
        }
    }
}

