import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BehaviorLogTopN {
    public static void main(String[] args) {
        String filePath = "behavior.log";
        Map<String, Integer> itemCount = new HashMap<>();

        // 1. 读文件，逐行统计
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 2) {
                    continue; // 跳过脏数据
                }
                String itemId = parts[1].trim();
                itemCount.put(itemId, itemCount.getOrDefault(itemId, 0) + 1);
            }
        } catch (IOException e) {
            System.err.println("读取日志失败: " + e.getMessage());
            return;
        }

        // 2. 按点击次数降序，取前 3
        itemCount.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(3)
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue() + " 次"));
    }
}