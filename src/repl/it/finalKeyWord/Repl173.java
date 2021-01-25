package repl.it.finalKeyWord;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Repl173 {
    /**
     *
     Create final method avgElements that will average all the
     elements in an integer array (passed to the method as a parameter)
     and return the average.

     Expected Output:
     4.8
     */
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }

    public static final double avgElements(int []array){

        double result;
        int sum =0;
        double splitter = array.length;


        for(int i = 0; i < array.length;i++){
             sum =sum+ array[i];
        }

       result = sum / splitter;
        return result;

    }


}
