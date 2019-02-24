package dev.badiale.dynamiclinkserver;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotNull;

@ConfigurationProperties(prefix = "dynamic.link")
public class DynamicLinkProperties {
    @NotNull
    private String firebaseApiKey;

    @NotNull
    public String getFirebaseApiKey() {
        return firebaseApiKey;
    }

    public void setFirebaseApiKey(@NotNull String firebaseApiKey) {
        if (firebaseApiKey == null) {
            throw new NullPointerException("firebaseApiKey must not be null");
        }
        this.firebaseApiKey = firebaseApiKey;
    }
}
