package oops.string.tasks;

public class Task6 {
    double sumOfArray(double[] array){
        double sum=0;
        for (double v : array) {
            sum = sum + v;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task6 task = new Task6();
        double[]array = {10,20,30,10,100};
        System.out.println(task.sumOfArray(array));
    }
}
