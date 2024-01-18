public class Copying_Array {

    static void printArray(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args){

        int[] arr_1 = new int[5];
        arr_1[0] = 3;
        arr_1[1] = 6;
        arr_1[2] = 9;
        arr_1[3] = 5;
        arr_1[4] = 0;
        System.out.println("original array");
        printArray(arr_1);

        int[] arr_2 = arr_1.clone();
        System.out.println("array after copying");
        printArray(arr_2);

        //Changing some values of array arr_2
        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("original array after changing values in arr_2");
        printArray(arr_1);

        System.out.println("copying array after changing values in arr_2");
        printArray(arr_2);


        }
    }


