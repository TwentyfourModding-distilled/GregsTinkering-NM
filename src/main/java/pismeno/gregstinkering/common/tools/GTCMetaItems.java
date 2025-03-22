package pismeno.gregstinkering.common.tools;

public class GTCMetaItems {
    public static GTCMetaItem META_ITEM;
    public static void preInit() {
        META_ITEM = new GTCMetaItem();
        META_ITEM.setRegistryName("gtc_meta_item");
    }
}
