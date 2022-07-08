package com.example.lifecyclelearn

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

/**
 * 第一步：
 * 创建MyDefaultLifecycleObserver，继承自DefaultLifecycleObserver
 * 实现声明周期方法
 */
@SuppressLint("LongLogTag")
class MyDefaultLifecycleObserver : DefaultLifecycleObserver {

    companion object {
        private const val TAG = "MyDefaultLifecycleObserver"
    }

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.d(TAG, "onCreate: ")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.d(TAG, "onStart:")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d(TAG, "onResume:")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.d(TAG, "onPause:")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.d(TAG, "onStop:")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.d(TAG, "onDestory:")
    }
}