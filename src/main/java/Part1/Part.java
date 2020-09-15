package Part1;

import java.util.ArrayList;
import java.util.Scanner;

public class Part extends Pet{


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have? ");

        int numOfPets = scanner.nextInt();
        System.out.println("Number of pets: " + numOfPets);

        int n = numOfPets;

        String nameOfPet = "";


        String typeOfPet = "";
        ArrayList<String> animalName = new ArrayList<>(n);
        for ( int i = 0; i < n; i++){
            System.out.println("What type of animal?");
            typeOfPet = scanner.next();
            System.out.println("Whats the name?");
            nameOfPet = scanner.next();
            if (typeOfPet.equalsIgnoreCase("Dog")){
                Dog brick = new Dog();
                brick.setName(nameOfPet);
                System.out.println(brick.getName() + " says: ");
                brick.makeSound();
            }
            if (typeOfPet.equalsIgnoreCase("Cat")){
                Cat jake = new Cat();
                jake.setName(nameOfPet);
                System.out.println(jake.getName() + " says: ");
                jake.makeSound();
            }
            if (typeOfPet.equalsIgnoreCase("Bird")){
                Bird terry = new Bird();
                terry.setName(nameOfPet);
                System.out.println(terry.getName() + " says: ");
                terry.makeSound();
            }
            animalName.add(nameOfPet);
        }

//        String nameOfPet = "";
//        ArrayList<String> animalName = new ArrayList<>(n);
//        for ( int i = 0; i < n; i++){
//            System.out.println("What are there names?");
//            nameOfPet = scanner.next();
//            animalName.add(nameOfPet);
//        }
        //System.out.println("ArrayList AnimalType: " + animalType);
        System.out.println("ArrayList AnimalName: " + animalName);

//        if (typeOfPet.equalsIgnoreCase("Dog")){
//            Dog brick = new Dog();
//            brick.setName(nameOfPet);
//            System.out.println(brick.getName() + " says: ");
//            brick.makeSound();
//        }
//        if (typeOfPet.equalsIgnoreCase("Cat")){
//            Cat jake = new Cat();
//            jake.setName(nameOfPet);
//            System.out.println(jake.getName() + " says: ");
//            jake.makeSound();
//        }
//        if (typeOfPet.equalsIgnoreCase("Bird")){
//            Bird terry = new Bird();
//            terry.setName(nameOfPet);
//            System.out.println(terry.getName() + " says: ");
//            terry.makeSound();
//        }

//        Bird prick = new Bird();
//        prick.makeSound();
//        prick.setName("Stupid");
//        System.out.println(prick.getName());
    }
}
