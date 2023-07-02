public class ClassMusicInstrument {
    public static void main(String[]arg)
    {
        Violin violin=new Violin("Violin1", "Violin description");
        violin.sound();
       violin.history();
       violin.show();

       Ukulele ukulele=new Ukulele("Ukulele1","Description ukulele1");
       ukulele.history();
       ukulele.show();
    }
    static public class MusicInstrument
    {
        protected String name;
        protected String description;

        public MusicInstrument(String name,String description)
        {
            this.name=name;
            this.description=description;


        }

        public void displayData()
        {
            System.out.println("name = " + name);
            System.out.println("description = " + description);

        }
        public void sound()
        {
            System.out.println("Sound of Music Instrument: ");
        }
        public void show()
        {
            System.out.println("Name of instrument: ");
        }

        public void desc()
        {
            System.out.println("Description: ");
        }

        public String getName()
        {
            return name;
        }
        public void history()
        {
            System.out.println("History of "+ getName() );
        }

    }
   static public class Violin extends MusicInstrument {
        public Violin(String name, String description) {
            super(name, description);
        }

        @Override
        public void sound() {
            System.out.println("Violin sound: Screech");
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public void history() {
            System.out.println("History of the violin");
        }

        @Override
        public void show()
        {
            System.out.println("Name of instrument:  " +getName());
        }
    }
   static public class Trombone extends MusicInstrument {
        public Trombone(String name, String description) {
            super(name, description);
        }


        @Override
        public void sound() {
            System.out.println("Trombone sound: Low brass");
        }

        @Override
        public void history() {
            System.out.println("History of the trombone");
        }

        @Override
       public String getName()
       {
           return name;
       }
       @Override
       public void show()
       {
           System.out.println("Name of instrument:  " +getName());
       }
    }

    static public class Ukulele extends MusicInstrument {
        public Ukulele(String name, String description) {
            super(name, description);
        }

        @Override
        public void sound() {
            System.out.println("Ukulele sound: Strum");
        }

        @Override
        public void history() {
            System.out.println("History of the ukulele");
        }
        @Override
        public String getName()
        {
            return name;
        }
        @Override
        public void show()
        {
            System.out.println("Name of instrument:  " +getName());
        }
    }

   static public class Cello extends MusicInstrument {
        public Cello(String name, String description) {
            super(name, description);
        }

        @Override
        public void sound() {
            System.out.println("Cello sound: Deep tone");
        }

        @Override
        public void history() {
            System.out.println("History of the cello");
        }

        @Override
       public String getName()
       {
           return name;
       }
       @Override
       public void show()
       {
           System.out.println("Name of instrument:  " +getName());
       }
    }
}
