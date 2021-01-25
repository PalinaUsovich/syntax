package oops.inheritance.methodOverriding;

public class Overriding {
    public void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }

}
class Bachelors extends Overriding{


}
class Masters extends Overriding {

    public void getPrerequisite(){
        System.out.println("To get a degree you need Bachelor's  diploma");
    }

    public static void main(String[] args) {

        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();

        Masters master = new Masters();
        master.getPrerequisite();
    }

}
