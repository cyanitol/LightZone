/* Copyright (C) 2017-     Masahiro Kitagawa */

package com.lightcrafts.extensions.primitive

import kotlin.math.max
import kotlin.math.min

fun Double.clamp(lo: Double, hi: Double): Double = max(lo, min(hi, this))
