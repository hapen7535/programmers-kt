import java.util.*

//완전 탐색 문제

class Solutiontest  {

    fun solution(answers: IntArray): IntArray {
        var answer = ArrayList<Int>() //arraylist를 사용하면 배열의 크기를 조절할 수 있다. arrayof 그냥 배열은 불가

        val list1 = arrayOf(1,2,3,4,5) //1번 수포자
        val list2 = arrayOf(2,1,2,3,2,4,2,5) //2번 수포자
        val list3 = arrayOf(3,3,1,1,2,2,4,4,5,5) //3번 수포자

        var correct_cnt = arrayOf(0,0,0) //맞힌 개수 리스트

        for(i in 0 answers.indices){
            if(answers[i] == list1[i%5]) correct_cnt[0] = correct_cnt[0] + 1 //1번 수포자가 맞혔을 때
            if(answers[i] == list1[i%8]) correct_cnt[1] = correct_cnt[1] + 1 //2번 수포자가 맞혔을 때
            if(answers[i] == list1[i%10]) correct_cnt[2] = correct_cnt[2] + 1 //3번 수포자가 맞혔을 때
        }
        
        val max = correct_cnt.max() //1,2,3번 수포자 중에서 가장 많이 맞힌 사람
        
        for(i in correct_cnt.indices){ 
            if(correct_cnt[i]>=max) answer.add(i+1) //가장 많이 맞힌 사람 답에 추가, 여러 명이면 오름차순으로 추가
        }


        return answer.toIntArray() 
    }

}
