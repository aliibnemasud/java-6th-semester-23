package Lab_sheet_1;

/* //Complete the MyComplex class so we can get the following output
3 - 5i */

class MyComplex{
    //write your code here
    private int a, b;
    public void setRealPart(int a){
        this.a = a;
    };
    public void setImaginaryPart(int b){
        this.b = b;        
    };
    public String toString(){
        String sc = a + "" + b + "i";
        return sc;
    };
};


public class MyComplexTester {   
        public static void main(String[]args){
        MyComplex a = new MyComplex();
        a.setRealPart(3);
        a.setImaginaryPart(-5);
        System.out.println(a);
        };   
};
