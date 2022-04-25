//음양 더하기

class Solutionpm {

    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0

        for(i in signs.indices){ //숫자만 들어있는 배열과 부호 배열의 크기는 같으므로 아무거나 기준으로 잡아 for문 돌린다.

            if(signs[i] == false){ //부호가 양일 경우는 어차피 생각할 필요 없으므로, 음수일 경우만 생각한다.
                absolutes[i] = - absolutes[i] //음일 경우, 절댓값에 -를 붙여준다.
            }
            answer = answer + absolutes[i] //정답에 음양이 구분된 모든 숫자를 더한다.
        }

        return answer
    }

}