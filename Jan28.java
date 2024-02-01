public class Jan28{
    public static void main(String[] args){

        int a=50;
        int b=2;

        int add,sub,mul,div,mod;

        add=a+b;
        sub=a-b;
        mul=a*b;
        div=a/b;
        mod=a%b;

        System.out.println("add :"+add);
        System.out.println("sub :"+sub);
        System.out.println("mul :"+mul);
        System.out.println("div :"+div);
        System.out.println("mod :"+mod);

        relational r=new relational();
        r.printData();

        Logical l=new Logical();
        l.printData();

        conditional_statements cs=new conditional_statements();
        cs.ifElse();
        cs.SWitch();

        Loop loop = new Loop();
        loop.WHILE();
        loop.FOR();

    }

   

}

class relational{

    void printData(){
        int a=3,b=5;
        System.out.println();
        System.out.println("relational oprators");
        if(a<b){
            System.out.println("A is lessThan B");
        }
        else{
            System.out.println("B is lessThan A");
        }

    }
        
}

class Logical{

    void printData(){
        int a=5,b=13,c=1;
        System.out.println();
        System.out.println("Logical oprators ");
        if(a<b && a<c){
            System.out.println("A is lessThan B&C");
        }
        else if(b<a && b<c){
            System.out.println("B is lessThan A&C");
        }
        else{
            System.out.println("C is lessThan A&B");
        }

    }
        
}

class conditional_statements{
    void ifElse(){
        int x =10;


        System.out.println();
        System.out.println("conditional statements");
        System.out.println();
        System.out.println("If else");


        if(x>11){
            System.out.println("Say Hello");
        }
        else{
            System.out.println("Say Bye");
        }

        //ternoary oprator
        int result = x%2==0 ?10:20;
        System.out.println(result);
    }

    void SWitch(){
        int x=3;

        switch(x){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("enter valid number");
                break;
        }
    }
}

class Loop{

    void WHILE(){
        int star = 1;

        while(star!=10){
            System.out.println("HEllo ji"+star);
            star++;
        }
    }

    void FOR(){
        for(int i=0; i<=3; i++){
            System.out.println("FOR LOOP");
        }
    }
}