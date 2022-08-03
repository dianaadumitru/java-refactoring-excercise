package com.mcserby.training.refactoring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InternationalValues {
    private Map<String, Details> values;

    public InternationalValues() {
        values = new HashMap<>();
        values.put("uk", null);
        values.put("nl", null);
        values.put("de", null);
        values.put("fr", null);
        values.put("es", null);
        values.put("it", null);
        values.put("at", null);
        values.put("chFr", null);
        values.put("chDe", null);
        values.put("ru", null);
        values.put("hr", null);
        values.put("gr", null);
        values.put("sr", null);
        values.put("chIt", null);
        values.put("beFr", null);
        values.put("li", null);
        values.put("bl", null);
        values.put("pl", null);
        values.put("ua", null);
        values.put("cz", null);
        values.put("sv", null);
        values.put("caEs", null);
        values.put("zh", null);
        values.put("luDe", null);
        values.put("beNl", null);
        values.put("luFr", null);
    }

    public Map<String, Details> getValues() {
        return values;
    }

    public String getName(String key) {
        return values.get(key).getName();
    }

    public String getDescription(String key) {
        return values.get(key).getDescription();
    }
}
