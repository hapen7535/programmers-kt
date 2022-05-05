class Solutiontrain2 {

    fun solution(n: Int, lost: IntArray, reserve: IntArray):Int{

        var answer = n
        var lostSet = lost.toSet() - reserve.toSet() //여분 갖고 있는 사람이 도둑맞는 경우 생각해서 중복 제거 reserve도 마찬가지
        var reserveSet = (reserve.toSet() - lost.toSet()) as MutableSet //여분을 갖고 있는 사람이 도둑맞은 사람에게 주므로 Set의 크기의 변동이 있어야 함

        for(i in lostSet){
            when{
                i + 1 in reserveSet -> reserveSet.remove(i + 1)
                i - 1 in reserveSet -> reserveSet.remove(i - 1)
                else -> answer-- //여분 못주는 경우
            }
        }


        return answer

    }

}