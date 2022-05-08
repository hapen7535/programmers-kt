class Solutionfindprime {

    lateinit var answerSet : MutableList<Int>

    fun solution(numbers: String): Int {
        var answer = 0
        answerSet = mutableListOf()

        temp(numbers,"")
        answerSet.distinct().forEach{
            if(isPrime(it)){ //소수인지 확인
                answer++
            }
        }
        return answer

    }

    fun temp(numbers : String, result : String){
        if(!result.isEmpty()){
            answerSet.add(result.toInt())
        }
        numbers.forEachIndexed{ index, c ->
            temp((numbers.removeRange(index..index)), result+c)
            print(numbers.removeRange(index..index))
        }
    }

    fun isPrime(n: Int): Boolean = n > 1 && (2 until n).none { n % it == 0 }

}