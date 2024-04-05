package com.lld.mtb.abstractClasses;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractLog<T> {
    private Map<String, T> logMap;

    public AbstractLog() {
        logMap = new HashMap<>();
    }

    public T getLog(String logId) {
        return logMap.get(logId);
    }

    public void setLog(String logId, T log) {
        logMap.put(logId, log);
    }

}
