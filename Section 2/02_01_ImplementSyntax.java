@FunctionalInterface
interface NoParameters{
    void print();
}
@FunctionalInterface
interface OneParameter{
    void print(String s);
}
@FunctionalInterface
interface MultipleParameters{
    void print(String one, String two);
}
public class ImplementSyntax {
    public static void main(String [] args){
        NoParameters noParameters = () -> System.out.println("Hello from no param");
        OneParameter oneParameter = (param) -> System.out.println("Parameter is: "+ param);
        MultipleParameters multipleParameters = (param1, param2) -> {
            System.out.println("Parameter1: "+ param1);
            System.out.println("Parameter2: "+ param2);
        };
        noParameters.print();
        oneParameter.print("PARAMETER1");
        multipleParameters.print("PARAM1","PARAM2");

    }
}
