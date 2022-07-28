# FancyAlertDialog-Android
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-15%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=15)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://jitpack.io/v/Shashank02051997/FancyAlertDialog-Android.svg)](https://jitpack.io/#Shashank02051997/FancyAlertDialog-Android)
[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-FancyAlertDialog-green.svg?style=flat )]( https://android-arsenal.com/details/1/6626 ) [![Javadoc](https://img.shields.io/badge/javadoc-SNAPSHOT-green.svg)](https://jitpack.io/com/github/Shashank02051997/FancyAlertDialog-Android/master-SNAPSHOT/javadoc/index.html)

<a href="https://play.google.com/store/apps/details?id=com.shashank.sony.fancylibrarybyshashank">
    <img alt="Get it on Google Play"
        height="80"
        src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" />
</a>

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.Shashank02051997:FancyAlertDialog-Android:0.3'
}
```
<h2> Fancy Alert Dialog</h2>

```diff
 FancyAlertDialog.Builder
                .with(this)
                .setTitle("Rate us if you like the app")
                .setBackgroundColor(Color.parseColor("#303F9F"))  // for @ColorRes use setBackgroundColorRes(R.color.colorvalue)
                .setMessage("Do you really want to Exit ?")
                .setNegativeBtnText("Cancel")
                .setPositiveBtnBackground(Color.parseColor("#FF4081"))  // for @ColorRes use setPositiveBtnBackgroundRes(R.color.colorvalue)
                .setPositiveBtnText("Rate")
                .setNegativeBtnBackground(Color.parseColor("#FFA9A7A8"))  // for @ColorRes use setNegativeBtnBackgroundRes(R.color.colorvalue)
                .setAnimation(Animation.POP)
                .isCancellable(true)
                .setIcon(R.drawable.ic_star_border_black_24dp, View.VISIBLE)
                .onPositiveClicked(dialog -> Toast.makeText(MainActivity.this, "Rate", Toast.LENGTH_SHORT).show())
                .onNegativeClicked(dialog -> Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show())
                .build()
                .show();
```
#### Animation

There are 3 type of pre-defined animation you can use : `POP`, `SLIDE` and `SIDE`

##### Pop Animation

You can add this animation to your dialog by using `.setAnimation(Animation.POP)`

##### Side Animation

This animation let dialog enter screen from left and exit from right. You can add this animation to your dialog by using `.setAnimation(Animation.SIDE)`

##### Slide Animation

This animation let dialog enter screen from bottom and exit from bottom. You can add this animation to your dialog by using `.setAnimation(Animation.SLIDE)`

## Screenshots

**Please click the image below to enlarge.**


<img src="https://github.com/Shashank02051997/FancyAlertDialog-Android/blob/master/fancydialogimg.png">


## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/Shashank02051997/FancyAlertDialog-Android/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

### Contact - Let's become friends
- [Twitter](https://twitter.com/shashank020597)
- [Github](https://github.com/Shashank02051997)
- [Linkedin](https://www.linkedin.com/in/shashank-singhal-a87729b5/)
- [Facebook](https://www.facebook.com/shashanksinghal02)

## Donation
If this project help you reduce time to develop, you can give me a cup of coffee :)

<a href="https://www.buymeacoffee.com/mXUuDW7" target="_blank"><img src="https://bmc-cdn.nyc3.digitaloceanspaces.com/BMC-button-images/custom_images/orange_img.png" alt="Buy Me A Coffee" style="height: auto !important;width: auto !important;" ></a>

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2018 Shashank Singhal

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
