public class Main {
    public static void main(String[] args) throws Exception {
        MagicBox<String> magicBox = new MagicBox<>(4);
        magicBox.add("Hello");
        magicBox.print();
        magicBox.add("LoL");
        magicBox.print();
        magicBox.add("Kek");
        magicBox.print();
        magicBox.add("4eburek");
        magicBox.print();

        MagicBox<Integer> magicBox1 = new MagicBox<>(6);
        magicBox1.add(88);
        magicBox1.add(2);
        magicBox1.add(55);
        magicBox1.add(9999);
        magicBox1.print();


        magicBox.pick();
        magicBox1.pick();
    }
}