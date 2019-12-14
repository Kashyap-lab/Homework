public class Calculator {

    int a=10; //instance or not-static variable - declared outside method and inside the class - Without Static keyword
    static int b=20; // Static/class variable - declared outside method and inside the class - With Static keyowrd

    // No return type - No Parameters Instance method
    public void m1() {
        System.out.println(a); // instance variable 'a' can come direct in instance method area
        System.out.println(b);
    }

    // No return type - No parameter STATIC Method
    public static void addition() {
        // System.out.prinln(a); // Non-static field 'a' can not be referenced from static context
        int c = 100; // local variable - declared inside the method
        System.out.print("Addition of " +c+ " and " +b+ " = ");
        System.out.println(c + b);
    }

    // No return type - With parameter STATIC Method
    public static void subtraction(int a, int b){
        System.out.println("Subtraction of " +a+ " and " +b+ " = ");
        System.out.println(a-b);
    }

    // No return type - No parameter STATIC Method
    public static void multiplication (){
        int a=1978;
        int b=9;
        System.out.print( "MULTIPLICATION OF "+a+" and "+b+" = ");
        System.out.println( a*b  );
    }

    // No return type - No parameter STATIC Method
    public static void division (){
        int a=800;
        int b=2;
        System.out.print("DIVISION OF "+ a +" and "+ b +" = ");
        System.out.println( a/b);
    }
// Main Method
    public static void main (String[] args){

        String company ="Calculator";//local variable -declared inside the method
        System.out.println(company);
        addition (); //static method 'addition' come direct in static method area
        subtraction(20 , 10 ); //static method 'subtraction' come direct in static main method area
        multiplication(); //static method 'multiplication' come direct in static method area
        division(); //static method 'division' come direct in static method area
        System.out.println(b); // Static/class variable 'b' can come direct in static main method area
    }
    }