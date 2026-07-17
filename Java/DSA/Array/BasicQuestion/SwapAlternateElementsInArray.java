package BasicQuestion;
public class SwapAlternateElementsInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int temp=0;
        for(int i=0;i<arr.length-1;i+=2){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
        }
        System.out.print("Array after alter swapping: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(+arr[i]+" ");
        }
    }
}
