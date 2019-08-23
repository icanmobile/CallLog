package com.icanmobile.calllogger.util

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

fun Disposable.disposedBy(bag: CompositeDisposable) {
    bag.add(this)
}