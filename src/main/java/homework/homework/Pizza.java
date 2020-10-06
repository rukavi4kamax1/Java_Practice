package homework.homework;

import homework.homework.enums.Cheese;
import homework.homework.enums.Meat;
import homework.homework.enums.Vegetables;

public class Pizza implements Eatable {
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

    @Override
    public String eat() {
        return "Hmmm...This pizza is tasty";
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
        public int hashCode() {
            int result = vegetables != null ? vegetables.hashCode() : 0;
            result = 31 * result + (cheese != null ? cheese.hashCode() : 0);
            result = 31 * result + (meat != null ? meat.hashCode() : 0);
            return result;
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
