package BasicQuestion;
public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int targetElement=3;
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==targetElement){
                System.out.println(targetElement+" is found at index: "+i);
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(targetElement+" is not present in list");
        }
    } 
}
