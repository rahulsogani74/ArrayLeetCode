public class AddArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 7};
        int b = 7;

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if ((a[i] + a[j]) == b) {
                System.out.println(i +"-->" + a[i]+","+ j +"-->" +a[j]);
                break;
            } else if ((a[i] + a[j]) < b) {
                i++;
            } else {
                j--;
            }
        }
    }
}
