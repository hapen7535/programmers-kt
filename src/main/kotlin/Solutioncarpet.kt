class Solutioncarpet {

    val brown : Int = 24
    val yellow : Int = 24

    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()

        val mul : Int = brown + yellow //가로*세로
        val sum : Int = brown / 2 + 2 //가로+세로

        var height = 3 //최소 3

        while(mul % height != 0) height++

        var width : Int = mul/height

        while(width + height != sum){ //가로+세로가 최소 설정 값을 넘길 때
            height++
            while(mul % height != 0) height++

            width = mul / height
        }

        answer += width
        answer += height

        return answer
    }

}