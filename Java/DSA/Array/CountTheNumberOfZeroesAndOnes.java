public class CountTheNumberOfZeroesAndOnes {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,2,0,0};
        int countZero=0;
        int countOne=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }
            if(arr[i]==1){
                countOne++;
            }
        }
        System.out.println("Total number of Zeroes: "+countZero);
        System.out.println("Total number of Ones: "+countOne);
    }
}










//     public static void main(String[] args) {
         
//         // // int brr[]=new int[5];
//         // for(int i=0;i<arr.length;i++){
//         //     // brr[i]=arr[i]*10;
//         //     System.out.print(arr[i]*10+" ");
//         //     System.out.println(arr[i]);
//         // }
//         int arr[]={1,2,3,4,5};
//         int a=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>arr[i+1]){
//                 a=arr[i+1];
//                 break;
//             }
//             else if(arr[i]<arr[i+1]){
//                 a=arr[i+1];
//                 break;
//             }
//         }
//         System.out.println("First unsorted element is: "+a);
//     }
// }
