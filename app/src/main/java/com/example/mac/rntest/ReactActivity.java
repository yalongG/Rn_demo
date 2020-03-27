package com.example.mac.rntest;

import android.os.Bundle;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.shell.MainReactPackage;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ReactActivity extends com.facebook.react.ReactActivity
//        implements DefaultHardwareBackBtnHandler
{
    @Nullable
    @Override
    protected String getMainComponentName() {
        return "hello";
    }
    //    private ReactRootView mReactRootView;
//    private ReactInstanceManager mReactInstanceManager;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        mReactRootView = new ReactRootView(this);
//        mReactInstanceManager = ReactInstanceManager.builder()
//                .setApplication(getApplication())
//                .setBundleAssetName("index.android.bundle")
////              相信很多人都是这个方法，但是我的没有可能是我的版本更新了方法名替换了，有哪一个方法就用哪一个
////                .setJSMainModuleName("index.android")
//                .setJSMainModulePath("index.android")
//                .addPackage(new MainReactPackage())
////                .setUseDeveloperSupport(BuildConfig.DEBUG)
//                .setUseDeveloperSupport(true)
//                .setInitialLifecycleState(LifecycleState.RESUMED)
//                .setCurrentActivity(this)
//                .build();
//        mReactRootView.startReactApplication(mReactInstanceManager, "hello", null);
//
//        setContentView(mReactRootView);
//    }
//
//    @Override
//    public void invokeDefaultOnBackPressed() {
//        super.onBackPressed();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//
//        if (mReactInstanceManager != null) {
//            mReactInstanceManager.onHostPause(this);
//        }
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        if (mReactInstanceManager != null) {
//            mReactInstanceManager.onHostResume(this, this);
//        }
//    }
//
//    @Override
//    public void onBackPressed() {
//        if (mReactInstanceManager != null) {
//            mReactInstanceManager.onBackPressed();
//        } else {
//            super.onBackPressed();
//        }
//    }


}