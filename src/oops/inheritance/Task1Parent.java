package oops.inheritance;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import oops.methods.Task1;
import org.w3c.dom.ls.LSOutput;
import sun.security.x509.KeyIdentifier;

public class Task1Parent {
    int money;

     public void printF(){
         System.out.println("Money from my parent " + money);
     }

}
class Father extends Task1Parent{

}
class Kid extends Father{



    public static void main(String[] args) {
        Kid kid = new Kid();
        kid.money = 90;
        kid.printF();

    }
}







