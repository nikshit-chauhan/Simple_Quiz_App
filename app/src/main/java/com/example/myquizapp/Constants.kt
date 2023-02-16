package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTION : String = "total_questions"
    const val CORRECT_ANSWER : String = "correct_answer"

    fun getQuestions() : ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina","Australia",
            "Armenia","Austria",
            2
        )
        questionList.add(que1)
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia",
            "Armenia","Austria",
            1
        )
        questionList.add(que2)
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina","India",
            "Belgium","Pakistan",
            3
        )
        questionList.add(que3)
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "England","Belgium",
            "South Africa","Brazil",
            4
        )
        questionList.add(que4)
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "England","Denmark",
            "Brazil","Belgium",
            2
        )
        questionList.add(que5)
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India","Bangladesh",
            "Belgium","Kuwait",
            1
        )
        questionList.add(que6)
        return questionList
    }
}