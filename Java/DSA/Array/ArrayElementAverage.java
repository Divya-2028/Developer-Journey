package Array;
public class ArrayElementAverage {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int totalElement=arr.length;
        int sum=0;
        for(int i=0;i<totalElement;i++){
            sum+=arr[i];
        }        
        double average=(double)sum/totalElement;
        System.out.println("Average of array elemenet: "+average);
    }
}
