package server.managers;

import server.utilities.Console;

import java.util.Map;
import java.util.StringJoiner;
import java.util.TreeMap;

public class DumpManager {
    private final String fileName;
    private final Console console;
    public DumpManager(String fileName, Console console) {
        this.fileName = fileName;
        this.console = console;
    }

    public static <K> String treeMapToCsv(TreeMap<K, String[]> treeMap) {
        if (treeMap == null || treeMap.isEmpty()) {
            return "";
        }

        StringJoiner csvJoiner = new StringJoiner("\n");

        for (Map.Entry<K, String[]> entry : treeMap.entrySet()) {
            StringJoiner rowJoiner = new StringJoiner(",");
            rowJoiner.add(entry.getKey().toString());


            StringJoiner valueJoiner = new StringJoiner(";");
            for (String value : entry.getValue()) {
                valueJoiner.add(value);
            }
            rowJoiner.add(valueJoiner.toString());

            csvJoiner.add(rowJoiner.toString());
        }

        return csvJoiner.toString();
    }
}
