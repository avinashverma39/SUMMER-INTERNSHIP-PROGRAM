package DAY_12;

//Program to create binary Search 
public class methodBinary {

    boolean elementPresent(int arr[], int tar) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == tar) {
                return true;
            } else if (arr[mid] < tar) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return false;
    }



    public static void main(String[] args) {

        methodBinary obj = new methodBinary();
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        int tar = 2;
        System.out.println(obj.elementPresent(arr, tar));
        // return index of the element if found

    }

}
