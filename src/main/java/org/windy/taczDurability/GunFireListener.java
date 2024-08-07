package org.windy.taczDurability;

import com.tacz.guns.api.event.common.GunFireEvent;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public class GunFireListener {
    private boolean hasFired = false;

    public GunFireListener() {
        // 注册事件监听器
        GunFireEvent.EVENT.register(this::onGunFire);
    }

    // 事件回调方法
    public void onGunFire(GunFireEvent event) {
        this.hasFired = true;
        System.out.println("枪械已经开火！");
    }

    // 检查是否发生了开枪事件
    public boolean hasFired() {
        return this.hasFired;
    }

    // 重置开枪状态
    public void resetFired() {
        this.hasFired = false;
    }
}