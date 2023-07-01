import java.util.Scanner;

public class NewAnimal {
    public static void main(String[]arg)
    {
 Tiger tiger=new Tiger();
 tiger.enterData();
 tiger.printData();
    }

     public static class Animal{
        protected String name;

        public Animal()
        {

        }
        public Animal(String name)
        {
            this.name=name;
        }
        public String getName()
        {
            return name;
        }

        public void enterData()
        {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter Name: ");
            name=scanner.next();
        }

        public void printData()
        {
            System.out.print("Full Name: " + name);

        }
    }

    public static class Tiger extends Animal
    {
        private int countOfStripes;
        public Tiger(String name, int countOfStripes)
        {
            super(name);
            this.countOfStripes=countOfStripes;
        }
        public Tiger()
        {
         super();
        }
        public int getCountOfStripes()
        {
            return countOfStripes;
        }
        public void enterData() {
            super.enterData();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter count of stripes: ");
            countOfStripes = scanner.nextInt();
        }
        public void printData()
        {
            super.printData();
            System.out.print("countOfStripes: " + countOfStripes);

        }

    }
    public static class Crocodile extends Animal
    {
        private int lenght;

        public Crocodile()
        {
           super();
        }
        public Crocodile(String name, int len)
        {
            super(name);
            this.lenght=len;
        }
        public int getLenght() {
            return lenght;
        }
        public void enterData() {
            super.enterData();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of stripes: ");
            lenght = scanner.nextInt();
        }

        public void printData()
        {
            super.printData();
            System.out.println("Length: " + lenght);

        }

    }

    static class Kangaroo extends Animal {
        private double jumpHeight;

        public Kangaroo()
        {
            super();
        }
        public Kangaroo(String name, double jumpHeight) {
            super(name);
            this.jumpHeight = jumpHeight;
        }

        public double getJumpHeight() {
            return jumpHeight;
        }
        public void enterData() {
            super.enterData();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of stripes: ");
            jumpHeight = scanner.nextDouble();
        }
        public void printData()
        {
            super.printData();
            System.out.println("Jump Height: " + jumpHeight);

        }
    }


}

