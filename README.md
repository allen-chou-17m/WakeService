[![Release](https://jitpack.io/v/evilthreads669966/wakeservice.svg)](https://jitpack.io/#evilthreads669966/wakeservice)&nbsp;&nbsp;[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=14)
# Wake Service
### An Android library that gives you an Intent Service that keeps your processor awake while doing work.
## User Instructions
1. Add the JitPack repository to your project's build.gradle
```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
2. Add the dependency to your app's build.gradle
```gradle
dependencies {
        implementation 'com.github.evilthreads669966:wakeservice:1.0'
}
```
3. Subclass WakeService and override Intent.doWork()
```kotlin
import com.candroid.bootlaces.BootService
//BootService is lifecycle aware so you can register an observer
class MyWakeService : WakeService("MyWakeService"){
    override fun Intent.doWork() {
        //do work
    }
}
```
4. Add the service to your app's manifest file
```xml
    <application>
        <service android:name=".MyWakeService" exported="false"/>
    </application>
```
## License
```
Copyright 2020 Chris Basinger

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
