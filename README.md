Donut Progress
=======
 [ ![Download](https://api.bintray.com/packages/javiergm/maven/DonutProgress/images/download.svg) ](https://bintray.com/javiergm/maven/DonutProgress/_latestVersion)

- Using Gradle

```groovy
    compile 'com.bikomobile:donutprogress:1.0.1'
```

- Using Maven

```xml
    <dependency>
        <groupId>com.bikomobile</groupId>
        <artifactId>donutprogress</artifactId>
        <version>1.0.0</version>
        <type>pom</type>
    </dependency>
```


How to use this library
=======

- java

```java
	int percent = 40;
	        
	DonutProgress donutProgress = (DonutProgress) 
			findViewById(R.id.donut_progress);
			
	donutProgress.setText(percent + "%");
	donutProgress.setProgress(percent);
```

- xml

```xml
	<com.bikomobile.donutprogress.DonutProgress
	            android:id="@+id/donut_progress"
	            android:layout_width="54dp"
	            android:layout_height="54dp"
	            custom:donut_finished_stroke_width="5dp"
	            custom:donut_unfinished_stroke_width="5dp"
	            custom:donut_text_size="14sp"
	            custom:donut_start_angle="-90"
	            custom:donut_text_color="@color/colorTextPrimary"
	            custom:donut_unfinished_color="@color/colorPrimary"
	            custom:donut_finished_color="@color/colorAccent"
	            />
```


- DonutProgress with animation

```java
    final DonutProgress donutProgressAnim = (DonutProgress)
                findViewById(R.id.donut_progress_anim);
        
    final int percent = 78;
    final Timer timer = new Timer();

    donutProgressAnim.setText(percent + "%");

    timer.schedule(new TimerTask() {
        private Handler handler = new Handler(Looper.getMainLooper());

        @Override
        public void run() {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    if (donutProgressAnim.getProgress() < percent) {
                        donutProgressAnim.setProgress
                                (donutProgressAnim.getProgress() + 1);
                    } else {
                        timer.cancel();
                    }
                }
            });
        }
    }, 0, 20);
```

Contribute
=======

About me
=======

License
=======
