fun main(){
    past(10, 6, 56)
    past(0, 0, 0)
    past(5, 11,10)
    past(111, 0, 0)
}

fun past(h: Int, m: Int, s: Int): Int {
    return if((h in 0..23) && (m in 0..59) && (s in 0..59)) {
        ((h*3600)+(m*60)+s)*1000
    }else 0
}