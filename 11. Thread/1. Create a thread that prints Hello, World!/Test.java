//Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.
class Thread1 extends Thread
{
    @Override
    public void run()
    {
        System.out.print("Hello Kuheli");
    }
}


class Test
{
    public static void main(String[] args)
    {
        Thread1 t1 = new Thread1();
        t1.start();
    }
}