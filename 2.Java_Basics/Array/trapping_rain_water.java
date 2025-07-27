package Array;

public class trapping_rain_water {
    public static int trapping_water(int ht[]){
     int n=ht.length; 
     
    //leftmax boundary-array
    int leftMax[]=new int[n];
     leftMax[0]=ht[0];
    for(int i=1;i<n;i++){
        leftMax[i]=Math.max(ht[i],leftMax[i-1]);
    }
    //rightmax boundary-array
    int rightMax[]=new int [n];
      rightMax[n-1]=ht[n-1];
    for(int i=(n-2);i>=0;i--){
        rightMax[i]=Math.max(ht[i],rightMax[i+1]);
    }

    //waterLevel=min(leftmax,rightmax) 
    int waterTrapping=0;
    for(int i=0;i<n;i++){

    int waterLevel=Math.min(leftMax[i],rightMax[i]);
    
    //watterTrapping=waterTrapping+(waterlevel-ht)
   
    waterTrapping=waterTrapping+(waterLevel-ht[i]);

    } 
return waterTrapping;
    
    }
    public static void main(String args[]){
        int ht[]={4,2,0,6,3,2,5};
        System.out.println(trapping_water(ht));
        
    }
    
}
