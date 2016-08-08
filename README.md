Donut Progress
=======
 [ ![Download](https://api.bintray.com/packages/javiergm/maven/DonutProgress/images/download.svg) ](https://bintray.com/javiergm/maven/DonutProgress/_latestVersion)

## Captures

Normal

![MainImage](https://raw.githubusercontent.com/javierugarte/donut-progress-android/master/captures/donutprogress_types.png)

With animation

![animation demo](https://raw.githubusercontent.com/javierugarte/donut-progress-android/master/captures/donutprogress_animation.gif)

## Download


- Using Gradle

```groovy
    compile 'com.bikomobile:donutprogress:1.2.0'
```

- Using Maven

```xml
    <dependency>
        <groupId>com.bikomobile</groupId>
        <artifactId>donutprogress</artifactId>
        <version>1.2.0</version>
        <type>pom</type>
    </dependency>
```


## How to use this library


- java

```java

	int percent = 40;
	        
	DonutProgress donutProgress = (DonutProgress) findViewById(R.id.donut_progress);
			
	donutProgress.setProgress(percent);
	// or if you want animation progress
	donutProgress.setProgressWithAnimation(percent, 20);
	
```

- xml

```xml
	<com.bikomobile.donutprogress.DonutProgress
	            android:id="@+id/donut_progress"
	            android:layout_width="54dp"
	            android:layout_height="54dp"
	            custom:donut_finished_stroke_width="5dp"
	            custom:donut_unfinished_stroke_width="5dp"
                custom:donut_suffix="%"
	            custom:donut_text_size="14sp"
	            custom:donut_text_color="@color/colorTextPrimary"
	            custom:donut_unfinished_color="@color/colorPrimary"
	            custom:donut_finished_color="@color/colorAccent"
	            />
```

## Contribute

## About me

## License

```
Copyright 2016 Javier González

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

