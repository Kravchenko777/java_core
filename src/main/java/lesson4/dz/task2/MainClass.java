package lesson4.dz.task2;

public class MainClass {

    public static void main(String[] args) {
        PhoneTableClass phoneTableClass = new PhoneTableClass();
        phoneTableClass.add("123","asd");
        phoneTableClass.add("456","asd");
        phoneTableClass.add("789","asd");
        phoneTableClass.add("222","vbn");
        phoneTableClass.add("333","gft");
        phoneTableClass.add("444","wer");
        phoneTableClass.add("555","sdf");

        System.out.println(phoneTableClass.getPhoneByFIO("asd"));
        System.out.println(phoneTableClass.getPhoneByFIO("999"));
    }
}
