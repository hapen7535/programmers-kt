class Solutionreport2 {

    //다른 분의 좋은 코드 참고

    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray =
        report.map { it.split(" ") } //신고자와 신고 받은 사람을 공백으로 구분해서 자른다
            .groupBy { it[1] } //신고 받은 사람을 기준으로 분류하여 맵 형태로 결과 반환
            .asSequence() //아래 연산이 한 번에 되도록 지연시킨다.
            .map { it.value.distinct() } //신고자 중복 제거
            .filter { it.size >= k } //k번 이상 신고받은 사람만 필터링
            .flatten() //평탄화
            .map { it[0] } //신고자 기준
            .groupingBy { it } //신고자를 기준으로 분류
            .eachCount() //신고자를 카운트
            .run { id_list.map { getOrDefault(it, 0) }.toIntArray() } //카운트한 신고자를 넣어 답안 제출

}