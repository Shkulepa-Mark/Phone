public class main{
    public static void main(String[] args) {

        Phone xiomi = new Phone(123421,"redmi9",124.3F);
        Phone samsung = new Phone(543421,"s23",126.4F);
        Phone iphone  = new Phone(251421,"iphone 13",120.6F);

        xiomi.sendMessage(21412,21412412,124152);
        iphone.sendMessage(1251521,1251232,121232);
        samsung.sendMessage(214531,2141223121,12214);

        System.out.println(xiomi);
        System.out.println(samsung);
        System.out.println(iphone);

        xiomi.receiveCall("Mark", 125213);
        xiomi.getNumber(123541);

        iphone.receiveCall("Vitalik",255213);
        iphone.getNumber(124416);

        samsung.receiveCall("Nastya",124512);
        samsung.getNumber(123512);
    }
}