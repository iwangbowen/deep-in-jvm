import java.util.ArrayList;
import java.util.List;

/*
    1.增加内部类验证javac如何编译包含内部类的代码
    2.增加泛型验证Signature树形
*/

public class Main {
    private int m;

    @Deprecated
    public int inc() {
        int liuli = 1;
        int b = 5;
        int c = 7;
        int d = liuli + b + c;
        return d + m + 1;
    }

    public int test() {
        int hello;
        int c = 1 + 3;
        int a = calc(1, c);
        return a;
    }

    public int calc(int a, int b) {
        return a + b;
    }

    public int excep() {
        int x;
        try {
            x = 1;
            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }

    public void generic(String[] args) {
        Box<Integer, List<String>> box
           = new Box<Integer, List<String>>();

        List<String> messages = new ArrayList<String>();

        messages.add("Hi");
        messages.add("Hello");
        messages.add("Bye");

        box.genericAdd(Integer.valueOf(10),messages);
        System.out.printf("Integer Value :%d\n", box.getFirst());
        System.out.printf("String Value :%s\n", box.getSecond());
     }

    class Box<T, S> {
    	   private T t;
    	   private S s;

    	   public void genericAdd(T t, S s) {
    		   int whatisgoingon = 5;
    		   System.out.println(whatisgoingon + 5);
    	      this.t = t;
    	      this.s = s;
    	   }

    	   public T getFirst() {
    	      return t;
    	   }

    	   public S getSecond() {
    	      return s;
    	   }
    	}
}