import com.hqins.dp.DynamicProxyHandler;
import com.hqins.dp.Interface;
import com.hqins.dp.RealObject;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args){

        // Create dynamic proxy object
        Interface dp = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(new RealObject()));
        dp.doSomething();
        dp.doOthering("hello world");
    }
}
