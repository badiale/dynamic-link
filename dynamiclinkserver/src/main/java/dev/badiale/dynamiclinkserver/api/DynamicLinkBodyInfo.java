package dev.badiale.dynamiclinkserver.api;

public class DynamicLinkBodyInfo {
    private final String domainUriPrefix;
    private final String link;
    private final DynamicLinkBodyAndroidInfo androidInfo;

    public DynamicLinkBodyInfo(String domainUriPrefix, String link, DynamicLinkBodyAndroidInfo androidInfo) {
        this.domainUriPrefix = domainUriPrefix;
        this.link = link;
        this.androidInfo = androidInfo;
    }

    public String getDomainUriPrefix() {
        return domainUriPrefix;
    }

    public String getLink() {
        return link;
    }

    public DynamicLinkBodyAndroidInfo getAndroidInfo() {
        return androidInfo;
    }

    @Override
    public String toString() {
        return "DynamicLinkBodyInfo{" +
                "domainUriPrefix='" + domainUriPrefix + '\'' +
                ", link='" + link + '\'' +
                ", androidInfo=" + androidInfo +
                '}';
    }
}
