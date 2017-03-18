package terela.com.spring6;// Created by tolik on 12.03.2017.

import terela.com.withoutspring.WriterToFile;

import java.util.List;

public class CacheWriter {
    private int cacheSize;
    private List<String> cache;
    private String cacheString;

    public CacheWriter(int cacheSize, String filename) {
        this.cacheSize = cacheSize;

    }

    public void destroy() {
        if (cacheSize != 0) {
            WriterToFile writerToFile = new WriterToFile();
            String cacheString = null;
            for (String s : cache) {
                cacheString = cacheString + s + "\n";
            }
            writerToFile.write(cacheString);
        }
    }

    public void setCacheString(String cacheString) {
        this.cacheString = cacheString;
    }

    public String getCacheString() {
        return cacheString;
    }

}
