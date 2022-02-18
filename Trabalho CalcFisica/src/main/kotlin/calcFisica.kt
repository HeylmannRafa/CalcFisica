class calcFisica {

    fun forcapeso(m: Float, g: Float): Float {
        return m * g

    }

    fun fcentripta(m: Float, v: Float, r: Float): Float {
        return v * v / r * m
    }

    fun impulso(f: Float, at: Float): Float {
        return f * at
    }

    fun forcaelastica(k: Float, x: Float): Float {
        return k * x
    }

    fun velocidademedia(a: Float, at: Float): Float {
        return a / at
    }

    fun mru(a: Float, at: Float): Float {
        return a / at

    }

    fun mruv(vo: Float, a: Float, t: Float): Float {
        return vo + a * t
    }
}