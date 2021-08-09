import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @ProjectName: leetBookCode
 * @Package: PACKAGE_NAME
 * @ClassName: AppMain
 * @Author: lengjx
 * @Description: 运行测试用例
 * @Date: 2021/7/30 14:32
 */
public class AppMain {

    public static void main(String[] args) {
        try {
            URL url = new URL("file:/D:/leet-book-code/src/com/improvement/code/jvm/");
            URL[] newURL = new URL[]{url};
            URLClassLoader loader = new URLClassLoader(newURL);
            Class cl = loader.loadClass("MgDemoSample");
            System.err.println("...." + cl.getName());
            Object instance = cl.newInstance();
            Method mainMethod = cl.getMethod("startSample");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

}
