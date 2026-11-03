<div align="center">

<img src="assets/banner.svg" alt="TaczDurability" width="100%">

# TaczDurability

**TACZ 枪械耐久** —— 让 Timeless and Classics Zero 的枪械真正消耗耐久：开火即磨损，给火力上限。

![Platform](https://img.shields.io/badge/Platform-Spigot%20%2F%20Paper-62bda8?style=flat-square&logo=minecraft&logoColor=white)
![Minecraft](https://img.shields.io/badge/MC-1.20.x-8a9a5b?style=flat-square)
![Java](https://img.shields.io/badge/Java-17-f89820?style=flat-square&logo=openjdk&logoColor=white)

[功能](#-功能) · [配置](#️-配置)

</div>

## ✨ 功能

- **开火磨损**：`GunFireListener` 监听 TACZ 枪械射击事件，每次开火按规则扣减枪械耐久
- **枪械白名单**：`Guns` 配置指定受管理的枪械 ID（默认 `TACZ-FABRIC_MODERN_KINETIC_GUN`）
- **混合端可用**：面向 Spigot/Paper 插件层实现，配合 TACZ 前置正常工作

## ⚙️ 配置

```yaml
Guns:
  - TACZ-FABRIC_MODERN_KINETIC_GUN
```

## 🔨 构建

```bash
./gradlew build
```
