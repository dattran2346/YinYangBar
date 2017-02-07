[![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)
#YinYangBar
YinYangBar is a fork of https://github.com/oli107/material-range-bar that I leverage the awesome UI desgin but tweak the functionality to my own need.
It is similar to an enhanced SeekBar widget, though it add a functionality of showing the range from the middle of the bar.

![Img](https://github.com/dattran2346/YinYangBar/blob/master/demo.gif)


### Tick Properties
```
tickStart | float
tickEnd | float
tickInterval | float
tickHeight | dimension
tickColor | color
```
###  Bar Properties
```
yinYangBar | boolean
barWeight | dimension
yinYBarColor | reference or color
barPaddingBottom | dimension
connectingLineWeight | dimension
connectingLineColor | reference or color
```

### Pin Properties
```
pinPadding | dimension
pinRadius | dimension
pinMinFont | dimension
pinMaxFont | dimension
pinColor | reference or color
textColor | reference or color
temporaryPins | boolean
```

### Selector Properties
```
selectorColor | reference or color
selectorSize | dimension
```

Examples
=======

## Layout XML

This is a rangebar with both a lower and upper value
```xml
<com.codee.YinYangBar
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/yybar"
        app:layout_width="match_parent"
        app:layout_height="72dp"
        app:tickStart="-30"
        app:tickInterval="1"
        app:tickEnd="30"
        android:layout_marginLeft="16dp"
        android:layout_marginRight="16dp"/>
```

## Adding a listener
//TODO add a full example here
- Add a listener - rangeBar.setOnRangeBarChangeListener which returns left and right index as well as value.
```java
yyBar.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex,
                    int rightPinIndex,
                    String leftPinValue, String rightPinValue) {
            }
        });
```

## Adding a formatter
Formats the text inside the pin.
- Add a formater - IRangeBarFormatter which will return the value of the current text inside of the pin
- Transform string s into any string you want and return the newly formated string.
```java
rangebar.setFormatter(new IRangeBarFormatter() {
            @Override
			public String format(String s) {
				// Transform the String s here then return s
                return null;
            }
        });
```

Installation
=======

**build.gradle**

```groovy
dependencies {
    compile 'com.codee.yinyangbar:yinyangbar:0.1.8'
}
```

## License

    Copyright [2017] [Ch4ul3n3]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.