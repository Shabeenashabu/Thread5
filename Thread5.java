import java.util.*;
class Multi extends Thread5{
public void run(){
System.out.println("Thread is nunning");
}
}
class Thread5{
public static void main(String[] args)
{
Multi t1=new Multi();
t1.run();
}
}
