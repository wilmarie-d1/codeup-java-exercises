import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Koala");
        people[1] = new Person("Chico");
        people[2] = new Person("Samantha");
        people[3] = new Person(" Mary");

        for (Person person : people) {
            System.out.println(person.getName());
        }
//Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

//addPerso
//public static Person [] addPerson(Person[] oldArr, Person newPerson){
//Person[] newArr = Arrays.copyOf(oldArr, oldArr.length + 1);
//newArr[oldArr.length-1] = newPerson;
//newArr[3] = newPerson;
//    System.out.println(newArr[oldArr.length-1].getName());
//    return newArr;

}




}
