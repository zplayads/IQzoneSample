1. Error log
IQZone Applovin report the follow error log:
```
2019-01-10 11:11:10.931 5419-5601/com.zplay.playable.bob.iqzonesample E/AppLovinSdk: Unable to find AppLovin SDK key. Please add     meta-data android:name="applovin.sdk.key" android:value="YOUR_SDK_KEY_HERE" into AndroidManifest.xml.
2019-01-10 11:11:10.931 5419-5601/com.zplay.playable.bob.iqzonesample E/AppLovinSdk: Called with an invalid SDK key from: java.lang.Throwable:
```

2. Debug log
```
D/EgretLoader: The context is not activity
```
As the IQzoneSample showing, I did initialize IQzone SDK by an Activity context.

3. Interstitial display issue.
Open one Activity then reopen another Activity to show the targetAd.
I got tow videos, as followed, [here](./ReportResource/IQzoneSample-interstitial.mp4) and [here](./ReportResource/YumiMediastion-interstitial.mp4) .

4. Banner display issue.
When a Banner is showing, call `imdBannerAd.loadAd()` again, then sometime got a strong black line, like the [picture](./ReportResource/IQzoneSample-Banner.png). the log as below:
```
2019-01-10 11:59:39.485 19875-19875/com.zplay.playable.bob.iqzonesample D/BannerSample: loadAd: 
2019-01-10 11:59:39.532 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: EgretLoader(Context context)
2019-01-10 11:59:39.532 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: The context is not activity
2019-01-10 11:59:39.543 19875-19983/com.zplay.playable.bob.iqzonesample D/AudioManager: getStreamVolume isRestricted mode = 0
2019-01-10 11:59:42.755 19875-20801/com.zplay.playable.bob.iqzonesample D/AudioManager: getStreamVolume isRestricted mode = 0
2019-01-10 11:59:42.970 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: EgretLoader(Context context)
2019-01-10 11:59:42.970 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: The context is not activity
2019-01-10 11:59:43.020 19875-20805/com.zplay.playable.bob.iqzonesample D/AudioManager: getStreamVolume isRestricted mode = 0
2019-01-10 11:59:44.686 19875-19875/com.zplay.playable.bob.iqzonesample D/BannerSample: adFailedToLoad: 
2019-01-10 11:59:46.892 19875-19875/com.zplay.playable.bob.iqzonesample D/BannerSample: loadAd: 
2019-01-10 11:59:46.932 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: EgretLoader(Context context)
2019-01-10 11:59:46.932 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: The context is not activity
2019-01-10 11:59:46.943 19875-19983/com.zplay.playable.bob.iqzonesample D/AudioManager: getStreamVolume isRestricted mode = 0
2019-01-10 11:59:50.162 19875-20811/com.zplay.playable.bob.iqzonesample D/AudioManager: getStreamVolume isRestricted mode = 0
2019-01-10 11:59:50.352 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: EgretLoader(Context context)
2019-01-10 11:59:50.352 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: The context is not activity
2019-01-10 11:59:50.410 19875-20814/com.zplay.playable.bob.iqzonesample D/AudioManager: getStreamVolume isRestricted mode = 0
2019-01-10 11:59:50.418 19875-20091/com.zplay.playable.bob.iqzonesample I/cr_MediaCodecBridge: create MediaCodec video decoder, mime video/avc
2019-01-10 11:59:50.420 19875-20817/com.zplay.playable.bob.iqzonesample I/OMXClient: Treble IOmx obtained
2019-01-10 11:59:50.436 19875-20091/com.zplay.playable.bob.iqzonesample W/VideoCapabilities: Unrecognized profile 2130706433 for video/avc
2019-01-10 11:59:50.436 19875-20091/com.zplay.playable.bob.iqzonesample W/VideoCapabilities: Unrecognized profile 2130706434 for video/avc
2019-01-10 11:59:50.438 19875-20816/com.zplay.playable.bob.iqzonesample I/MediaCodec: MediaCodec will operate in async mode
2019-01-10 11:59:50.438 19875-20816/com.zplay.playable.bob.iqzonesample D/SurfaceUtils: connecting to surface 0x75f86cc010, reason connectToSurface
2019-01-10 11:59:50.438 19875-20816/com.zplay.playable.bob.iqzonesample I/MediaCodec: [OMX.qcom.video.decoder.avc] setting surface generation to 20352002
2019-01-10 11:59:50.438 19875-20816/com.zplay.playable.bob.iqzonesample D/SurfaceUtils: disconnecting from surface 0x75f86cc010, reason connectToSurface(reconnect)
2019-01-10 11:59:50.438 19875-20816/com.zplay.playable.bob.iqzonesample D/SurfaceUtils: connecting to surface 0x75f86cc010, reason connectToSurface(reconnect)
2019-01-10 11:59:50.439 19875-20817/com.zplay.playable.bob.iqzonesample I/ExtendedACodec: setupVideoDecoder()
2019-01-10 11:59:50.445 19875-20817/com.zplay.playable.bob.iqzonesample I/ExtendedACodec: Decoder will be in frame by frame mode
2019-01-10 11:59:50.465 19875-20817/com.zplay.playable.bob.iqzonesample D/SurfaceUtils: set up nativeWindow 0x75f86cc010 for 166x100, color 0x7fa30c06, rotation 0, usage 0x20002900
2019-01-10 11:59:50.472 19875-20817/com.zplay.playable.bob.iqzonesample W/GrallocMapperPassthrough: buffer descriptor with invalid usage bits 0x2000
2019-01-10 11:59:50.479 19875-20817/com.zplay.playable.bob.iqzonesample I/chatty: uid=10633(u0_a633) CodecLooper identical 4 lines
2019-01-10 11:59:50.480 19875-20817/com.zplay.playable.bob.iqzonesample W/GrallocMapperPassthrough: buffer descriptor with invalid usage bits 0x2000
2019-01-10 11:59:50.496 19875-20817/com.zplay.playable.bob.iqzonesample D/SurfaceUtils: set up nativeWindow 0x75f86cc010 for 176x112, color 0x7fa30c06, rotation 0, usage 0x20002900
2019-01-10 11:59:50.501 19875-20817/com.zplay.playable.bob.iqzonesample W/GrallocMapperPassthrough: buffer descriptor with invalid usage bits 0x2000
2019-01-10 11:59:50.502 19875-20817/com.zplay.playable.bob.iqzonesample I/chatty: uid=10633(u0_a633) CodecLooper identical 2 lines
2019-01-10 11:59:50.503 19875-20817/com.zplay.playable.bob.iqzonesample W/GrallocMapperPassthrough: buffer descriptor with invalid usage bits 0x2000
2019-01-10 11:59:50.510 19875-20817/com.zplay.playable.bob.iqzonesample W/GrallocMapperPassthrough: buffer descriptor with invalid usage bits 0x2000
2019-01-10 11:59:50.512 19875-20817/com.zplay.playable.bob.iqzonesample I/chatty: uid=10633(u0_a633) JNISurfaceTextu identical 2 lines
2019-01-10 11:59:50.515 19875-20817/com.zplay.playable.bob.iqzonesample W/GrallocMapperPassthrough: buffer descriptor with invalid usage bits 0x2000
2019-01-10 11:59:52.083 19875-19875/com.zplay.playable.bob.iqzonesample D/BannerSample: adFailedToLoad: 
2019-01-10 12:00:00.275 19875-19875/com.zplay.playable.bob.iqzonesample D/BannerSample: loadAd: 
2019-01-10 12:00:00.317 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: EgretLoader(Context context)
2019-01-10 12:00:00.317 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: The context is not activity
2019-01-10 12:00:00.329 19875-19983/com.zplay.playable.bob.iqzonesample D/AudioManager: getStreamVolume isRestricted mode = 0
2019-01-10 12:00:03.533 19875-20902/com.zplay.playable.bob.iqzonesample D/AudioManager: getStreamVolume isRestricted mode = 0
2019-01-10 12:00:03.651 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: EgretLoader(Context context)
2019-01-10 12:00:03.651 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: The context is not activity
2019-01-10 12:00:03.705 19875-20905/com.zplay.playable.bob.iqzonesample D/AudioManager: getStreamVolume isRestricted mode = 0
2019-01-10 12:00:05.485 19875-19875/com.zplay.playable.bob.iqzonesample D/BannerSample: adFailedToLoad: 
2019-01-10 12:00:17.371 19875-19875/com.zplay.playable.bob.iqzonesample D/BannerSample: adDismissed: 
2019-01-10 12:00:23.444 19875-19875/com.zplay.playable.bob.iqzonesample I/API: onResume()
2019-01-10 12:00:23.478 19875-20005/com.zplay.playable.bob.iqzonesample D/AudioManager: getStreamVolume isRestricted mode = 0
2019-01-10 12:00:24.432 19875-19875/com.zplay.playable.bob.iqzonesample D/BannerSample: loadAd: 
2019-01-10 12:00:24.478 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: EgretLoader(Context context)
2019-01-10 12:00:24.478 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: The context is not activity
2019-01-10 12:00:24.501 19875-19983/com.zplay.playable.bob.iqzonesample D/AudioManager: getStreamVolume isRestricted mode = 0
2019-01-10 12:00:29.039 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: EgretLoader(Context context)
2019-01-10 12:00:29.039 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: The context is not activity
2019-01-10 12:00:29.065 19875-19875/com.zplay.playable.bob.iqzonesample D/BannerSample: adLoaded: 
2019-01-10 12:00:29.142 19875-19875/com.zplay.playable.bob.iqzonesample D/BannerSample: adImpression: 
2019-01-10 12:00:43.611 19875-19875/com.zplay.playable.bob.iqzonesample D/BannerSample: loadAd: 
2019-01-10 12:00:43.657 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: EgretLoader(Context context)
2019-01-10 12:00:43.657 19875-19875/com.zplay.playable.bob.iqzonesample D/EgretLoader: The context is not activity
2019-01-10 12:00:43.685 19875-19875/com.zplay.playable.bob.iqzonesample D/BannerSample: adLoaded: 
2019-01-10 12:00:53.001 19875-20030/com.zplay.playable.bob.iqzonesample D/AudioManager: getStreamVolume isRestricted mode = 0
2019-01-10 12:01:01.888 19875-19973/com.zplay.playable.bob.iqzonesample W/OkHttpClient: A connection to http://i.w.inmobi.cn/ was leaked. Did you forget to close a response body?
```
