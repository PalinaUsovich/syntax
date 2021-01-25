package repl.it.encapsulation;

public class Repl184 {
    public static void main(String[] args) {


    Person person = new Person("Palina", "Usovich",
            9,21,1995,"689-73-99-37");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getSSN());
        System.out.println(person.getFormatBirthday());


}
    /**
     * Encapsulation
     * Create the a Person class with the following:
     * Class Variables
     * firstname
     * lastname
     * birthmonth
     * birthday
     * birthyear
     * String ssn
     *
     * Constructor
     * The main constructor should take in all values and assign them to their respective private class variables
     *
     * Methods
     * Create a public getters to access all the variables.
     *
     * Create a public method called formatBirthday, which will return a String composed of their birthday
     * in mm/dd/yyyy format.  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the
     * String "3/22/2000"
     *
     * in Main Class.
     *
     * Instantiate and object of Person and provide values. follows below outputs for values.
     *
     * using getter and method print them separately.
     * Note: Read carefully the steps.
     *
     * Expected Output:
     * John
     * Doe
     * 10/25/1900
     * 123-45-6789
     */
}
class Person{
      private String firstName;
      private String lastName;
      private int birthMonth;
      private int birthday;
      private int birthYear;
      private String ssn;
      Person(String firstName, String lastName, int birthMonth, int birthday, int birthYear, String ssn ){
          this.firstName = firstName;
          this.lastName = lastName;
          this.birthMonth = birthMonth;
          this.birthday = birthday;
          this.birthYear = birthYear;
          this.ssn = ssn;
      }
      public String getFirstName() {
          return firstName;
      }
    public String getLastName() {
        return lastName;
    }
    public int getBirthMonth() {
        return birthMonth;
    }
    public int getBirthday() {
        return birthday;
    }
    public int getBirthTear() {
        return birthYear;
    }
    public String getSSN() {
        return ssn;
    }


    public String getFormatBirthday(){
        return getBirthMonth() + "/" + getBirthday() + "/" + getBirthTear();
      }


}

