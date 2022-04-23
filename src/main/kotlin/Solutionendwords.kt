class Solutionendwords {

    fun solution(s: String): Int {
        var answer: Int = 0
        val convert = mapOf("zero" to 0, //영문자와 숫자를 pair로 저장 mapOf는 불변형 map이다.
                            "one" to 1,
                            "two" to 2,
                            "three" to 3,
                            "four" to 4,
                            "five" to 5,
                            "six" to 6,
                            "seven" to 7,
                            "eight" to 8,
                            "nine" to 9)

        //String 여러 개는 Array를 사용해도 되지만, 비효율적이다. StringBuilder를 사용하면 효율적으로 문자열을 참조할 수 있다.
        val intstr = StringBuilder() //숫자만 들어가는 StringBuilder 이것이 answer가 된다.
        val engstr = StringBuilder() //영문자가 있을 경우 해당 영문자가 저장된다. 이 영문자들을 map을 이용해 숫자로 바꿀 것이다.
        for(i in 0 until s.length){ //입력되는 문자열을 탐색
            if(s[i].isDigit()){ //입력 문자열에 숫자가 있으면 이전에 선언해준 intstr에 저장. 숫자만 저장하는 StringBuilder이므로
                intstr.append(s[i]) //저장
            }
            else{ //입력되는 문자열 중에 숫자가 아닌 영문자가 있을 경우
                engstr.append(s[i]) //영문자를 저장하는 StringBuilder에 저장
                if(convert.containsKey((engstr.toString()))){ //map에서 해당 영문자 key 값이 있다면,
                    intstr.append(convert[engstr.toString()]) //해당 key 값에 맞는 value를 숫자만 저장하는 StringBuilder에 저장
                    engstr.clear() //intstr에 저장해주었으니, 숫자로 바꾸어준 영문자는 engstr에서 제거
                }
            }
        }
        answer = intstr.toString().toInt() //toInt()는 String 타입의 변수를 int형으로 바꾸어주므로,
        // StringBuilder를 String으로 바꾸어주고 toInt()를 사용해야 한다.

        return answer
    }

}