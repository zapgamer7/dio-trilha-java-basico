public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        Short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2);

        final Double PI = 3.14;

        System.out.println(PI);
    }
}