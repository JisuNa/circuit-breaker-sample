package com.example.resilence4j.config

import java.util.function.Predicate

class RecordFailurePredicate : Predicate<Throwable> {
    override fun test(t: Throwable): Boolean {
        return t !is BusinessException
    }
}