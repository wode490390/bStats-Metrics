import cn.nukkit.plugin.PluginBase;
import org.bstats.nukkit.MetricsLite;

public class ExamplePlugin extends PluginBase {

    @Override
    public void onEnable() {
        // All you have to do is adding this line in your onEnable method:
        MetricsLite metrics = new MetricsLite(this);
    }

}
