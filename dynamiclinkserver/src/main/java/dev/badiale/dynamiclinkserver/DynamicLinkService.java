package dev.badiale.dynamiclinkserver;

import dev.badiale.dynamiclinkserver.api.DynamicLinkBody;
import dev.badiale.dynamiclinkserver.api.DynamicLinkBodyAndroidInfo;
import dev.badiale.dynamiclinkserver.api.DynamicLinkBodyInfo;
import dev.badiale.dynamiclinkserver.api.DynamicLinkClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class DynamicLinkService {
    @Autowired
    private DynamicLinkClient dynamicLinkClient;
    @Autowired
    private DynamicLinkProperties properties;

    public String createLink(String parameter1, String parameter2) {
        return dynamicLinkClient.createShortLink(
                properties.getFirebaseApiKey(),
                new DynamicLinkBody(
                        new DynamicLinkBodyInfo(
                                properties.getDomainUri().toString(),
                                UriComponentsBuilder.fromUri(properties.getAppUri())
                                        .queryParam("parameter1", parameter1)
                                        .queryParam("parameter2", parameter2)
                                        .toUriString(),
                                new DynamicLinkBodyAndroidInfo(properties.getAndroidPackage()))))
                .getShortLink();
    }
}
