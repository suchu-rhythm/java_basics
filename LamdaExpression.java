interface A1{
        void show(int j);
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

        A1 obj = (int j )-> System.out.println("display something In Class B... "+j);
        obj.show(7);

    }
}