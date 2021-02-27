package delegate

class StudentExam : Exam {


    override fun joinExam() {
        println("学生参加考试")
    }

    override fun finish() {
        println("学生考试完成")
    }
}