package lesson3.pair;



public class GenericsDemoApp {

    public static class GenericBox<T> {
        private T obj;

        public GenericBox(T оbj) {
            this.obj = оbj;
        }

        public T getObj() {
            return obj;
        }

        public void showType() {
            System.out.println("Тип T: " + obj.getClass().getName());
        }
    }

    public static void main(String args[]) {
        GenericBox<String> genStr = new GenericBox<>("Hello");
        genStr.showType();
        System.out.println("genStr.getObject(): " + genStr.getObj());
        GenericBox<Integer> genInt = new GenericBox<>(140);
        genInt.showType();
        System.out.println("genInt.getObject(): " + genInt.getObj());
        int valueFromGenInt = genInt.getObj();
        String valueFromGenString = genStr.getObj();
        // genInt.setObj("Java"); // Ошибка компиляции !!!
    }
}
