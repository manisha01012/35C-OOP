public class week1 {
        public static void main (String args[]){

/*1. Write a program that prints Hello World! to the console. Save the program as Hello.java.*/
                System.out.println("HelloWorld!");
/*2. Extend/Modify the above program to print two additional lines:

/ This is my first program
/ I am on module ST4003CEM

/ System.out.print (not println) and produces the same output.*/
                System.out.print("This is my first program\n");
        
                System.out.print("I am on module ST4003CEM\n");

/* 3. Write a program that prints the following output:

A "quoted" String is
        
'much' better if you learn
        
the rules of "escape sequences."
        
Also, "" represents an empty
        
String. Don't forget: use \"
        
instead of " !
        
'' is not the same as " */
    // NOTE: \ is used before "    
                System.out.println("A \"quoted\" String is");
                System.out.println("'much' better if you learn");
                System.out.println("the rules of \"escape sequences.\"");
                System.out.println("Also,\"\" represents an empty");
                System.out.println("String.Don't forget:use \\  \"  ");
                System.out.println("instead of \" ! ");
                System.out.println("\"is not the same as\"");



/*     WAP that prints the following pattern:

*

**

***

****
*/     
int rows = 4;

// Outer loop for rows
for (int i = 1; i <= rows; i++) {
// Inner loop for columns
        for (int j = 1; j <= i; j++) {
                System.out.print("*");
        }
// Move to the next line after printing each row
        System.out.println();

/*4. WAP that prints the following pattern:
*
**
***
*/
                System.out.println("*");
                System.out.println("");
                System.out.println("*");
                System.out.println("");
        /*
                * 5. WAP prints the following pattern:
                *********
                *********
                *********
                ********* 
                * 
                * 
                */
                System.out.println("*");
                System.out.println("*");
                System.out.println("*");
                System.out.println("*********");
        /*
                * 6. WAP that prints the following output:
                * 
                * A well-formed Java program has a main method with { and } braces.
                * 
                * A System.out.println statement has ( and ) and usually a String that starts
                * and ends with a " character.
                * (But we type \" instead!)
                * 
                * What is the difference between a ' and a "?  Or between a " and a \"?
                * 
                * One is what we see when we're typing our program. The other is what appears
                * on the "console."
                */
                System.out.println("A well-formed Java program has a main method with { and } braces.");
                System.out.println(
                "A System.out.println statement has ( and ) and usually a String that starts and ends with a \" character. (But we type \\\" instead!)");
                System.out.println("What is the difference between a ' and a \" ?  Or between a \" and a \"?");
                System.out.println(
                "One is what we see when we're typing our program. The other is what appears on the \"console.\"");
                
}
                }

        }
