package BasicQuestion;
public class ReturnSumOfPositiveAndNegativeNumber {
    public static void main(String[] args) {
        int arr[]={2,-4,3,-4,-5,6,7};
        int positiveSum=0;
        int negativeSum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negativeSum+=arr[i];
            }
            if(arr[i]>0){
                positiveSum+=arr[i];
            }
        }
        System.out.println("Sum of positive numbers is: "+positiveSum);
        System.out.println("Sum of negative numbers is: "+negativeSum);
    }
}
