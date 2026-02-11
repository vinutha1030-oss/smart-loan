import java.util.LinkedList;
public class Code6{
    public static void main(String[]args){
        LinkedList<String>cars = new LinkedList<String>();
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