public class RunnableLambda {
    public static void main(String[] args) {
        traditionalRunnableImplementation();
        lambdaRunnableImplementation1();
        lambdaRunnableImplementation2();
    }

    private static void lambdaRunnableImplementation2() {
        new Thread(()-> System.out.println("Inside 3")).start();
    }

    private static void lambdaRunnableImplementation1() {
       // ()->{}
        Runnable runnableLambda=()->{
            System.out.println("Inside 2");
        };

        new Thread(runnableLambda).start();
    }

    private static void traditionalRunnableImplementation() {

        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside 1");
            }
        };

        new Thread(runnable).start();
    }
}
