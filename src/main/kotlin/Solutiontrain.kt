import java.util.ArrayList;
import java.util.Arrays;

class Solutiontrain {
 fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n - lost.size
        var reserveList = ArrayList<Int>()
        // 예외 처리 필요
        // 테스트 케이스 3,7,12,13,14 실패
        // 1. lost와 reserve가 정렬이 되어 있어야 함(lost와 reserve는 정렬이 된 상태로 들어오는 것이 아님)
        // 2. 여분의 체육복을 가져온 학생이 체육복을 도난당하는 경우를 생각해야 함
        for(i in 0 until reserve.size){
            reserveList.add(reserve[i])
        }

        for(i in 0 until lost.size){

            if(reserveList.contains(lost[i]-1)){
                answer = answer + 1
                reserveList.remove(lost[i]-1)
                continue
            }
            if(reserveList.contains(lost[i]+1)){
                answer= answer + 1
                reserveList.remove(lost[i]+1)
                continue
            }

        }

        return answer
    }
}
