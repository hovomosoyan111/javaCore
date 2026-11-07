package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(5);
        da.add(10);
        da.add(15);
        da.add(20);
        da.add(25);
        da.print();

        System.out.println();
DynamicArray da1 = new DynamicArray();
        da1.add(2);
        da1.add(3);
        da1.add(4);
        da1.add(5);
        da1.add(6);
        da1.add(7);
        da1.add(8);
        da1.add(9);
        da1.add(10);
        da1.add(11);
        da1.add(12);
        da1.add(13);
        da1.add(14);
        da1.add(15);
        da1.add(16);
        da1.print();

        System.out.println();
DynamicArray da2 = new DynamicArray();
        da2.add(1);
        da2.add(2);
        da2.add(3);
        da2.add(4);
        da2.add(5);
        da2.add(6);
        da2.add(7);
        da2.add(8);
        da2.add(9);
        da2.add(10);
        da2.add(11);
        da2.add(12);
        da2.add(13);
        da2.add(14);
        da2.add(15);
        da2.add(16);
        da2.add(17);
        da2.add(18);
        da2.add(19);
        da2.add(20);
        da2.add(21);
        da2.add(22);
        da2.add(23);
        da2.add(24);
        da2.add(25);
        da2.print();

        System.out.println();

        System.out.println(da2.getByIndex(0));
        System.out.println(da2.getByIndex(24));
        System.out.println(da2.getByIndex(-1));
        System.out.println(da2.getByIndex(999));

    }
}








