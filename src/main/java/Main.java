import java.util.*;
public class Main {
    private static final String TAG = "WorkerFactory_a5ca4b";
    public static Map<String, Object> collectInfo() { Map<String, Object> info = new LinkedHashMap<>(); info.put("tag", TAG); info.put("java", System.getProperty("java.version")); info.put("os", System.getProperty("os.name")); info.put("arch", System.getProperty("os.arch")); return info; }
    public static void main(String[] args) { System.out.println("[" + TAG + "] Collecting system info..."); collectInfo().forEach((k, v) -> System.out.println("  " + k + ": " + v)); }
}
