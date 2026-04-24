import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Reads dog weight data based on type (csv) and converts it into an arrayList of dogBreed
 */
public class DogReader {
    private static ArrayList<DogBreed> dogBreeds = new ArrayList<>();

    public static String header;

    private static String fileName = "DogBreedWeightData.csv";
    private static Scanner scanner;

    /**
     * Method to setup scanner object and read csv and parse into dodBreeds list
     */
    public static void initialize(){
        try {
            scanner = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            scanner = null;
        }
        header = scanner.nextLine();
        while (scanner.hasNext()){
            String[] parts = scanner.nextLine().split(",");
            dogBreeds.add(
                new DogBreed(
                    parts[0], new int[]{Integer.parseInt(parts[1]),Integer.parseInt(parts[2])}, new int[]{Integer.parseInt(parts[3]),Integer.parseInt(parts[4])}
                )
            );
        }
    }
    public static void printList(){
        for (DogBreed dog : dogBreeds){
            dog.print();
        }
    }
    public static ArrayList<DogBreed> getDogBreeds() {
        return dogBreeds;
    }
    /**
     * Given name of dog breed, finds and returns dog breed from list
     * @param name
     * @return
     */
    public static DogBreed findDogBreed(String name){
        for (DogBreed breed : dogBreeds){
            if (breed.getName().equalsIgnoreCase(name)){
                return breed;
            }
        }
        return null;
    }
}
