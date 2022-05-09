class Solutiontargetnum {

    fun solution(numbers: IntArray, target: Int): Int {
        var tree = arrayListOf(0)
        numbers.forEach{value ->
            val childs = arrayListOf<Int>()
            tree.forEach {parent ->
                childs.add(parent + value)
                childs.add(parent - value)
            }
            tree = childs
        }

        return tree.filter{it == target}.count()
    }

}