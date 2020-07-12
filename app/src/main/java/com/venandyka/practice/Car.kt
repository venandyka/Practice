package com.venandyka.practice

import android.util.Log
import javax.inject.Inject

class Car {
    private val TAG = "Car"
    private var engine: Engine? = null
    private var wheels: Wheels? = null
    @Inject
    fun Car(engine: Engine?, wheels: Wheels?) {
        this.engine = engine
        this.wheels = wheels
    }

    fun drive() {
        Log.d(TAG, "driving...")
    }
}