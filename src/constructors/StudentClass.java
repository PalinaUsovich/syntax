package constructors;

import java.lang.reflect.Constructor;

public class StudentClass {
    String name;
    String address;

    StudentClass(String name, String address){
       this.address = address;
       this.name = name;
    }
    void displayInfo(){
        System.out.println("address: "+address +" name: " + name );
    }
}
