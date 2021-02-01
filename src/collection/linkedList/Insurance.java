package collection.linkedList;

public abstract class Insurance {
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName = insuranceName;
    }

  abstract  void getQuote();
  abstract void cancelInsurance();




}
class Car extends Insurance{
    String carModel;



    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    void getQuote() {
        System.out.println(carModel + " get quote");
    }

    @Override
    void cancelInsurance() {
        System.out.println(carModel + " cancel car insurance");

    }
}
class Pet extends Insurance{
    String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }


    @Override
    void getQuote() {
        System.out.println( petType + " Pet ins get quote method");
    }

    @Override
    void cancelInsurance() {
        System.out.println(petType + " cancel pet insurance");
    }
}
class Health extends Insurance{

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("Health get quote method");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancel health insurance");
    }
}
