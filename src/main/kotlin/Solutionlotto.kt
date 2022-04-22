class Solutionlotto{

    fun result(num : Int) : Int{
        if(num >= 2) return (7 - num)
        else return 6
    }
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0,0)
        var count = 0
        var zero = 0
        for ( i in lottos){
            if( i == 0 ) zero += 1
            else if(win_nums.contains(i)) count += 1
        }

        answer[0] = result(count + zero)
        answer[1] = result(count)

        return answer
    }

}