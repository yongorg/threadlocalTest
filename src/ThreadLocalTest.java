/**
 * @Author yongz
 * @Date 2020/3/30、9:57
 */
public class ThreadLocalTest {

    /**
     * 使用ThreadLocal 解决架构中传参的烦恼。
     * 注意：ThreadLocal的边界，异步调用的传参问题。
     * @param args
     */
    public static void main(String[] args) {
        ThreadLocalUtli.setTrace("我是郑勇");
        new Thread(() -> new Test1().test1()).start(); //异步调用
        new Test1().test1();//同步调用
        new Test2().test2();//同步调用
    }

}
