package oops.inheritance;

public class Palina extends Mother{
    Palina (){
        System.out.println("from Palina ");

    }
    Palina(int money){
        super(money);
        System.out.println("Money from Palina " + money);

    }

    public static void main(String[] args) {
        Palina palina = new Palina(1000);
        palina.print();

    }

}
