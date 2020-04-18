/* code to display demo on calculator */
    package com.company;
    import java.util.Scanner;
    public class Calculator
    {
        static int result = 0;

        public static void main(String[] args) {     //int result=0;
            int opr1;
            int opr2;
            int choice;
            Scanner s = new Scanner(System.in);

            do {
                System.out.println("\n 0 for exit");
                System.out.print("\n 1:add");
                System.out.print("\n 2:multiplication");
                System.out.print("\n 3:divide");
               
                System.out.print("\n Enter your choice");
                choice = s.nextInt();
                if (choice != 0) {

                    switch (choice) {

                        case 1: {
                            opr1 = s.nextInt();
                            opr2 = s.nextInt();
                            result = opr1 + opr2;
                            break;
                        }
                        case 2: {

                            opr1 = s.nextInt();
                            opr2 = s.nextInt();
                            result = opr1 * opr2;
                            break;
                        }
                        case 3: {

                            opr1 = s.nextInt();
                            opr2 = s.nextInt();
                            if (opr2 != 0) {
                                result = opr1 / opr2;
                                break;
                            }
                            System.out.println("division not possible");
                            break;
                        }
                        
                        default:
                            System.out.println("no match found");
                            break;
                    }
                    System.out.print("\n result is = " + result);
                }
            }
            while (choice != 0);
            // write your code here
        }
    }
