import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    private T[] items;

    public MagicBox(int arrLenght) {
        items = (T[]) new Object[arrLenght];
    }

    public boolean add(T item) {
        for (int i = 0; i<items.length; i++){
            if (items[i] == null){
                items[i] = item;
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
    public T pick() throws Exception{
        Random random = new Random();
        int randomInt = random.nextInt(items.length-1);
        int count = 0;
        for (int i = 0; i<items.length; i++){
            if (items[i] == null) {
                count++;
            }
        }
        if (count != 0){
            throw new Exception("Коробка ёмкостью " + items.length + " не заполнена. Необходимо заполнить " + count + " ячейки");
        }
        System.out.println(items[randomInt]);
        return items[randomInt];
    }

    public void print(){
        System.out.println(Arrays.toString(items));
    }
}
