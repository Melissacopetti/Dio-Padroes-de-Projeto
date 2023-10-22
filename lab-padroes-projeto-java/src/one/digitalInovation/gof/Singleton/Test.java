package one.digitalInovation.gof.Singleton;
// testes relacionados ao Design Patterns Singleton
public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy =SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonEager eager =SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder =SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        eager = SingletonEager.getInstancia();
        System.out.println(holder);


    }
}
