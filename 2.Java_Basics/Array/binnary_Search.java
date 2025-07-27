package Array;
public class binnary_Search{
    public static int binnarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            //comparision
            if(arr[mid]==key){
                return mid;
            }
            if (arr[mid]<key){
                start=mid+1;
            }
            if(arr[mid]>key){
                end=mid-1;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key=6;
        int ans=binnarySearch(arr, key);
        if(ans==-1){
            System.out.println("element is not found");
        }
        else{
            System.out.println("element is found at index:"+" "+ans);
        }

    }
}
