package dev.badiale.dynamiclinkserver.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "dynamicLinkClient", url = "${dynamicLink.dynamicLinkUrl}")
public interface DynamicLinkClient {

    @PostMapping
    DynamicLinkResponse createShortLink(
            @RequestParam("key") String apiKey,
            DynamicLinkBody body);
}
