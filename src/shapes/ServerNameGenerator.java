package shapes;

public class ServerNameGenerator {
    //Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    //Create a method that will return a random element from an array of strings.
    //Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    public static void main(String[] args) {

    String [] adjectives = {"attractive", "average", "awful", "bad", "beautiful", "better", "bewildered", "black", "bloody", "blue"};
    String [] nouns = {"time", "person", "year", "way", "day", "thing", "man", "world", "life", "hand"};
        String randomNoun = randomElement(nouns).toString();
        String randomAdj = randomElement(adjectives).toString();
        String genName = (randomNoun + "-" + randomAdj);
        System.out.println("The random name is " + genName);
}
public static String randomElement(String[] array) {
   int ranNum = (int) (Math.random() * 10 + 1);
   return array[ranNum];

}}
