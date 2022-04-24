import java.util.*

class Solutioncrane {
    //스택 사용
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val basket = Stack<Int>() //뽑은 인형이 담긴 바구니
        moves.forEach { item -> //몇 번 뽑는지에 따라
            for(i in board.indices){ //moves 배열에 따라 forEach문이 돌고 있으므로 이중 For문이 된다

                if(board[i][item-1] != 0){ //인형뽑기 기계를 순회
                    if(basket.isNotEmpty() && basket.peek() == board[i][item - 1]){ //바구니에 담아둔 인형과 순서대로 뽑은 인형이 같은 종류일 때
                        answer += 2 //종류가 같으면 터뜨려서 사라진 인형의 개수를 추가시킨다. 2개씩 사라지므로 +2 해준다.
                        basket.pop() //뽑은 것과 종류가 같은 인형은 바구니에서 뺀다. 터뜨려서 사라지므로
                    } else {
                        basket.push(board[i][item - 1]) //인형이 같지 않을 때는 그냥 바구니에 뽑은 인형을 담는다.
                    }
                    board[i][item - 1] = 0 //이미 순회한 인덱스는 0으로 처리하여 다른 연산이 수행되지 않도록 한다.

                    break //모든 인형뽑기 판의 인덱스 값이 0이 되었을 때 다 끝난 것이므로 멈춘다.
                }
            }
        }


        return answer
    }

}