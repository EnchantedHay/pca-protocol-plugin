package org.emptycity.pcaProtocol.nms.v1_21_11.object;

import org.emptycity.pcaProtocol.object.IResourceLocation;
import net.minecraft.resources.Identifier;

/**
 * @Auther: Administrator
 * @Date: 2025/5/17 04:24:50
 * @Description:
 */
public class ResourceLocationImpl implements IResourceLocation {
    @Override
    public Identifier getInstance(String channel) {
        return Identifier.parse(channel);
    }
}
