public class AnonThread {

    public static void main(String [] args){

        Thread thread = new Thread(){
            public void run(){
                System.out.println("Hello from inside the anonymous thread");
            }
        };
        thread.start();
    }
}
