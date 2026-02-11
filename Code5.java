import java.util.ArrayList;
public class Code5{
    public static void main(String[]args){
        ArrayList<String>cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        String firstcar = cars.get(0);
        System.out.println(firstcar);
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars.size());
        cars.clear();
    }
}
