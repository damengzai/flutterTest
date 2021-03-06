package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.view.TextViewFactory;

public final class ViewRegistrant {
    public static void registerWith(PluginRegistry registry) {
        final String key = ViewRegistrant.class.getCanonicalName();
        if (registry.hasPlugin(key)) {
            return;
        }
        PluginRegistry.Registrar registrar = registry.registrarFor(key);
        registrar.platformViewRegistry().registerViewFactory("TextView", new TextViewFactory(new StandardMessageCodec()));
    }
}
