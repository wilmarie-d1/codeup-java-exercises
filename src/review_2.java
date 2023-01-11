public class review_2 {
    static class review {
        //    1a. Make a class called review and create a public static method that takes in a double called radius, so that you can find the circumference of a circle. (Circumference Equation: C = 2πr)
        public static double findCircumference(double radius) {
            return 2 * Math.PI * radius;
        }

        //1b. make the circumference method work with integers and doubles by using method overloading
        public static double findCircumference(int radius) {
            return findCircumference((double)radius);
        }
        //Create a public static method called total with two double parameters named 'bill' and 'tipPercentage'.
        //Return the final bill (double), including tip. (Equation: bill + ((tipPercentage / 100) * bill) = total)

        public static double total(double bill, double tipPercentage) {
            double finalBill;
            finalBill = bill + ((tipPercentage / 100) * bill);
            return finalBill;
        }
    }
}

//Create a package called carShop. Inside carShop create a new class called Car. Make instance fields that can't be accessed outside Car. These fields should be of type String named model, make, color, and an int named year. Create a constructor that sets the model, make, color, and year. Write getters and setters for each property.(Remember we can generate these by right clicking -> 'Generate' -> Getters and Setters)
//
//Inside carShop create another class called Customer and make instance fields that can't be accessed outside Customer, these fields should be string called firstName and lastName. Create a constructor that sets firstName and lastName. Write getters and setters for each property.
//
//Create an interface named Describable
//
//-Specify an instance method named describe that accepts a String 'details' parameters and returns a string
//
//-Make your Customer class implement the Describable interface
//
//-The implementation of the describe method on the Customer class should return something like the following message:
//
//Hey there firstName lastName, it looks like your color, year, make, model is ready to go!`
//Create a DealershipApp class, which will contain your main method. This is where you test the following, not in Review -in main(), you will make new Customer and Car objects, then sout out the return of Customer's describe() implementation.

