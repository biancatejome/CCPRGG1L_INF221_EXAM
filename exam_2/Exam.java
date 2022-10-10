import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        studentID();
        oddEven();
        characLength();
        upperLower();
        vowels();
        validation();
        sensitivity();
        nested();
        Selection();
        emailAd();
    }

        static void studentID(){
        System.out.println("1. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        int number = studentNumber; 
        int lastSixNumbers = number % 1000000;

        System.out.println("The last six digits of my student number is "+ lastSixNumbers);

        }

        // // ==============================================================================


        static void oddEven(){
        System.out.println("2. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();

        if (lastTwoDigits % 2 == 0)
            System.out.println(lastTwoDigits + " is EVEN");
        else
        System.out.println(lastTwoDigits + " is ODD"); 
        }
    
        // ==============================================================================

        static void characLength(){
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();

        System.out.print("Enter your surname: ");
        String surName = scan.next();

        int lengthOne = firstName.length();
        int lengthTwo = surName.length();

        System.out.println("The total character length of my name is " + (lengthOne + lengthTwo));

        }

//         // ==============================================================================

        static void upperLower(){
        System.out.println("4. Check your first name in LOWERCASE and UPPERCASE");
        System.out.print("Enter your first name in lowercase: ");
        String firstNameInLowerCase = scan.next();
        System.out.print("Enter your first name in UPPERCASE: ");
        String firstNameInUpperCase = scan.next();

        if (firstNameInLowerCase.toLowerCase().equals("bianca")) {
        if (firstNameInUpperCase.toUpperCase().equals("bianca")) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        }
    }
        
        // }

//         // ==============================================================================

        static void vowels(){
        System.out.println("5. Vowel or Consonant");
        System.out.print("Enter the first character of your first name: ");
        char firstChar = scan.next().charAt(0);

        switch (firstChar) {
            case 'A':
                System.out.println("TRUE");
                break;
            case 'E':
                System.out.println("TRUE");
                break;
            case 'I':
                System.out.println("TRUE");
                break;
            case 'O':
                System.out.println("TRUE");
                break;
            case 'U':
                System.out.println("TRUE");
                break;
            default:
                System.out.println("FALSE");
                break;
        }
    }

//         // =========================================================================================================================

        static void validation(){
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber2 = scan.nextInt();

        if (studentNumber2 == 2022102430) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

    }

//         // ==============================================================================

        static void sensitivity(){
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String firstName2 = scan.next();

        System.out.print("Enter your surname in lowercase: ");
        String surName2 = scan.next();

        if(firstName2.equals("BIANCA") && surName2.equals("tejome")){
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
    }
//         // ==============================================================================

        static void nested(){
        System.out.println( "8. Nested conditions");
        System.out.print( "Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();

       
        if (course.equals("BSIT")) {
            System.out.print( "Enter your specialization (MWAA or MAA): ");
            String specialization1 = scan.next();

    
            if (specialization1.equals("MWAA") || specialization1.equals("MAA")) {
                System.out.println( "VALID");
            } else {
                System.out.println( "INVALID");

            }
        } else if (course.equals("BSCS")) {
            System.out.print( "Enter your specialization (DF or ML): ");
            String specialization2 = scan.next();

       
            if (specialization2.equals("DF" ) || specialization2.equals("ML")) {
                System.out.println( "VALID");
            } else {
                System.out.println( "INVALID");
            }

        } else {
            System.out.println( "INVALID");
        }
    }

//         // ==============================================================================

        static void Selection(){
        System.out.println("9. Selection");
        
        System.out.print("Enter your SHS strand: ");
        String strand = scan.next();

        switch (strand) {
            case "STEM":
                System.out.println("STEM");
                break;
            case "ICT":
                System.out.println("ICT");
                break;
            case "ABM":
                System.out.println("ABM");
                break;
            case "HUMMS":
                System.out.println("HUMMS");
                break;
            case "HOME ECONOMICS":
                System.out.println("HOME ECONOMICS");
                break;
            case "ARTS AND DESIGN":
                System.out.println("ARTS AND DESIGN");
                break;
            case "TVL MARITIME":
                System.out.println("TVL MARITIME");
                break;
            default:
                System.out.println("INVALID STRAND");
                break;
            }
        }
        // ==============================================================================
        
        static void emailAd(){
        System.out.println ("10. Validate student email address");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();

            if (studentEmailAddress.contains("tejome")) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        }

            scan.close(); 
    }
