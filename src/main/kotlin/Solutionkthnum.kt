class Solutionkthnum {

    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf(commands.size)

        for(i in 0 until commands.size){
            val firstIdx = commands[i][0] - 1
            val secondIdx = commands[i][1] - 1
            val thirdIdx = commands[i][2] - 1
            val newArray = array.slice(IntRange(firstIdx, secondIdx)).sorted()

            answer[i] = newArray[thirdIdx]
        }

        return answer
    }

}