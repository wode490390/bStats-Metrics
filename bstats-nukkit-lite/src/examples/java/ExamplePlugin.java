import cn.nukkit.plugin.PluginBase;
import org.bstats.nukkit.MetricsLite;

public class ExamplePlugin extends PluginBase {

    @Override
    public void onEnable() {
        // All you have to do is adding the following two lines in your onEnable method.
        // You can find the plugin ids of your plugins on the page https://bstats.org/what-is-my-plugin-id
        int pluginId = 1234; // <-- Replace with the id of your plugin!
        MetricsLite metrics = new MetricsLite(this, pluginId);
    }

}
