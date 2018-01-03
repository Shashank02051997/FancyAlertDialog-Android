# FancyAlertDialog-Android
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=19)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://jitpack.io/v/Shashank02051997/FancyAlertDialog-Android.svg)](https://jitpack.io/#Shashank02051997/FancyAlertDialog-Android)
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
	compile 'com.github.Shashank02051997:FancyAlertDialog-Android:0.1'
}
```
<h2> Fancy Alert Dialog</h2>

```diff
new FancyAlertDialog.Builder(this)
                .setTitle("Rate us if you like the app")
                .setBackgroundColor(Color.parseColor("#303F9F"))  //Don't pass R.color.colorvalue
                .setMessage("Do you really want to Exit ?")
                .setNegativeBtnText("Cancel")
                .setPositiveBtnBackground(Color.parseColor("#FF4081"))  //Don't pass R.color.colorvalue
                .setPositiveBtnText("Rate")
                .setNegativeBtnBackground(Color.parseColor("#FFA9A7A8"))  //Don't pass R.color.colorvalue
                .setAnimation(Animation.POP)
                .isCancellable(true)
                .setIcon(R.drawable.ic_star_border_black_24dp,Icon.Visible)
                .OnPositiveClicked(new FancyAlertDialogListener() {
                    @Override
                    public void OnClick() {
                        Toast.makeText(getApplicationContext(),"Rate",Toast.LENGTH_SHORT).show();
                    }
                })
                .OnNegativeClicked(new FancyAlertDialogListener() {
                    @Override
                    public void OnClick() {
                        Toast.makeText(getApplicationContext(),"Cancel",Toast.LENGTH_SHORT).show();
                    }
                })
                .build();
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
[pull requests](https://github.com/Shashank02051997/FancyDialog-Android/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2017 Shashank Singhal

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
