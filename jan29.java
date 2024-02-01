//object


public class jan29{
    public static void main(String[] args){
        int num1=10,num2=5;

        calculator c=new calculator();
        int result = c.add(num1,num2);
        System.out.println(result);
    }
}

class calculator{
    int add(int n1,int n2){
        int r= n1+n2;
        return r;
    }
}
