import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner for getting input from the user
        Scanner scnr = new Scanner(System.in);

        //for loop continuation
        //1 = true, other numbers = break
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        //for menu choice
        int menuChoice = 1;

        //create animal objects
        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();
        Eagle eagleObject = new Eagle();

        do {
            switch (animalChoiceMenu(scnr)) {
                case 1: // Tiger
                    do {
                        System.out.println("\nThe chosen animal is " + tigerObject.getName() + ".");
                        menuChoice = animalDetailsManipulationMenu(scnr, tigerObject);

                        switch (menuChoice) {
                            case 1: //set characteristics
                                setAnimalCharacteristics(scnr, tigerObject);

                                System.out.println("Enter the speed (km/h): ");
                                tigerObject.setSpeed(scnr.nextInt());

                                System.out.println("Enter the level of sound (dB): ");
                                tigerObject.setSoundLevel(scnr.nextInt());
                                break;

                            case 2: //display characteristics
                                displayAnimalCharacteristics(tigerObject);
                                System.out.println("Speed: " + tigerObject.getSpeed());
                                System.out.println("Sound Level: " + tigerObject.getSoundLevel());
                                break;

                            case 3: //set status
                                System.out.println("Enter true or false to change the status.");

                                System.out.println("Is " + tigerObject.getName() + " walking? true / false");
                                tigerObject.setWalking(scnr.nextBoolean());

                                System.out.println("Is " + tigerObject.getName() + " roaring? true / false");
                                tigerObject.setRoaring(scnr.nextBoolean());

                                System.out.println("Is " + tigerObject.getName() + " sleeping? true / false");
                                tigerObject.setSleeping(scnr.nextBoolean());

                                System.out.println("Is " + tigerObject.getName() + " eating? true / false");
                                tigerObject.setEating(scnr.nextBoolean());
                                break;

                            case 4: //display status
                                if (tigerObject.isEating) {
                                    System.out.println(tigerObject.getName() + " is eating.");
                                } else if (tigerObject.isSleeping) {
                                    System.out.println(tigerObject.getName() + " is sleeping.");
                                } else if (tigerObject.isWalking) {
                                    System.out.println(tigerObject.getName() + " is walking at " + tigerObject.getSpeed() + " km/h.");
                                } else if (tigerObject.isRoaring) {
                                    System.out.println(tigerObject.getName() + " is roaring at " + tigerObject.getSoundLevel() + " dB.");
                                } else {
                                    System.out.println(tigerObject.getName() + " is doing nothing.");
                                }
                                break;

                            default: //wrong input
                                System.out.println("Please choose a valid option!");
                        }

                        System.out.println("\nContinue with this animal?");
                        System.out.println("Enter 1 for Yes.");
                        System.out.println("Enter 2 for No.");

                        System.out.println("\nEnter the number: ");
                        continueInnerLoop = scnr.nextInt();
                } while (continueInnerLoop == 1);
                    break;

                case 2: // Dolphin
                    do {
                        System.out.println("\nThe chosen animal is " + dolphinObject.getName() + ".");
                        menuChoice = animalDetailsManipulationMenu(scnr, dolphinObject);

                        switch (menuChoice) {
                            case 1: //set characteristics
                                setAnimalCharacteristics(scnr, dolphinObject);

                                System.out.println("Enter the speed (km/h): ");
                                dolphinObject.setSpeed(scnr.nextInt());

                                System.out.println("Enter the level of sound (dB): ");
                                dolphinObject.setSoundLevel(scnr.nextInt());
                                break;

                            case 2: //display characteristics
                                displayAnimalCharacteristics(dolphinObject);
                                System.out.println("Speed: " + dolphinObject.getSpeed());
                                System.out.println("Sound Level: " + dolphinObject.getSoundLevel());
                                break;

                            case 3: //set status
                                System.out.println("Enter true or false to change the status.");
                                System.out.println("Is " + dolphinObject.getName() + " swimming? true / false");
                                dolphinObject.setSwimming(scnr.nextBoolean());

                                System.out.println("Is " + dolphinObject.getName() + " eating? true / false");
                                dolphinObject.setEating(scnr.nextBoolean());
                                break;

                            case 4: //display status
                                if (dolphinObject.isEating) {
                                    System.out.println(dolphinObject.getName() + " is eating.");
                                } else if (dolphinObject.isSwimming) {
                                    System.out.println(dolphinObject.getName() + " is swimming " +  dolphinObject.getSpeed() + " km/h.");
                                } else if (dolphinObject.isSleeping) {
                                    System.out.println(dolphinObject.getName() + " is sleeping.");
                                } else {
                                    System.out.println(dolphinObject.getName() + " is doing nothing.");
                                }
                                break;

                            default:
                                System.out.println("Please choose a valid option!");
                        }

                        System.out.println("\nContinue with this animal?");
                        System.out.println("Enter 1 for Yes.");
                        System.out.println("Enter 2 for No.");

                        System.out.println("\nEnter the number: ");
                        continueInnerLoop = scnr.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 3: // Penguin
                    do {
                        System.out.println("\nThe chosen animal is " + penguinObject.getName() + ".");
                        menuChoice = animalDetailsManipulationMenu(scnr, penguinObject);

                        switch (menuChoice) {
                            case 1: //set characteristics
                                setAnimalCharacteristics(scnr, penguinObject);

                                System.out.println("Enter the speed (km/h): ");
                                penguinObject.setSpeed(scnr.nextInt());
                                break;

                            case 2: //display characteristics
                                displayAnimalCharacteristics(tigerObject);
                                System.out.println("Speed: " + penguinObject.getSpeed());
                                break;

                            case 3: //set status
                                System.out.println("Enter true or false to change the status.");
                                System.out.println("Is " + penguinObject.getName() + " walking?");
                                penguinObject.setWalking(scnr.nextBoolean());

                                System.out.println("Is " + penguinObject.getName() + " swimming?");
                                penguinObject.setSwimming(scnr.nextBoolean());

                                System.out.println("Is " + penguinObject.getName() + " sleeping?");
                                penguinObject.setSleeping(scnr.nextBoolean());

                                System.out.println("Is " + penguinObject.getName() + " eating?");
                                penguinObject.setEating(scnr.nextBoolean());

                                System.out.println("Is " + penguinObject.getName() + " sliding?");
                                penguinObject.setSliding(scnr.nextBoolean());
                                break;

                            case 4: //display status
                                if (penguinObject.isEating) {
                                    System.out.println(penguinObject.getName() + " is eating.");
                                } else if (penguinObject.isSleeping) {
                                    System.out.println(penguinObject.getName() + " is sleeping.");
                                } else if (penguinObject.isWalking) {
                                    System.out.println(penguinObject.getName() + " is walking " + penguinObject.getSpeed() + " km/h.");
                                } else if (penguinObject.isSliding) {
                                    System.out.println(penguinObject.getName() + " is sliding " + penguinObject.getSpeed() +  " km/h.");
                                } else if (penguinObject.isSwimming) {
                                    System.out.println(penguinObject.getName() + " is swimming " + penguinObject.getSpeed() + " km/h.");
                                } else {
                                    System.out.println(tigerObject.getName() + " is doing nothing.");
                                }
                                break;

                            default:
                                System.out.println("Please choose a valid option!");
                        }

                        System.out.println("\nContinue with this animal?");
                        System.out.println("Enter 1 for Yes.");
                        System.out.println("Enter 2 for No.");

                        System.out.println("\nEnter the number: ");
                        continueInnerLoop = scnr.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 4: // Eagle
                    do {
                        System.out.println("\nThe chosen animal is " + eagleObject.getName() + ".");
                        menuChoice = animalDetailsManipulationMenu(scnr, eagleObject);

                        switch (menuChoice) {
                            case 1: //set characteristics
                                setAnimalCharacteristics(scnr, eagleObject);

                                System.out.println("Enter the speed (km/h): ");
                                eagleObject.setSpeed(scnr.nextInt());
                                break;

                            case 2: //display characteristics
                                displayAnimalCharacteristics(tigerObject);
                                System.out.println("Speed: " + eagleObject.getSpeed());
                                break;

                            case 3: //set status
                                System.out.println("Enter true or false to change the status.");
                                System.out.println("Is " + eagleObject.getName() + " walking?");
                                eagleObject.setWalking(scnr.nextBoolean());

                                System.out.println("Is " + eagleObject.getName() + " flying?");
                                eagleObject.setFlying(scnr.nextBoolean());

                                System.out.println("Is " + eagleObject.getName() + " sleeping?");
                                eagleObject.setSleeping(scnr.nextBoolean());

                                System.out.println("Is " + eagleObject.getName() + " eating?");
                                eagleObject.setEating(scnr.nextBoolean());
                                break;

                            case 4: //display status
                                if (eagleObject.isEating) {
                                    System.out.println(eagleObject.getName() + " is eating.");
                                } else if (eagleObject.isSleeping) {
                                    System.out.println(eagleObject.getName() + " is sleeping.");
                                } else if (eagleObject.isWalking) {
                                    System.out.println(eagleObject.getName() + " is walking at " +  eagleObject.getSpeed() + " km/h.");
                                } else if (eagleObject.isFlying) {
                                    System.out.println(eagleObject.getName() + " is flying at " + eagleObject.getSpeed() + " km/h.");
                                } else {
                                    System.out.println(tigerObject.getName() + " is doing nothing.");
                                }
                                break;

                            default:
                                System.out.println("Please choose a valid option!");
                        }

                        System.out.println("\nContinue with this animal?");
                        System.out.println("Enter 1 for Yes.");
                        System.out.println("Enter 2 for No.");

                        System.out.println("\nEnter the number: ");
                        continueInnerLoop = scnr.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Sorry, no such animal available.");
                    System.out.println("Please select from the list.");
            }
        } while (continueOuterLoop == 1);
    }

    //Set common characteristics of the animal
    public static void setAnimalCharacteristics(Scanner scnr, Animal animal) {
        System.out.println("Enter the name: ");
        animal.setName(scnr.next());

        System.out.println("Enter the weight (kg): ");
        animal.setWeight(scnr.nextInt());

        System.out.println("Enter the height (m): ");
        animal.setHeight(scnr.nextInt());
    }

    //Display common characteristics of the animal
    public static void displayAnimalCharacteristics(Animal animal) {
        System.out.println("\nThe characteristics of the " + animal.getName() + ":");
        System.out.println("Weight: " + animal.getWeight());
        System.out.println("Height: " + animal.getHeight());
    }

    //Kakao zoo main menu
    public static int animalChoiceMenu(Scanner scnr) {
        int inputNumByUser;

        System.out.println("\n=== KaKao Zoo Animal List ===");

        System.out.println("\n1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.println("4. Eagle");
        System.out.println("5. Exit");

        System.out.println("\nEnter the number to choose animal (1-4) or Exit (5): ");
        inputNumByUser = scnr.nextInt();

        return inputNumByUser;
    }

    //Animal details menu
    public static int animalDetailsManipulationMenu(Scanner scnr, Animal animal) {
        int inputNumByUser;

        System.out.println("\n=== Animal Details Menu for: " + animal.getName() + " ===");

        System.out.println("\n1. Set characteristics");
        System.out.println("2. Display characteristics");
        System.out.println("3. Set status");
        System.out.println("4. Display status");

        System.out.println("\nEnter choice (1-4): ");
        inputNumByUser = scnr.nextInt();

        return inputNumByUser;
    }
}