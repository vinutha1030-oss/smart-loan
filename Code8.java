import java.util.TreeSet;

public class Code8{
    public static void main(String[]args){
        TreeSet<String>cars = new TreeSet<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.contains("Mazda");
        cars.remove("BMW");

    }
}