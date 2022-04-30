class Solutionreport {

    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {

        var answer = IntArray(id_list.size) { 0 }
        val realReport = report.distinct() //같은 사람이 한 사람을 계속 신고해도 1번 신고한 것과 동일하므로 중복제거

        val reporter = Array(realReport.size){ "" } //신고자
        val getreporter = Array(realReport.size){ "" }//신고받은 사람

        val warncount = IntArray(id_list.size){ 0 } //신고 수

        for(i in realReport.indices){
            reporter[i] = realReport[i].trim().split(" ")[0] //처음 나오는 사람이 신고자
            getreporter[i] = realReport[i].trim().split(" ")[1] //두 번째로 나오는 사람이 신고받은 사람
        }

        for(i in realReport.indices) warncount[id_list.indexOf(getreporter[i])]++ //신고받은 사람을 신고 횟수에 추가시킨다.

        for(i in getreporter.indices){
            if(warncount[id_list.indexOf(getreporter[i])] >= k){ //최소 신고 수인 k를 넘어갈 경우 진짜 신고가 된다.
                answer[id_list.indexOf(reporter[i])]++
            }
        }

        return answer
    }

}