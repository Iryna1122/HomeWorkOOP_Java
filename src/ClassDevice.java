public class ClassDevice {
    public static void main(String[]arg)
    {
Device kettle=new Kettle("Electronic Kettle", "Description Kettle");
kettle.sound();
kettle.show();
kettle.desc();

Device microwave=new Microwave("Microwave Samsung","Used to heat food");
microwave.sound();
microwave.show();
microwave.desc();

Car car=new Car("Nissan Rogue", "Car description");
car.show();
car.desc();
car.sound();
    }
    static public class Device
    {
        protected String name;
        protected String description;

        public Device(String name,String description)
        {
            this.name=name;
            this.description=description;
        }
        public void show()
        {
            System.out.println("Device name: " +name);
        }
        public void sound()
        {
            System.out.println("Device sound: ");
        }
        public void desc()
        {
            System.out.println("Device Description:" + description);
        }
    }
     static public class Kettle extends Device
     {
         public Kettle(String name, String description) {
             super(name, description);
         }

         @Override
         public void sound() {
             System.out.println("Kettle sound: Whistle");
         }
     }
   static public class Microwave extends Device {
        public Microwave(String name, String description) {
            super(name, description);
        }

        @Override
        public void sound() {
            System.out.println("Microwave sound: Beep");
        }
    }

   static public class Car extends Device {
        public Car(String name, String description) {
            super(name, description);
        }

        @Override
        public void sound() {
            System.out.println("Car sound: Vroom Vroom");
        }
    }

   static public class Steamship extends Device {
       public Steamship(String name, String description) {
           super(name, description);
       }

       @Override
       public void sound() {
           System.out.println("Steamship sound: Choo Choo");
       }
   }
}
