package repl.it.accessModifiers;

 class Repl141 {
   static String access;

    private static String privateMethod(){
       return access = "Private";

    }
    static String defaultMethod(){
        return access = "Default";



    }
    public static String publicMethod(){
        return access = "Public";

    }
    protected static String protectedMethod(){
        return access = "Protected";

    }


 }
      class main{
         public static void main(String[] args) {
             //Repl141 repl = new Repl141();
             System.out.println(Repl141.defaultMethod());
            // repl.privateMethod();
             System.out.println(Repl141.protectedMethod());
             System.out.println(Repl141.publicMethod());
         }




    /**
     * For you to do:
     *
     * In AnotherClass declare a private, default, protected, public methods and have them each
     * return the name of the what access modifier they are using.
     * All methods should be accessible by class name
     *
     * Call methods of Another class inside Main class
     *
     * Expected Output:
     * default
     * protected
     * public
     */
}

