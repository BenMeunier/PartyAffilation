import java.util.Scanner;

    class PartyAffiliation{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose your party affilation:");
            System.out.println("D - Deomcrat");
            System.out.println("R - Republican");
            System.out.println("I - Independent");
            System.out.print("Enter your Choice: ");
            String choice = scanner.next() .toUpperCase();

            String result = "";

            switch(choice) {
                case "D":
                result = "Democratic Donkey";
                break;
                case "R":
                result = "Republican Elephant";
                break;
                case "I":
                result = "Person";
                break;
                default:
                    result = "Other";
                    break;
            }

            System.out.println("You get a " +result + ",");

            scanner.close();


        }


            }