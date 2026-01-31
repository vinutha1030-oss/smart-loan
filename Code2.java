class Animal{
    Animal(){
        System.out.println("animal are cat , human , lion");

    }
}
class Mammals extends Animal{
    void legs(){
        System.out.println("Mammals have four legs");
    }
}
class Humans extends Mammals{
    void Humans(){
        System.out.println("only humans have two legs");
    }
}
class Code2{
    public static void main(String[]args){
        Mammals m1 = new Mammals();
        Humans h1 = new Humans();

        m1.legs();
        h1.Humans();
    }
}