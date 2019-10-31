interface A2{
        void show(String name);
        }
/*
class B extends A1{
    public void show(){
        System.out.println("display something In Class B...");
    }
}

 */

class LamdaExpression{
    public static void main(String args[]){

        A2 obj = (String myName )-> System.out.println("display something In Class B... "+myName);
        obj.show("Sudhan");

    }
}