package deli;
import java.util.EnumSet;
import java.util.Set;

public class Deli {


    public static SandwichBuilder ey() {
        return new SandwichBuilder();
    }

    public static class SandwichBuilder {
        Set<Meat> meat = EnumSet.noneOf(Meat.class);
        Set<Cheese> cheese = EnumSet.noneOf(Cheese.class);
        Bread bread;
        Set<Topping> topping = EnumSet.noneOf(Topping.class);

        public SandwichBuilder with(Meat meat) {
            this.meat.add(meat);
            return this;
        }

        public SandwichBuilder with(Cheese cheese) {
            this.cheese.add(cheese);
            return this;
        }

        public SandwichBuilder with(Topping topping) {
            this.topping.add(topping);
            return this;
        }

        public SandwichBuilder on(Bread bread) {
            this.bread = bread;
            return this;
        }

        public SandwichBuilder and(Meat meat) {
            return with(meat);
        }

        public SandwichBuilder and(Cheese meat) {
            return with(meat);
        }

        public SandwichBuilder and(Topping meat) {
            return with(meat);
        }

        public SandwichBuilder gimmeA(Meat meat) {
            return with(meat);
        }

        public SandwichBuilder gimmeA(Cheese meat) {
            return with(meat);
        }

        public SandwichBuilder gimmeA(Topping meat) {
            return with(meat);
        }

        public Sandwich thatsIt() {
            return new Sandwich(meat, cheese, bread, topping);
        }

    }

    public static void main(String[] args) {
        // new Sandwich(
        // Set.of(Meat.HAM), Set.of(Cheese.SWISS), Bread.RYE, Set.of(Topping.MAYO,
        // Topping.LETTUCE));

        Sandwich s = Deli.ey()
                .gimmeA(Meat.HAM)
                .and(Cheese.SWISS)
                .on(Bread.RYE)
                .with(Topping.LETTUCE)
                .and(Topping.MAYO)
                .thatsIt();
        System.out.println(s);
    }
}
