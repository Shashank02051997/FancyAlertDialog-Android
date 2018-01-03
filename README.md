# FancyAlertDialog-Android
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=19)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://jitpack.io/v/Shashank02051997/FancyToast-Android.svg)](https://jitpack.io/#Shashank02051997/FancyToast-Android)
[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-FancyToast-green.svg?style=flat )]( https://android-arsenal.com/details/1/6357 )
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
## Usage

<h2> Fancy Alert Dialog</h2>

```diff
+ new EasyCustomDialog.Builder(this,"Exit!")
                .setSubTitle("Are you Sure?")
                //.setHeader("Hello Guest")
                //.setIcon(getResources().getDrawable(R.drawable.ic_error_outline_black_24dp))
                //.setIcon(ContextCompat.getDrawable(this, R.drawable.animlogo))
                .setPositiveBtnText("Yes")
                .setNegativeBtnText("No")
                .onConfirm(new EasyCustomDialogListener() {
                    @Override
                    public void execute() {
                        Toast.makeText(getApplicationContext(),"Ok",Toast.LENGTH_LONG).show();
                    }
                })
                .onCancel(new EasyCustomDialogListener() {
                    @Override
                    public void execute() {
                        Toast.makeText(getApplicationContext(),"Cancel",Toast.LENGTH_LONG).show();
                    }
                })
                .build();
```

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
