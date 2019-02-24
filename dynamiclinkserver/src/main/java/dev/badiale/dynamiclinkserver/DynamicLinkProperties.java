package dev.badiale.dynamiclinkserver;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotNull;
import java.net.URI;

@ConfigurationProperties(prefix = "dynamic-link")
public class DynamicLinkProperties {
    @NotNull
    private String firebaseApiKey;
    @NotNull
    private URI dynamicLinkUrl;
    @NotNull
    private URI domainUri;
    @NotNull
    private URI appUri;
    @NotNull
    private String androidPackage;

    @NotNull
    public String getFirebaseApiKey() {
        return firebaseApiKey;
    }

    public void setFirebaseApiKey(@NotNull String firebaseApiKey) {
        this.firebaseApiKey = firebaseApiKey;
    }

    @NotNull
    public URI getDynamicLinkUrl() {
        return dynamicLinkUrl;
    }

    public void setDynamicLinkUrl(@NotNull URI dynamicLinkUrl) {
        this.dynamicLinkUrl = dynamicLinkUrl;
    }

    @NotNull
    public URI getDomainUri() {
        return domainUri;
    }

    public void setDomainUri(@NotNull URI domainUri) {
        this.domainUri = domainUri;
    }

    @NotNull
    public URI getAppUri() {
        return appUri;
    }

    public void setAppUri(@NotNull URI appUri) {
        this.appUri = appUri;
    }

    @NotNull
    public String getAndroidPackage() {
        return androidPackage;
    }

    public void setAndroidPackage(@NotNull String androidPackage) {
        this.androidPackage = androidPackage;
    }

    @Override
    public String toString() {
        return "DynamicLinkProperties{" +
                "firebaseApiKey=\'*****\'" +
                ", dynamicLinkUrl=" + dynamicLinkUrl +
                ", domainUri=" + domainUri +
                ", appUri=" + appUri +
                ", androidPackage='" + androidPackage + '\'' +
                '}';
    }
}
