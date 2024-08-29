package org.example;

public class PolyMorphism {
public static void main(String[] args) {
    Operation op = new Operation();
    Operation opmul = new MultiplyOverride();

    int result1 = op.add(5,10);
    double result2 = op.add(2.5,3.5);
    int result3 = op.add(5,10,7);
    int result4 = opmul.add(3,7);

    System.out.println("Operation(5,10): "+result1);
    System.out.println("Operation(2.5,3.5): "+result2);
    System.out.println("Operation(5,10,7): "+result3);
    System.out.println("MultiplyOverride(3,7): "+result4);

    try{
        int result = 10/0;

    }catch (ArithmeticException e){
        System.out.println("Caught ArithmeticException");
    }

    try{
        int[] arr = new int [5];
        int index = arr[10];
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Caught ArrayIndexOutOfBoundsException" + e.getMessage());
    }

    try{
        String str = null;
        str.length();
    } catch (NullPointerException e) {
        System.out.println("Caught NullPointerException");
    }

    try {
        Thread t = new Thread();
        t.start();
        t.start();
    } catch (IllegalThreadStateException e){
        System.out.println("Caught IllegalThreadStateException "+ e.getMessage());
    }
}
static class Operation{
    public int add(int a, int b){
        return a + b;

    }
    public double add(double a, double b){
        return a + b;

    }
    public int add(int a, int b,int c){
        return a + b + c;

    }
}
static class MultiplyOverride extends Operation {
    @Override
    public int add(int a, int b) {
        return a * b;
    }
}}
