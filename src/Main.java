
import java.util.Scanner;

public class Main {
    /**
     * console program that receives user input for dog breed, sex, weight
     *
     * @param args arguments provided by application
     */
    public static void main(String[] args) {
        // define variables that defines user's dog
        int dogWeight;
        Sex dogSex;
        String dogBreedInput;
        double percentile;

        DogBreed dogBreed;

        Scanner input = new Scanner(System.in);
        DogReader.initialize();

        System.out.println("What breed is your dog?");
        dogBreedInput = input.nextLine();
        dogBreed = DogReader.findDogBreed(dogBreedInput);
        System.out.println(dogBreed);
        System.out.println("What sex is your dog?");
        dogSex = Sex.parse(input.nextLine());
        System.out.println("What is your dog's weight? (lbs)");
        dogWeight = input.nextInt();

        percentile = dogBreed.weightPercentile(dogSex,dogWeight);
        System.out.println(Math.round(percentile*10000)/100.0+"%");
        System.out.println(PortionGenerator.getPortion(percentile));
    }
}
