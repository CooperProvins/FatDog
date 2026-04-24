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
        String dogBreed;

        DogReader.initialize();
        // DogBreed myDog = DogReader.getDogBreeds().get(6);
        DogBreed myDog = DogReader.findDogBreed("Kai Ken");
        System.out.println(myDog);
        System.out.println(myDog.weightPercentile(Sex.MALE, 80));
        System.out.println(PortionGenerator.getPortion());
    }
}
