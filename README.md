# EaseInterpolator
Thirty different easing animation interpolators for Android.

## Demo
![](https://raw.githubusercontent.com/cimi-chen/EaseInterpolator/master/demo.gif)

## Installation

In order to use the library, there are 2 options:
**1. Add jar file as library**`(Recommend)`
 - Download the [**ease-interpolator-1.0.jar**](https://github.com/cimi-chen/EaseInterpolator/blob/master/libs/ease-interpolator-1.0.jar?raw=true).
 - Copy the **ease-interpolator-.jar** file into the `libs` folder of your Android application project.
 - Start using the library.
	
**2. Clone whole repository**
 - Open your **commandline-input** and navigate to your desired destination folder (where you want to put the library).
 - Use the command `git clone https://github.com/cimi-chen/EaseInterpolator` to download the full **EaseInterpolator** repository to your computer (this includes the folder of the library project as well as the demo project).
 - Import the library folder (`EaseInterpolatorLib`) into your workspace.
 - Add it as a reference to your project.

## Usage

```java
	Interpolator interpolator = new EaseBounceInInterpolator();
    Animation anim = new TranslateAnimation(0, 0, 0, 200);
    anim.setDuration(1200);
    anim.setInterpolator(interpolator);
    view.startAnimation(anim);
```

## License

Copyright 2015 [cimi-chen](https://github.com/cimi-chen)

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at [LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
