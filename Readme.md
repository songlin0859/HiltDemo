### HiltDemo

[使用 Hilt 实现依赖项注入](https://developer.android.google.cn/training/dependency-injection/hilt-android?hl=zh_cn&authuser=0)

1. 首先，将 hilt-android-gradle-plugin 插件添加到项目的根级 build.gradle 文件中：
```groovy
buildscript {
    //...
    dependencies {
        //...
        classpath 'com.google.dagger:hilt-android-gradle-plugin:2.28-alpha'
    }
}
```

2. 然后，应用 Gradle 插件并在 app/build.gradle 文件中添加以下依赖项：

```groovy
//...
apply plugin: 'kotlin-kapt'
apply plugin: 'dagger.hilt.android.plugin'

android {
    //...
}

dependencies {
    implementation "com.google.dagger:hilt-android:2.28-alpha"
    kapt "com.google.dagger:hilt-android-compiler:2.28-alpha"
}

```

3. Hilt 使用 Java 8 功能。如需在项目中启用 Java 8，请将以下代码添加到 app/build.gradle 文件中：
 ```groovy
android {
     //...
     compileOptions {
       sourceCompatibility JavaVersion.VERSION_1_8
       targetCompatibility JavaVersion.VERSION_1_8
     }
   }
```

4. 所有使用 Hilt 的应用都必须包含一个带有 @HiltAndroidApp 注释的 Application 类。
```kotlin
@HiltAndroidApp
class App : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
```

5. 将依赖项注入 Android 类

6. 定义 Hilt 绑定

7. Hilt 模块

8. 使用 @Binds 注入接口实例

9. 使用 @Provides 注入实例

10. 为同一类型提供多个绑定

11. 组件作用域 
```
Application 	ApplicationComponent 	@Singleton
View Model 	    ActivityRetainedComponent 	@ActivityRetainedScope
Activity 	    ActivityComponent 	@ActivityScoped
Fragment 	    FragmentComponent 	@FragmentScoped
View 	        ViewComponent 	@ViewScoped
带有 @WithFragmentBindings 注释的 View 	ViewWithFragmentComponent 	@ViewScoped
Service 	ServiceComponent 	@ServiceScoped
```
