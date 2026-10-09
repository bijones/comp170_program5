
/*--------------------------------------------
Program 5: MPLS Dog Management System
	
    [REPLACE MY INFORMATION WITH YOURS]
    Course: COMP 170, Spring I 2023
    System: Visual Studio Code, Windows 10
    Author: C. Fulton
*/

import java.util.Scanner; //Importing Scanner Class
public class DogManagement {
    static class Dog {
        // our Product class
        // stores information on our product including the name 
        // and the prices 
        public String name;
        public int weight;
        public int age;
        public int ID;
        public void print(){

            System.out.printf("\tID : %d\n", this.ID);
            System.out.printf("\tname : %s\n", this.name);
            System.out.printf("\tweight : %d\n",this.weight);
            System.out.printf("\tage :%d\n",this.age);

        }
        public Dog (String name,  int weight,int age,int ID){
            this.name  = name ;
            this.weight = weight;
            this.age = age;
            this.ID = ID;
        }
    }
    /*
     * Global Declaration for parallel arrays and Scanner Object
     */
    //DECLARING PARALEL ARRAYS OUTSIDE OF MAIN METHOD TO HOLD DOG DATA use the static keyword



    //Welcome method that outputs introductory text explaining program
    public static void welcome(){
        System.out.println("Welcome, this program allows for a care attendant to be able to create, retrieve and update a dog record from the system.");
    }

    //Method to display prompt and return integer values
    public static int displayPrompt(){
        //Local Variables
        int menuOption;

        System.out.println("\nSelect a menu option:");
        System.out.println("\t1) Create a dog record");
        System.out.println("\t2) Display dog record");
        System.out.println("\t3) Update dog record");
        System.out.println("\t4) Exit Program");

        System.out.print("Enter selection here --> ");
        //INPUT
        menuOption = Integer.parseInt(scn.nextLine());

        return menuOption;
    }
    public static int getID(){
        Scanner dogID = new Scanner(System.in);
        System.out.println("Enter the ID");
        int ID = Integer.parseInt(dogID.nextLine());
        return ID;

    }
    public static Dog[] create(Dog[] dogdatabase){
        int ID = getID();


        // name 
        Scanner dog = new Scanner(System.in);
        System.out.println("Enter the dog name");
        String name = dog.nextLine();
        // age
        Scanner dogage = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = Integer.parseInt(dogage.nextLine());
        // weight 
        Scanner dogweight = new Scanner(System.in);
        System.out.println("Enter the weight");
        int weight = Integer.parseInt(dogweight.nextLine());

        Dog dogdata = new Dog(name,weight,age,ID);

        dogdata.print();
        dogdatabase[ID] = dogdata;
        return dogdatabase;
    }

    public static void update(Dog[] dogdatabase){
        int ID = getID();
        if(dogdatabase[ID] == null) {
            System.err.println("Invalid dog ID");
            System.exit(0);
        }

        Dog dogupdate = dogdatabase[ID];

        // name
        Scanner dog = new Scanner(System.in);
        System.out.println("Enter the new/same dog name");
        String name = dog.nextLine();
        dogupdate.name = name;

        // age
        Scanner dogage = new Scanner(System.in);
        System.out.println("Enter the new/same age");
        int age = Integer.parseInt(dogage.nextLine());
        dogupdate.age = age;
        // weight
        Scanner dogweight = new Scanner(System.in);
        System.out.println("Enter the new/same weight");
        int weight = Integer.parseInt(dogweight.nextLine());
        dogupdate.weight = weight;

        dogupdate.print();
    }
    //DECLARING SCANNER OBJECT
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // new data for dog 
        Dog[] dogdatabase = new Dog[12];
        // counter to keep track of dog in our database
        int[] trackIds = new int[12];
        int counter = 0;
        // user input 
        while(true ){


            int choice = displayPrompt();
            if (choice == 4 ){
                break;
            }
            // Create 
            if (choice == 1 ){
                dogdatabase = create(dogdatabase);

            }
            // display 
            else if (choice == 2){

            }
            // Update

            else if (choice == 3){
                // we are updating the new information for dog using the same information
                update(dogdatabase);
            }
        }

    }


}

    



    

