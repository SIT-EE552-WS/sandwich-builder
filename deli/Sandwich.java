package deli;
import java.util.Set;

public record Sandwich(
    Set<Meat> meat,
    Set<Cheese> cheese,
    Bread bread,
    Set<Topping> topping) {
};