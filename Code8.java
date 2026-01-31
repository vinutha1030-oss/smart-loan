interface Payment{
    void pay();

}
class Upi implements Payment{
    public void pay(){
        System.out.println("Payment");
    }
}
class Code8{
    public static void main(String[]args){
        Upi Gpay = new Upi();
        Gpay.pay();
    }
}