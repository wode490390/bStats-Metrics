import cn.nukkit.plugin.PluginBase;
import org.bstats.nukkit.Metrics;

public class ExamplePlugin extends PluginBase {

    @Override
    public void onEnable() {
        // All you have to do is adding this line in your onEnable method:
        Metrics metrics = new Metrics(this);

        // Optional: Add custom charts
        metrics.addCustomChart(new Metrics.SimplePie("chart_id", () -> "My value"));
    }

}
