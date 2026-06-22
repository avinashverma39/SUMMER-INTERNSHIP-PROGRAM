package DAY_12;

//Program to create binary Search 
public class methodBinary {

    boolean elementPresent(int arr[], int tar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                return true;
            }

        }

        return false;
    }

    int elementAtEndex(int arr[], int tar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        methodBinary obj = new methodBinary();
        int arr[] = { 2, 3, 4, 5, 6, 7 };
        int tar = 4;
        System.out.println(obj.elementAtEndex(arr, tar));
        System.out.println(obj.elementPresent(arr, tar));
        // return index of the element if found

    }

}
