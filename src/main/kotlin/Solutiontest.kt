import java.util.*

//완전 탐색 문제

class Solutiontest  {

    fun solution(answers: IntArray): IntArray {

        val list1 = arrayOf(1,2,3,4,5) //1번 수포자
        val list2 = arrayOf(2,1,2,3,2,4,2,5) //2번 수포자
        val list3 = arrayOf(3,3,1,1,2,2,4,4,5,5) //3번 수포자

        var x = 0; var y = 0; var z = 0

        var map = mutableMapOf<Int,Int>(Pair(1,0),Pair(2,0),Pair(3,0)) //Pair를 사용해 두 개의 객체를 저장
        for(i in answers){
            if(i == list1[x]) map.put(1,map[1]!! + 1)
            if(i == list2[y]) map.put(2,map[2]!! + 1)
            if(i == list3[z]) map.put(3,map[3]!! + 1)

            x = if(x < 4) x + 1 else 0 //최대 인덱스 제한
            y = if(y < 7) y + 1 else 0
            z = if(z < 9) z + 1 else 0
         }

        var max = map.maxByOrNull({it.value})?.value //수포자들 중 많이 맞힌 사람 점수 max에 저장
        for(i in 1..map.size) if(map[i] != max) map.remove(i) //많이 맞힌 사람만 남겨놓음
        var answer = map.toList().sortedWith(compareBy({it.second})).toMap().keys.toIntArray() //오름차순으로 정렬 후 정답 제출

        return answer
    }

}
