package Practice_sheet_4;

public class HumanTester {
    public static void main(String[] arg) {
        Human h1 = new Human();
        Human h2 = new Human();
        h1.age = 21;
        h1.height = 5.5;
        System.out.println(h1.age);
        System.out.println(h1.height);
        h2.height = h1.height - 3;
        System.out.println(h2.height);
        h2.age = h1.age++;
        System.out.println(h1.age);
        System.out.println(h2.age);
        h2 = h1;
        System.out.println(h2.age);
        System.out.println(h2.height);
        h2.age++;
        h2.height++;
        System.out.println(h1.age);
        System.out.println(h1.height);
        h1.age = ++h2.age;
        System.out.println(h2.age);
        System.out.println(h2.height);

    };

};
/* Find the output of the following sequence of statements.
Then verify the output by writing a HumanTester class with following codes inside the
main method. */

/* 
Outputs: 
21
5.5
2.5
22
21
22
5.5
23
6.5
24
6.5 
*/
