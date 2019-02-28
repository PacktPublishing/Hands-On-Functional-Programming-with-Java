interface Parameter{
    int sum(int a, int b);
}
public class ParamAnon {
    private static int mult(Parameter parameter,int a,int b, int y){
        return parameter.sum(a,b)*y;
    }
    public static void main(String [] args){

        mult((a, b) -> a+b,4,2,7);

    }
}
