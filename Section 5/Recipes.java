import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Recipes {

    public static void main(String[] args){
        HashMap<Recipe, List<Ingredient>> recipes =
                new HashMap<>();
        recipes.put(new Recipe("Simple White Cake"),
                List.of(new Ingredient("Sugar"),new Ingredient("Flour"),new Ingredient("Eggs")));
        recipes.put(new Recipe("Milky Way Cake"),
                List.of(new Ingredient("Milk"),new Ingredient("Chocolate"),new Ingredient("Flour")));
        recipes.put(new Recipe("Turnip Cake"),
                List.of(new Ingredient("Turnip"),new Ingredient("Eggs"),new Ingredient("Milk")));
        recipes.put(new Recipe("Sugary Spice Cake"),
                List.of(new Ingredient("Sugar"),new Ingredient("Milk"),new Ingredient("Eggs")));
        recipes.keySet()
                .stream()
                .flatMap(recipe -> recipes.get(recipe).stream())
                .forEach(ingredient -> System.out.println(ingredient));


    }
}
class Recipe{
    String name;

    public Recipe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
class Ingredient implements Comparable {
    String name;

    public Ingredient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        return o.toString().compareTo(this.name);
    }
}
