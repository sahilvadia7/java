
public class jan30{

    public static void main(String[] args){
    //    test a=new test();
    //    String str = a.hello("Ji");
    //    System.out.println(str);


       ARRAY array=new ARRAY();
    // //    M1 print array using loops
    //    array.M1();

        array.MultiDArray();
    }
}
class test{
   public String hello(String h){
    String b= "Hello ";
    return b+h;
   }
}

class ARRAY{

    void M1(){
        //static array
        int num[]={2,3,4,5};

        //print array using for loop
        for (int i=0; i<4; i++){
            System.out.println(num[i]);
        }

        //print array using while loop
        int j=0;
        while(j!=4){
            System.out.print(num[j]);
            j++;
        }
    }


    void MultiDArray(){
        int arr[][] = new int[3][4];


        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                arr[i][j] = (int)(Math.random() * 100);  
            }
            System.out.println();
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                System.out.print(arr[i][j]+" ");  
            }
            System.out.println();
        }

        System.out.println();

        //enhance for loop , n is array for arr
        for(int n[]:arr){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
    
}
