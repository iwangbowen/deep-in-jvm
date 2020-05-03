import java.util.ArrayList;
import java.util.List;

public class Main {
    private int m;
    
    public int bitOperate() {
    	int a = 9999;
    	return a >> 2;
    }

    @Deprecated
    public int inc() {
        int liuli = 1;
        int b = 5;
        int c = 7;
        int d = liuli + b + c;
        return d + m + 1;
    }

    public int test() {
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