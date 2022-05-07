class Solutionhidx {

    fun solution(citations: IntArray): Int {
        var answer = 0

        val n = citations.size
        citations.sortDescending()

        for(i in 0 until n) //i는 인용 논문의 수, citaitons[i]는 인용 횟수
            if(citations[i] < i + 1) return i //인용 논문 수가 인용횟수를 넘어설 때
        //i + 1인 이유는 인용 논문의 수는 1편 이상이므로

        answer = n //모든 논문이 인용횟수가 h번 이상일 때

        return answer
    }

}