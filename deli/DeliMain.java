package deli;
import static deli.Meat.*;
import static deli.Cheese.*;
import static deli.Topping.*;
import static deli.Bread.*;


public class DeliMain {
    public static void main(String[] args) {
        // new Sandwich(
        // Set.of(Meat.HAM), Set.of(Cheese.SWISS), Bread.RYE, Set.of(Topping.MAYO,
        // Topping.LETTUCE));

        Sandwich s = Deli.ey()
                .gimmeA(HAM)
                .and(SWISS)
                .on(RYE)
                .with(LETTUCE)
                .and(MAYO)
                .and(MUSTARD)
                .thatsIt();
        System.out.println(s);

        System.out.println(
            Deli.ey().gimmeA(ROAST_BEEF).with(CHEDDAR).on(WHEAT).thatsIt());
    }
    
}
