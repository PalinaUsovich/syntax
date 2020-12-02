package oops.string;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class LengthMethod {
    public static void main(String[] args) {


        String name = "Palina";
        int length = name.length();

        System.out.println(length);
        name = "";
        System.out.println(name.length());

}
}
