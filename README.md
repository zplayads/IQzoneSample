使用 IQZone 反馈的安装包接入有如下问题：

### 编译错误：
1. IQZone 引入 Mopub 后，出现 `Could not find com.moat.analytics.mobile.mpub:moat-mobile-app-kit:2.4.1.`
将  `moat-mobile-app-kit` 剔除后，这个编译错误消失
```
implementation('com.mopub:mopub-sdk:5.0.0@aar') {
    transitive = true
    exclude module: 'moat-mobile-app-kit'
}
```

2. 不知道 taglibs 代表什么意思
```
 taglibs 'com.google.code.gson:gson:2.7'

 Could not find method taglibs() for arguments [com.google.code.gson:gson:2.7] on object of type org.gradle.api.internal.artifacts.dsl.dependencies.DefaultDependencyHandler.
```
删除  ```taglibs 'com.google.code.gson:gson:2.7'``` 后，此编译错误消失

### 广告显示异常
1. 使用给出的广告 ID 加载 Banner 与 插屏没有填充，只有 `adFailedToLoad()` 回调，看不出什么原因导致没有填充
2. 视频有广告展示，但展示出广告后，切换到手机桌面，再点击应用图标进入应用时，广告消失。