package Practice_sheet_5;

class MyComplex {
    private int a;
    private int b;

    public void setRealPart(int a) {
        this.a = a;
    }    
    public void setImaginaryPart(int b) {
        this.b = b;
    }    
    public String toString() {
        String sc = a + " + " + b + " i ";
        return sc;
    }    
}

class MyComplexTester {
    public static void main(String[] args) {
        MyComplex a = new MyComplex();
        a.setRealPart(3);
        a.setImaginaryPart(5);
        System.out.println(a);
    }
}

// Find the output of this code
//  Output : 3 + 5 i