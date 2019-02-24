package dev.badiale.dynamiclinkserver.api;

public class DynamicLinkBodyAndroidInfo {
    private final String androidPackageName;

    public DynamicLinkBodyAndroidInfo(String androidPackageName) {
        this.androidPackageName = androidPackageName;
    }

    public String getAndroidPackageName() {
        return androidPackageName;
    }

    @Override
    public String toString() {
        return "DynamicLinkBodyAndroidInfo{" +
                "androidPackageName='" + androidPackageName + '\'' +
                '}';
    }
}
