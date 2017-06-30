
//Git is a vsrsion control system
//Git is fress software
//Git has a mutable index called stage
//Git tracks changes of files

public class Test{
   int a = 1;
   int b = 2;
   public static void main(String[] args){
      
       Test t = new Test();
       System.out.print(t.add());
       System.out.print(t.minus());
       System.out.print(t.add(5,3));
   
   }


   public int add(){
      return this.a+this.b;
   
   }

   public int add(int a,int b){
      return a+b;
   
   }
   public int minus(){
   	return this.a -this.b;
   }
}
