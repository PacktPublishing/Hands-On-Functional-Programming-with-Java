import java.util.LinkedList;

public class Athletes {
    public static void main(String[] args){
        LinkedList<Athlete> athletes = new LinkedList<>();
        athletes.add(new Athlete("Michael Phelps",28));
        athletes.add(new Athlete("Usain Bolt",8));
        athletes.add(new Athlete("Kobe Bryant", 2));
        athletes.add(new Athlete("Marit Bjørgen",15));
        athletes.add(new Athlete("Larisa Latynina",18));
        athletes.stream()
                .map(athlete -> athlete.getName().split("\\s+"))
                .filter(a->a[0].length()%2==0)
                .filter(a->a[0].contains("a") || a[0].contains("e"))
                .forEach(a->System.out.println(a[0] + a[1]));
        athletes.stream()
                .filter(Athlete::moreThanTen)
                .forEach(athlete -> System.out.println("More than 10: "+athlete));

    }
}
class Athlete{
    String name;
    int medals;

    public Athlete(String name, int medals) {
        this.name = name;
        this.medals = medals;
    }
    public boolean moreThanTen(){
        return  medals>10;
    }

    public String getName() {
        return name;
    }

    public int getMedals() {
        return medals;
    }

    @Override
    public String toString() {
        return name;
    }
}