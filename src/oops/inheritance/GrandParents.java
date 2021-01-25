package oops.inheritance;

public class GrandParents {
    int money;
    GrandParents(){
        System.out.println("from grandParents");
    }
    GrandParents(int money){
        this.money = money;
        System.out.println("Constructor from Grandparents to init variavles");

    }
    void print (){
        System.out.println("I have this money:" + money);
    }
}
