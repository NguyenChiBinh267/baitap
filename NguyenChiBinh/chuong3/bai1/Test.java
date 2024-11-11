package chuong3.bai1;

public class Test {
    public static void main(String[] args) {
        Person p=new Person();
        p.setName("Nam");
        p.setDob("23/5/1999");
        p.setPob("Ha Noi");
        p.setGender('M');
        p.setEmail("nam@gmail.com");
        p.setPhone("0965234123");
        System.out.println(p.getName());
        System.out.println(p.toString());
    }
}