public class PrintALternateExtremeElementsArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int size=arr.length;
        int mid = (size / 2);
        for(int i=0;i<arr.length-1;i++){
            if(mid>i){
            System.out.print(arr[i]+" "+arr[size-1]+" ");
            size--;
            }
        }
    }
}
