package com.example.lifecyclelearn

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        /**
         * 第二步
         *
         * 将MyDefaultLifecycleObserver绑定至Application
         * 那么Application的生命周期将会被MyDefaultLifecycleObserver这个类监听到
         * 我们就可以在MyDefaultLifecycleObserver中响应的生命周期方法中做事情了
         * 实现了代码逻辑与生命周期的分离
         */
        ProcessLifecycleOwner.get().lifecycle.addObserver(MyDefaultLifecycleObserver())
    }
}