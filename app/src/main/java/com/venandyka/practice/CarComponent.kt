package com.venandyka.practice

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car?
}