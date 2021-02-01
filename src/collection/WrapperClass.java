package collection;

public class WrapperClass {
    public static void main(String[] args) {
        //we have 8 primitive types and for each primitive type we have a wrapper class
        byte byteNumbers = 100; //can store max - 128 to 127 //8 bites
        short shortNumbers = 1000; //can store numbers from 32768  up to  32767 //16bites
        int number = 10;// can store up to 2 billion //32 bites
        long longNumber = 37458917348928374l; //64 bites
        float floatNumber = 1520.2125f;
        double numberWithDecimalPoints = 10.5;
        char character = 'A';
        boolean flags = true;

        String string = "10";
        //System.out.println(string*2);

        Byte nonPrimitiveByteNumbers = 100; //can store max - 128 to 127
        Short nonPrimitiveShortNumbers = 1000; //can store numbers from 32768  up to  32767
        Integer nonPrimitiveNumber = 10;// can store up to 2 billion
        System.out.println(nonPrimitiveNumber.byteValue());
        System.out.println(Integer.parseInt("10"));
        Long nonPrimitiveLongNumber = 37458917348928374l;
        Float nonPrimitiveFloatNumber = 1520.2125f;
        Double nonPrimitiveNumberWithDecimalPoints = 10.5;
        Character nonPrimitiveCharacter = 'A';
        Boolean nonPrimitiveFlags = true;

        int primitiveInt = 10;
        Integer notPrimitiveInt =primitiveInt;
        primitiveInt = notPrimitiveInt;///converting back to primitive
        System.out.println(notPrimitiveInt.doubleValue());

    }
}