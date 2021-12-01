public class LessonBenary {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target=10;
        int result=BenarySearch(array,target);
        System.out.println(result);
    }

    public static int BenarySearch(int[] array, int target) {
        int low = 0;
        int large = array.length - 1;
        int middle;

        while (low <= large) {
            middle = low + (large - low / 2);
            if (target < array[middle]) {
                large = middle - 1;
            } else if (target > array[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }


        }
        return -1;
    }
    }


