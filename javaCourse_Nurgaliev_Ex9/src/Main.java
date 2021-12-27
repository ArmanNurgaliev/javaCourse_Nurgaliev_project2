public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone(500, "iphone", 128);
        ShopList<Phone> newPhone = new ShopList<>(phone);
        newPhone.getProduct().buy();
        System.out.println(newPhone);
        Phone phone2 = null;
        try {
            phone2 = (Phone) phone.clone();
            System.out.println(phone2);
            phone2.setModel("Xiaomi");
            System.out.println(phone2);
            System.out.println(phone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println();


        TV tv = new TV(1000, "Samsung", 16);
        ShopList<TV> newTV = new ShopList<>(tv);
        newTV.getProduct().buy();
        System.out.println(newTV);
        TV tv2 = null;
        try {
            tv2 = (TV) tv.clone();
            System.out.println(tv2);
            tv2.setModel("Philips");
            System.out.println(tv2);
            System.out.println(tv);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Electronics el = new Electronics(2000, "asadsadssa");
    }
}
