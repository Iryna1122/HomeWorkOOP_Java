public class NewMoney {
    public static void main(String[]arg)
    {
        Money money = new Money(10, 50);
        money.displayAmount(); // Виводиться "Amount: $10.50"

        Product product = new Product("Phone", money);
        System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice().getDollars() + "." + product.getPrice().getCents()); // Виводиться "Product: Phone, Price: $10.50"

        product.reducePrice(5);
        System.out.println("New Price: $" + product.getPrice().getDollars() + "." + product.getPrice().getCents()); // Виводиться "New Price: $5.45"

    }
    static public class Money {
        private int dollars;
        private int cents;

        public Money(int dollars, int cents) {
            this.dollars = dollars;
            this.cents = cents;
        }

        public int getDollars() {
            return dollars;
        }

        public int getCents() {
            return cents;
        }

        public void setDollars(int dollars) {
            this.dollars = dollars;
        }

        public void setCents(int cents) {
            this.cents = cents;
        }

        public void displayAmount() {
            System.out.println("Amount: $" + dollars + "." + cents);
        }
    }

   static public class Product {
        private String name;
        private Money price;

        public Product(String name, Money price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public Money getPrice() {
            return price;
        }

        public void reducePrice(int amount) {
            int dollars = price.getDollars();
            int cents = price.getCents();

            int totalCents = dollars * 100 + cents;
            totalCents -= amount;

            dollars = totalCents / 100;
            cents = totalCents % 100;

            price.setDollars(dollars);
            price.setCents(cents);
        }
    }

}
