package test;

import com.demo.jdk8.ExtensionMethods.ExtensionMethod;
import org.junit.Test;

public class ExtensionMethodTest {
    @Test
    public void test1(){
        ExtensionMethod extensionMethod = new ExtensionMethod() {
            @Override
            public double calculate(int a) {
                return sqrt(a*100);
            }
        };
        System.out.println(extensionMethod.calculate(100));
        System.out.println(extensionMethod.sqrt(100));
    }
}
