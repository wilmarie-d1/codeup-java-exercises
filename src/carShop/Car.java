package carShop;

 class Car {

//Create a package called carShop. Inside carShop create a new class called Car. Make instance fields that can't be accessed outside Car. These fields should be of type String named model, make, color, and an int named year. Create a constructor that sets the model, make, color, and year. Write getters and setters for each property.(Remember we can generate these by right clicking -> 'Generate' -> Getters and Setters)
        private String model;
        private String make;
        private String color;
        private int year;

        public Car(String model, String make, String color, int year){
                this.model = model;
                this.make = make;
                this.color = color;
                this.year = year;
        }

         public String getModel() {
                 return model;
         }
         public String getMake() {
                return make;
         }
         public String getColor() {
                return color;
         }
         public int getYear() {
                return year;
         }
         public void setModel(String model) {
                this.model = model;
        }
        public void setMake(String make) {
                this.make = make;
         }
         public void setColor(String color){
                this.color = color;
         }
 }
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