package de.raphy.fabric;

import de.raphy.common.Client;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class FabricEntrypoint implements ModInitializer, ClientModInitializer {

    private static Client client;

    @Override
    public void onInitialize() {
        client = new Client();
    }

    @Override
    public void onInitializeClient() {
        client.init();
    }

}
