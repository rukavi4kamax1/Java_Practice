package homework.homework;

public class Pizza {
    private Dough dough;
    private Filling filling;
    private double size;
    private double price;

    public Pizza(Dough dough, Filling filling) {
        this.dough = dough;
        this.filling = filling;
    }

    public Dough getDough() {
        return dough;
    }

    public Filling getFilling() {
        return filling;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setFilling(Filling filling) {
        this.filling = filling;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough=" + dough +
                ", filling=" + filling +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    public static class Dough {
        private String name;

        public Dough(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dough{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static class Filling {
        private Vegetables vegetables;
        private Cheese cheese;
        private Meat meat;

        public Filling(Vegetables vegetables, Cheese cheese, Meat meat) {
            this.vegetables = vegetables;
            this.cheese = cheese;
            this.meat = meat;
        }

        public void setVegetables(Vegetables vegetables) {
            this.vegetables = vegetables;
        }

        public void setCheese(Cheese cheese) {
            this.cheese = cheese;
        }

        public void setMeat(Meat meat) {
            this.meat = meat;
        }

        public Vegetables getVegetables() {
            return vegetables;
        }

        public Cheese getCheese() {
            return cheese;
        }

        public Meat getMeat() {
            return meat;
        }

        @Override
        public String toString() {
            return "Filling{" +
                    "vegetables=" + vegetables +
                    ", cheese=" + cheese +
                    ", meat=" + meat +
                    '}';
        }
    }
}
