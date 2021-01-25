package constructors;

public class TesterTask {
    String string;

    TesterTask(){
        System.out.println("Constructor without parameters");
    }

    TesterTask(String word){
       string=word;
        System.out.println("Constructor with parameters " + word + "<== parameter");
    }

}
