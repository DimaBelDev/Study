package net.study.multithreading.lesson14_callable;

import java.util.concurrent.*;

public class Test {
    static int result;
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

       Future<Integer> future =  executorService.submit(new Factorial(6)); // вызвав метод submit мы только начали выполнять задание
                                                                           // а результат получим в будущем
        try {
            System.out.println(future.isDone()); // проверяет завершил ли поток свою работу возвращает boolean, можем использовать и в Runnable
            System.out.println("Хоти получить результат");
            result = future.get(); // блокирующий метод пока не выполнится задание и не положит результат в Future
            System.out.println("Получили результат");
            System.out.println(future.isDone());
            System.out.println(result);
        } catch (ExecutionException e) {
            e.getCause();
        }finally {
            executorService.shutdown();
        }

    }
}
class Factorial implements Callable<Integer> { // возвращает значение, можем использовать только с ExecutorService
    private final int factorial;
    private int resultFactorial = 1;

    Factorial(int factorial){
        this.factorial = factorial;
    }

    @Override
    public Integer call() throws Exception {
        if(factorial < 1){
            throw new Exception("You have written wrong number");
        }
        for(int i = 1; i <= factorial;i++){
            resultFactorial*=i;
            Thread.sleep(1000);
        }
        return resultFactorial;
    }
}
