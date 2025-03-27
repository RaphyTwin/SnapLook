package de.raphy.neoforge;

import de.raphy.common.Client;
import net.neoforged.fml.common.Mod;

@Mod(Client.MOD_ID)
public final class NeoForgeEntrypoint {

    private static Client client;

    public NeoForgeEntrypoint() {
        client = new Client();

        client.init();
    }

}
