import java.util.Random;

public class Index {
    static Random  rand = new Random();
    private static final Logger logger = Logger.getInstancia();
    public static void main(String[] args) {
        
        if (( rand.nextInt(100)) > 50) {
            metodoA();
        } else{
            metodoZ();
        }
        
    }

    private static void metodoA() {
        logger.info("Executado o metodo A");

        if (( rand.nextInt(100)) > 50) {
            metodoB();
        } else{
            metodoY();
        }

    }

    private static void metodoB( ) {
        logger.info("Executado o metodo B");

        if (( rand.nextInt(100)) > 50) {
            metodoC();
        } else{
            metodoX();
        }

    }

    private static void metodoC( ) {
        logger.info("Executado o metodo C");
    }

    
    private static void metodoX( ) {
        logger.info("Executado o metodo X");

    }

      private static void metodoY( ) {
        logger.info("Executado o metodo Y");

        if (( rand.nextInt(100)) > 50) {
            metodoC();
        } else{
            metodoX();
        }
    }

    private static void metodoZ( ) {
        logger.info("Executado o metodo Z");
        if (( rand.nextInt(100)) > 50) {
            metodoB();
        } else{
            metodoY();
        }
    }

    
  
}
