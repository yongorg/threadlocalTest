/**
 * @Author yongz
 * @Date 2020/3/30、10:10
 */
public class ThreadLocalUtli {
    private static ThreadLocal<String> threadLocal = new ThreadLocal();

    public static String getTrace() {
        return threadLocal.get();
    }

    public static void setTrace(String traceId) {
        threadLocal.set(traceId);
    }
}
