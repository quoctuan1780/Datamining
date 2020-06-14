package HashSet;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<String>();
        setA.add("Java".toLowerCase());
        setA.add("Python".toLowerCase());
        setA.add("JAVA".toLowerCase());
        setA.add("PHP".toLowerCase());
        System.out.println("Số phần tử của setA: " + setA.size());
        System.out.println("Các phần tử của setA: " + setA);
        System.out.println("setA có chứa Java không? " + setA.contains("Java"));
        System.out.println("setA có chứa C++ không? " + setA.contains("C++"));
    }
}
	