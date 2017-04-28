package kr.javacafe.java;

/**
 * Created by Chihwan on 2017. 4. 27..
 */
public class RunnableTest {

    public static void main(String args[]) {
        // 람다 사용
        Runnable runnable1 = () -> System.out.println("Hello World 1");

        // 익명 클래스 사용
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World 2");
            }
        };


        process(runnable1);
        process(runnable2);
        // 직접 전달된 람다 사용
        process(() -> System.out.println("Hello World 3"));
    }

    public static void process(Runnable r){
        r.run();
    }

}
