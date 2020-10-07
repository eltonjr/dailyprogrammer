
fun rotate(s: String) = s.drop(1) + s.get(0)
fun rotate_n_times(s: String, n: Int) :String = if (n == 0) s else rotate_n_times(rotate(s), n-1)

fun same_necklace(a: String, b: String): Boolean {
    fun same_necklace_rec(it: Int, _b: String): Boolean = when {
        it > a.length -> false
        a == _b -> true
        else -> same_necklace_rec(it+1, rotate(_b))
    }
    if (a.length != b.length) return false
    return same_necklace_rec(0, b)
}

fun repeats(a: String) :Int {
    fun repeats_rec(s: String, original: String, counter: Int, it: Int): Int = when {
        it > original.length -> counter
        else -> repeats_rec(rotate(s), original, if (s == original) counter+1 else counter, it+1)
    }
    return repeats_rec(rotate(a), a, 0, 1)
}
