package Array;

public class Array_function {
    public static void update(int mark[]){
        for(int i=0;i<mark.length;i++){
            mark[i]=mark[i]+1;
        }
    }
    public static void main(String args[]){
        int mark[]={34,89,97};
        update(mark);
        //print marks
        for(int i=0;i<mark.length;i++){
            System.out.println(mark[i]);
        }

    }
    
}
