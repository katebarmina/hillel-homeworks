import java.util.Arrays;

public class StringArrayImp implements StringArray {
    private String[] array = new String[10];
    private int size;


    @Override
    public boolean add(int index, String value) {
        checkIndex(index);
        array[index] = value;
        size++;
        return true;
    }

    @Override
    public boolean add(String value) {
        if (size < array.length) {
            array[size] = value;
        } else {
            String[] newArray = new String[(int) (array.length * 1.5)];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[size] = value;
            array = newArray;
        }
        size++;
        return true;
    }

    @Override
    public boolean delete(int index) {
         checkIndex(index);
            for (int i = 0; i < array.length - 1; i++) {
                if (i >= index) {
                    array[i] = array[i + 1];
                }
            }
            array[array.length - 1] = null;
            size--;
            return true;
    }

    @Override
    public boolean delete(String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                delete(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        checkIndex(index);
        return array[index];

    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index must be less than " + array.length + " and bigger then 0.");
        }
    }

}
