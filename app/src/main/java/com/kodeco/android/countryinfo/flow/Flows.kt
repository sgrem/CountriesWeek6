package com.kodeco.android.countryinfo.flow

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

// TODO: Implement the flows here, there should be three public flows:
//  1. tapFlow
//  2. backFlow
//  3. counterFlow
//  NOTE: These public flows should be StateFlow<Int> types, you'll need to make separate
//  private MutableStateFlow<Int> types that can actually have their values modified.
object Flows {
    // Private MutableStateFlows
    private val _tapFlow = MutableStateFlow(0)
    private val _backFlow = MutableStateFlow(0)
    private val _counterFlow = MutableStateFlow(0)

    // Public StateFlows
    val tapFlow: StateFlow<Int> = _tapFlow.asStateFlow()
    val backFlow: StateFlow<Int> = _backFlow.asStateFlow()
    val counterFlow: StateFlow<Int> = _counterFlow.asStateFlow()

    init {
        // Auto-increment counterFlow every second
        GlobalScope.launch {
            while (true) {
                _counterFlow.value++
                delay(1000L)
            }
        }
    }

    // Public methods to update flows
    fun tap() {
        _tapFlow.value++
    }

    fun tapBack() {
        _backFlow.value++
    }
}
