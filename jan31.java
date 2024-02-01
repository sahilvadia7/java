public class jan31 {
    public static void main(String[] args) {

        //jaggad array

        
         
         
        // int arr[][] = new int[3][];

        // arr[0]= new int[4];
        // arr[1]= new int[6];
        // arr[2]= new int[3];

        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //         arr[i][j]=(int)(Math.random()*10);
        //     }
        // }

        // for(int n[]:arr){
        //     for(int m:n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        // test t =new test();
        // t.FOREACH();

        StringB sb=new StringB();
        sb.BUffer();

    }
    
 
}
 
class test{

    void FOREACH(){
        int arr[]=new int[10];
        for(int i=0; i<10; i++){
            arr[i] = (int)(Math.random()*10);
        }

        for(int n:arr){
            System.out.print(n+",");
        }
    } 
}


class StringB{
    void BUffer(){
        StringBuffer sb=new StringBuffer("luffy");
        sb.append(" Monkey D ");
        System.out.println(sb);
    }
}