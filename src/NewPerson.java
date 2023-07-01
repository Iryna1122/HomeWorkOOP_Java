import java.util.Scanner;

public class NewPerson {
    public static void main(String[]arg)
    {
        Pilot pilot =new Pilot();
        pilot.enterData();
        pilot.displayData();
        pilot.flyAircraft();

        Sailor sailor=new Sailor("Stepan", "22.06.1875","87596423","Chop","UK","Address","Shatle11");
        sailor.displayData();
        sailor.navigateShip();

    }
    public static  class Human
    {
        protected String fullName;
        protected String dateOfBirth;
        protected String phoneNumber;
        protected String city;
        protected String country;
        protected String homeAddress;

        private static int objectCount = 0; // Статичне поле для лічильника

        public Human() {
            objectCount++; // Збільшуємо лічильник при створенні нового об'єкта
        }

        public static int getObjectCount() {
            return objectCount; // Повертаємо значення лічильника
        }

        public void enterData()
        {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter full name: ");
            fullName=scanner.nextLine();

            System.out.print("Enter date of birth: ");
            dateOfBirth = scanner.nextLine();

            System.out.print("Enter phone number: ");
            phoneNumber = scanner.nextLine();

            System.out.print("Enter city: ");
            city = scanner.nextLine();

            System.out.print("Enter country: ");
            country = scanner.nextLine();

            System.out.print("Enter home address: ");
            homeAddress = scanner.nextLine();
        }

        public void displayData()
        {
            System.out.println("Full Name: " + fullName);
            System.out.println("Date of Birth: " + dateOfBirth);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("City: " + city);
            System.out.println("Country: " + country);
            System.out.println("Home Address: " + homeAddress);
        }

        //added
        public String getFullNameUpperCase() {
            return fullName.toUpperCase();
        }


        public Human(String fullName, String dateOfBirth, String phoneNumber, String city, String country, String homeAddress) {
            this.fullName = fullName;
            this.dateOfBirth = dateOfBirth;
            this.phoneNumber = phoneNumber;
            this.city = city;
            this.country = country;
            this.homeAddress = homeAddress;

            objectCount++;
        }

        public void displayData(String format) {
            if (format.equals("short")) {
                System.out.println("Full Name: " + fullName);
                System.out.println("Phone Number: " + phoneNumber);
            } else if (format.equals("full")) {
                System.out.println("Full Name: " + fullName);
                System.out.println("Date of Birth: " + dateOfBirth);
                System.out.println("Phone Number: " + phoneNumber);
                System.out.println("City: " + city);
                System.out.println("Country: " + country);
                System.out.println("Home Address: " + homeAddress);
            }
        }

        public String getFullName()
        {
            return this.fullName;
        }

        public String getDateOfBirth()
        {
            return this.dateOfBirth;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getCity() {
            return city;
        }

        public String getCountry() {
            return country;
        }

        public String getHomeAddress() {
            return homeAddress;
        }

    }

    public static class Builder extends Human {
        private  String specialization;

        public Builder(String fullName, String dateOfBirth, String phoneNumber, String city, String country, String homeAddress,  String specialization) {
            super(fullName, dateOfBirth,phoneNumber,city,country,homeAddress);
            this.specialization = specialization;
        }

        public Builder()
        {

        }
        public void enterData()
        {
            super.enterData();

            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter specialization: ");
            specialization = scanner.nextLine();
        }

        public void displayData() {
            super.displayData();
            System.out.println("Specialization: " + specialization);
        }

        public void doConstructionWork() {
            System.out.println(fullName + " is doing construction work.");
        }
    }

    public static class Sailor extends Human {
        private String shipName;

        public Sailor(String fullName, String dateOfBirth, String phoneNumber, String city, String country, String homeAddress, String shipName) {
            super(fullName, dateOfBirth,phoneNumber,city,country,homeAddress);
            this.shipName = shipName;
        }

        public void displayData() {
            super.displayData();
            System.out.println("Ship Name: " + shipName);
        }

        public void navigateShip() {
            System.out.println(fullName + " is navigating the ship.");
        }
    }

    public static class Pilot extends Human {
        private String aircraftModel;

        public Pilot(String fullName, String dateOfBirth, String phoneNumber, String city, String country, String homeAddress,String aircraftModel) {
            super(fullName, dateOfBirth,phoneNumber,city,country,homeAddress);
            this.aircraftModel = aircraftModel;
        }

        public Pilot()
        {

        }
        public void displayData() {
            super.displayData();
            System.out.println("Aircraft Model: " + aircraftModel);
        }

        public void flyAircraft() {
            System.out.println(fullName + " is flying the aircraft.");
        }
    }
}
