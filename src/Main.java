public class Main {
    /**
     * console program that receives user input for dog breed, sex, weight
     * @param args arguments provided by application
     */
    public static void main(String[] args){
        // define variables that defines user's dog
        int dogWeight;
        Sex dogSex;
        String dogBreed;

        DogReader.initialize();
        DogReader.getDogBreeds().get(6).print();
        System.out.println(DogReader.getDogBreeds().get(6).weightPercentile(Sex.MALE, 70));
    }
}
