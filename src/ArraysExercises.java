public class ArraysExercises {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Koala");
        people[1] = new Person("Chico");
        people[2] = new Person("Samantha");

        for (Person person : people) {
            System.out.println(person.getName());
        }
//Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.


//    }
//public static void addPerson(Person newPerson){
////int[] array = {23, 43, 55, 12};
////int newLength = array.length;
////
////int[] copiedArray = Arrays.copyOf(array, newLength);
//int [] personArray;
//int newLength =  newPerson.length + 1;

}




}
