import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ExceptionsHandlingSamples {
    public void caughtException() {
        try {
            //FileReader throws an FileNotFoundException, it is being caught by the caught block
            FileReader fr = new FileReader(new File(""));
        } catch(FileNotFoundException fne){
            System.out.println("Could not find file \n" + fne.getLocalizedMessage());
            fne.getStackTrace();
        }
    }

    public void propagatedException(float a, float b) throws ArithmeticException{
        //ArithmeticException is thrown when b is 0
        System.out.println("Division result = " + a/b);
    }
}

