package DAY_12;

//Program for linear search:
class SearchLiner {

    boolean elementPresent(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;

            }
        }

        return false;
    }

    int elementAtIndex(int arr[], int target) {
        for (int i = 0; i < arr.length; i++)

            if (arr[i] == target) {
                return i + 1;
            }
        return -1;

    }

    public static void main(String[] args) {
        SearchLiner obj = new SearchLiner();

        int arr[] = { 10, 20, 30, 40, 50 };
        int target = 40;
        System.out.println(obj.elementAtIndex(arr, target));
        System.out.println(obj.elementPresent(arr, target));
    }

}
