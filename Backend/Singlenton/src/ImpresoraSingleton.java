public class ImpresoraSingleton {

    private static ImpresoraSingleton instance;


    private ImpresoraSingleton(){
        try {
            System.out.println("Creando instancia por primera vez");
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    public static  ImpresoraSingleton getInstance(){

        if(instance == null){
            instance = new ImpresoraSingleton();

        }
        return instance;
    }
}
