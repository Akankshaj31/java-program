
    class Vehicle {
        protected String brand = "Ford";        // attribute
        public void honk() {                    // method
            System.out.println("BEEP, BEEP!");
        }
    }

    class Car extends Vehicle {
        private String modelName = "Fiesta";
        public static void main(String[] args) {

            // Create a  object
            Car myCar = new Car();

            // Call the honk() method  on the  object
            myCar.honk();

            // Display the value
            System.out.println(myCar.brand + " " + myCar.modelName);
        }
    }

