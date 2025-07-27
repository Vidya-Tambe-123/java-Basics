package Array;
public class linnear_Search{
public static int linnearSearch(int arr[],int key){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            return i;
        }
    }
return -1;
}
public static void main(String args[]){
int arr[]={1,2,3,4,5,6,7,8,9};
int key=9;
int ans=linnearSearch(arr, key);
if(ans==-1){
    System.out.println("element was not found");
}
else{
    System.out.println("element is found at index:"+" "+ans);
}

}
}