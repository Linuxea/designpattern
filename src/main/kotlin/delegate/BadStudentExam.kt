package delegate

class BadStudentExam(private val exam: Exam) : Exam by exam {

    override fun joinExam() {
        println("坏学生考试")
        exam.joinExam()
    }

}