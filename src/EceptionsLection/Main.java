package EceptionsLection;

import Attempt2.Book;
import Multithreading.RunnableTimer;
import Test.Empty;

public class Main {

    static boolean win = false;
    static boolean bool = false;
    public static void main(String[] args) {
//        int a = 1;
//        try {
//            int b = 6 / a;
//            String s = "12jkl";
//            int i = Integer.parseInt(s);
//        } catch (ArithmeticException e) {
//            System.out.println("You can not divide by zero");
//        } catch (NumberFormatException e1) {
//            System.out.println("Error of transforming");
//        }
//        } catch (ArithmeticException e) {
//            System.out.println("You can not divide by zero");
//        } catch (Exception e1) {
//
//        } finally {
//            System.out.println("We are in finally block");
//        }

//        System.out.println("Hello");

//        int[] massiv = new int[10];
//
//        for (int i = 0; i <= 10; i++) {
//            try {
//                massiv[i] = i;
//                System.out.print(massiv[i] + " ");
//            } catch (IndexOutOfBoundsException e1) {
//                System.out.println("Index out Of bound Exception LoL");
//            }
//        }
//
//        try {
//            System.out.println(massiv[12]);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Exception catched");
//        }

//        Empty empty = new Empty(2,3);
//        empty.toString();
//        System.out.println(empty);

//        double random = Math.random();
//        random *= 6;
//        int randomInt = (int) random;
//        randomInt++;
//        int result = (int) (Math.random() * 6 + 1);
//        System.out.println(result);


//        int random = (int) (Math.random() * 90 + 10);
//        Empty empty = new Empty(random);
//        System.out.println(empty.toString());
//        String count = String.format("Random count: %s", random);
//        System.out.println(count);

//        Runnable timers = new RunnableTimer();

//        Thread timer = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    int result = 0;
//                    while (true) {
//                        System.out.println(result);
//                        result++;
//                        Thread.sleep(1000);
//                        if (result == 5) {
//                            bool = true;
//                        }
//                    }
//
//                } catch (Exception e) {
//
//                }
//            }
//        });
//        timer.start();
//        for (int i = 0; i < 1000000; i++) {
//            System.out.println(2);
//        }

//        Thread timers = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    for (int i = 0; i < 1000000; i++) {
//                        System.out.println(2);
//                        Thread.sleep(1000);
//                    }
//                } catch (Exception e) {
//
//                }
//            }
//        });
//        timers.start();

//        Thread timer2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    int result = 0;
//                    while (!bool) {
//                        System.out.println(result);
//                        result++;
//                        Thread.sleep(1000);
//                    }
//
//                } catch (Exception e) {
//
//                }
//            }
//        });
//        timer2.start();

//            int count = (int) (Math.random() * 900000 + 100000);
//            System.out.println(count);
//
//            Thread thread1 = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    int i = 0;
//                    try {
//                        while (true) {
//                            System.out.println(i);
//                            i++;
//                            Thread.sleep(1000);
//                        }
//                    } catch (Exception e) {
//
//                    }
//
//                }
//            });
//            thread1.start();
//
//            Thread thread2 = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    while (true) {
//                        int s = (int) (Math.random() * 900000 + 100000);
//                        if (s == count) {
//                            System.out.println(s);
//                            break;
//                        }
//                    }
//                }
//            });

        int s = (int) (Math.random() * 1000000000);
        System.out.println(s);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while (!win) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {

                }
            }
        });

        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!win) {
                    int guessNumber = (int) (Math.random() * 1000000000);
                    if (guessNumber == s) {
                        win = true;
                        System.out.println(guessNumber);
                    }
                }
            }
        });

        thread.start();
        player.start();

    }
}
