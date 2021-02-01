package collection;

public class Boxing {
    public static void main(String[] args) {
        Integer nonPrimitive = 10;//AutoBoxing
        int primitive = nonPrimitive;//AutoUnboxing
        Integer integer = new Integer(10);//boxing


        int number = integer.intValue();//unboxing
        String string = new String ("Burjhu");
        String string2 = "Burjhu";
    }
}
