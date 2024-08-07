package org.windy.taczDurability;

import com.tacz.guns.api.event.common.GunFireEvent;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;
import java.util.logging.Logger;

public final class TaczDurability extends JavaPlugin implements Listener {

    private List<String> guns;
    private boolean debug;
    private Logger logger;

    @Override
    public void onEnable() {
        // 保存默认配置文件
        saveDefaultConfig();
        // 读取配置文件中的值
        loadConfigValues();
        // 注册事件监听器
        getServer().getPluginManager().registerEvents(this, this);

        logger = getLogger();

        FileConfiguration config = getConfig();
        debug = config.getBoolean("debug", true);
    }

    private void loadConfigValues() {
        FileConfiguration config = getConfig();
        guns = config.getStringList("guns");
    }

    private void log(String message) {
        if (debug) {
            logger.info(message);
        }
    }

    private boolean isGun(Material itemType) {
        return guns.contains(itemType.name());
    }


    public void onGunFire(GunFireEvent event) {
        GunFireListener gunFireListener = new GunFireListener();
        log("有人开枪！" );
      /*  if (item != null && isGun(item.getType())) {
            log(playerName+"持枪！");

            // 检查是否发生了开枪行为
            if (gunFireListener.hasFired()) {
                String shooterName = event.getPlayer().getName();
                log("检测到开枪行为！射手: " + shooterName);
            } else {
                log("没有检测到开枪行为。");
            }*/
            // 重置开枪状态
            gunFireListener.resetFired();
        }
    //}

}