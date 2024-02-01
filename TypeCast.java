public class TypeCast{
    public static void main(String[] args){
        //assing byte(range 127) to integer(2147483647) so we assing
        //byte to integer 
        // byte b=126;
        // int i=256;
        // i=b;


        //typeCasting (int to byte)
        int a= 126;
        byte b=(byte)a;
        System.out.println(a);

        //type promotion

        byte c=2;
        int result = b*c;
        
        System.out.println(result);

    }
}