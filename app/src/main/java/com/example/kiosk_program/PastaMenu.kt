package com.example.kiosk_program

// 이름과 가격을 나타내는 프로퍼티 만들기
// Food 상속받음
class PastaMenu(override var name : String, override var price : Int) : Food(name, price){


    companion object{

        fun pasta(){

            println("[파스타 메뉴판]")

            val tomatoPasta = PastaMenu("토마토 파스타", 13000)
            val creamPasta = PastaMenu("크림 파스타", 13000)
            val rosePasta = PastaMenu("로제 파스타", 14000)
            val alioPasta = PastaMenu("알리오올리오", 12000)
            val saladPasta = PastaMenu("샐러드 파스타", 11000)

            println("1. ${tomatoPasta.name}  ,  ${tomatoPasta.price}원")
            println("2. ${creamPasta.name}  ,  ${creamPasta.price}원")
            println("3. ${rosePasta.name}  ,  ${rosePasta.price}원")
            println("4. ${alioPasta.name}  ,  ${alioPasta.price}원")
            println("5. ${saladPasta.name}  ,  ${saladPasta.price}원")
            println("-1. 뒤로가기")
            println("---파스타 메뉴를 선택해주세요---")


            //상세 메뉴에 해당하는 숫자 입력받기
            val pastaMenuNumber = readLine()!!.toInt()

            when(pastaMenuNumber){
                1 -> {
                    println("${tomatoPasta.name}를 선택했습니다")
                }

                2-> {
                    println("${creamPasta.name}를 선택했습니다")
                }

                3-> {
                    println("${rosePasta.name}를 선택했습니다")
                }

                4-> {
                    println("${alioPasta.name}를 선택했습니다")
                }

                5 -> {
                    println("${saladPasta.name}를 선택했습니다")
                }

                -1 -> main()


            }

        }

    }




}
