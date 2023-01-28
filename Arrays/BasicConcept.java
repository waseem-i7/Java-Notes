package JavaNotes.Arrays;

public class BasicConcept {

    public static void main(String[] args) {
         // 1 method

//        int [] arr ;    //declaration
//        arr = new int[5];//memory allocation
//        arr[0] = 10;    //initialization
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
        //arr[5] = 60; error ->index out of bounds

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        for (int i = 0  ; i<arr.length ; i++){
//            System.out.println(arr[i]);
//        }
//        for (int item : arr){
//            System.out.println(item);
//        }

        // method 2
//        int arr[] = new int[5];  //declaration + memory allocation
//        arr[1] = 12;
//        arr[4] = 34;
//        for (int item : arr){
//            System.out.println(item);
//        }

        //method 3
        int arr[] = {12,43,53,67,323};  //declaration + memory allocation
        for (int item : arr){
            System.out.println(item);
        }
    }
}
