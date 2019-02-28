interface Hello {
    void sayHello();
}
public class HelloAnon {
    public static void main(String [] args){
        Hello englishHello = () -> System.out.println("Hello");
        Hello frenchHello = () -> System.out.println("Bonjour");
        Hello spanishHello = () -> System.out.println("Hola");
        englishHello.sayHello();
        frenchHello.sayHello();
        spanishHello.sayHello();


    }
}
