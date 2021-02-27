package delegate

fun main() {

    // 模拟一场中文考试
    val studentExam: Exam = StudentExam()
    // 学生去考试
    studentExam.joinExam()
    studentExam.finish()
    // 坏学生让上面的学生做枪手
    val examGunner: Exam = BadStudentExam(studentExam)
    examGunner.joinExam()
    examGunner.finish()

}