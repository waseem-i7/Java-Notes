package JavaNotes.Arrays;

public class PracticSet {
    public static void main(String[] args) {

        //Question 1
        /* float[] arr = {12.5f,34.0f,32.4f,43.5f};
        float sum = 0;
        for (float element : arr){
            sum = sum+element;
        }
        for (int i =0 ; i< arr.length ; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);*/

        //Question 2
//        int[] arr = {1,3,5,7,9,6};
//        int n = 10;
//
//        for (int element : arr){
//            if (element==n){
//                System.out.println("Present");
//            }else {
//                System.out.println("Not Present");
//            }
//        }

        //Question 3
//        int[] marks = {56,76,87,90,40};
//        int sum = 0;
//        for (int element : marks){
//            sum += element;
//        }
//        int averageMarks = sum/marks.length;
//        System.out.println(averageMarks);


        //Question 4
//        int[][] mat1 = {{2,5,1},
//                        {3,6,2}};
//
//        int[][] mat2 = {{4,1,9},
//                        {5,3,10}};
//
//
//        int[][] mat3 = {{0,0,0},
//                        {0,0,0}};
//
//
//        for(int i=0; i<=mat1.length-1 ; i++){
//             for(int j=0; j<=mat1[i].length-1 ; j++){
//                 mat3[i][j] = mat1[i][j]+mat2[i][j];
//             }
//         }
//
//
//         for(int i=0; i<=mat3.length-1 ; i++){
//             for(int j=0; j<=mat3[i].length-1 ; j++){
//                 System.out.print(mat3[i][j]+" ");
//             }
//             System.out.println();
//         }

        //Question 5
//         int[] arr = {56,76,87,90,40};
//         int n= arr.length/2;
//         int l = arr.length;
//         for (int i =0 ; i<n ; i++){
//             int temp = arr[i];
//             arr[i] = arr[l-i-1];
//             arr[l-i-1] = temp;
//         }
//
//         for (int element : arr){
//             System.out.print(element+" ");
//         }

//        int maxValue = Integer.MAX_VALUE;
//        int minvalue = Integer.MIN_VALUE;
//        System.out.println(minvalue);
//        System.out.println(maxValue);

        //Question 6
//        int[] arr = {56,76,87,90,40,-29};
//        int max = Integer.MIN_VALUE;
//        for (int e: arr) {
//            if (e>max){
//                max =e;
//            }
//        }
//        System.out.println("Max value in array is "+max);

       //Question 7
//        int[] arr = {56,76,87,90,40};
//        int min = Integer.MAX_VALUE;
//        for (int e: arr) {
//            if (e<min){
//                min =e;
//            }
//        }
//        System.out.println("Min value in array is "+min);


       // Question 8
        int[] arr = {10,20,30,40,50};
        boolean isArraySorted = true;
        for (int i = 0 ; i<arr.length-1 ; i++) {
            if (arr[i]>arr[i+1]){
                isArraySorted = false;
                System.out.println("Not Sorted");
                return;
            }
        }
        if (isArraySorted){
            System.out.println("Sorted");
        }

    }
}
