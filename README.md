# Rn_demo
android原生项目添加react native组件，实现混合开发。

#### 一

将你的项目项目代码合成AndroidX。

#### 二

依次执行以下命令：

```
npm init

npm install --save react react-native

curl -o .flowconfig https://raw.githubusercontent.com/facebook/react-native/master/.flowconfig
```

将  

```
"start":"node_modules/react-native/packager/packager.sh"
```

拷贝到package.json的scripts下面。

#### 三

工程目录下面创建index.android.js文件

```
//注意：这个hello要和前面RN入口里面(startReactApplication方法里面的参数)的相对应
AppRegistry.registerComponent('hello', () => AwesomeProject);
```

#### 四

```
allprojects {
    repositories {
        google()
        jcenter()

        maven {
            // All of React Native (JS, Android binaries) is installed from npm
            url "$rootDir/node_modules/react-native/android"
        }

        maven {
            // Android JSC is installed from npm
            url("$rootDir/node_modules/jsc-android/dist")
        }
    }
}
```

```
apply plugin: 'com.android.application'

android {
    compileSdkVersion 29
    defaultConfig {
  ...
        ndk {
            abiFilters "armeabi-v7a", "x86"
        }
    }
 	...
    packagingOptions {
        exclude "lib/arm64-v8a/librealm-jni.so"
    }
}

dependencies {
   ...
    implementation 'com.facebook.react:react-native:+'
    implementation 'org.webkit:android-jsc:+'
    implementation 'androidx.swiperefreshlayout:swiperefreshlayout:1.0.0'
}
```

#### 五

```
public class ReactActivity extends com.facebook.react.ReactActivity
{
    @Nullable
    @Override
    protected String getMainComponentName() {
        return "hello";
    }
 }
```

此处的hello与第三步的“hello”相对应。

#### 六

```
public class MyApplication extends Application implements ReactApplication {
    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
        @Override
        public boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected List<ReactPackage> getPackages() {
            return Arrays.<ReactPackage>asList(
                    new MainReactPackage()
            );
        }
    };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        SoLoader.init(this, /* native exopackage */ false);
    }
}
```

自定义Application实现ReactApplication接口。

#### 七

运行，如果报错执行，新建assets文件夹，并执行如下命令

```bash
react-native bundle --platform android --dev false --entry-file index.android.js --bundle-output app/src/main/assets/index.android.bundle --assets-dest android/app/src/main/res
```

执行成功之后再次运行，应该能够成功。

如果还没成功，将代码拷贝一下，运行看下效果。