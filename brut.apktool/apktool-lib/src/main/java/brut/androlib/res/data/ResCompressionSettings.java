package brut.androlib.res.data;

import java.util.LinkedHashMap;
import java.util.Map;

public class ResCompressionSettings {

    private final Map<String, String> mCompressionSettings = new LinkedHashMap<String, String>();

    public void addCompressionSetting(String file, String value) {
        mCompressionSettings.put(file, value);
    }

    public Map<String, String> getCompressionSettings() {
        return mCompressionSettings;
    }
}
