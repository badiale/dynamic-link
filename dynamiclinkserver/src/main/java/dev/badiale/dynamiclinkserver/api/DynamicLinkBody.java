package dev.badiale.dynamiclinkserver.api;

public class DynamicLinkBody {
    private final DynamicLinkBodyInfo dynamicLinkInfo;

    public DynamicLinkBody(DynamicLinkBodyInfo dynamicLinkInfo) {
        this.dynamicLinkInfo = dynamicLinkInfo;
    }

    public DynamicLinkBodyInfo getDynamicLinkInfo() {
        return dynamicLinkInfo;
    }

    @Override
    public String toString() {
        return "DynamicLinkBody{" +
                "dynamicLinkInfo=" + dynamicLinkInfo +
                '}';
    }
}
