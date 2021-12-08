public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.getFio();
        person.print();
        Adress address = new Adress();
        String data = address.getData();
        address.split(data);
        address.print();
    }
}