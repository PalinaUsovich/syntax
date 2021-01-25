package oops.abstraction;

public abstract class File {
    public abstract void open();

    public void edit(){

    }
    public void close(){

    }
}
class JavaFile extends File{
    public void open(){
        System.out.println("We need notepad to open .java file");
    }

}
class PdfFile extends File{

    @Override
    public void open() {
        System.out.println("We need sublime to open PDF file ");
    }
}
class WordFile extends File{

    @Override
    public void open() {
        System.out.println("we need Microsoft word to be installed  to open .doc ");
    }
}
