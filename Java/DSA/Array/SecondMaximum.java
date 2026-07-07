package Array;
public class SecondMaximum {
    public static void main(String[] args) {
        int arr[]={19,10,3,4,53};
        int max=arr[1];
        int max2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
        }
        System.out.println("Second maximum element is : "+max2);
    }
    
}
