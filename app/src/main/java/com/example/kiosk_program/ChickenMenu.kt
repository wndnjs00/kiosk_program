package com.example.kiosk_program

// 이름과 가격을 나타내는 프로퍼티 만들기
// Food 상속 받음
class ChickenMenu(override var name : String, override var price : Int) : Food(name, price) {


    companion object{

        fun chicken(){

            println("[치킨 메뉴판]")

            val huraid = ChickenMenu("후라이드", 18000)
            val yangneum = ChickenMenu("양념치킨", 20000)
            val ganzang = ChickenMenu("간장치킨", 20000)
            val prinkle = ChickenMenu("뿌링클", 21000)
            val horangie = ChickenMenu("호랑이치킨", 20000)

            println("1. ${huraid.name}  ,  ${huraid.price}원")
            println("2. ${yangneum.name}  ,  ${yangneum.price}원")
            println("3. ${ganzang.name}  ,  ${ganzang.price}원")
            println("4. ${prinkle.name}  ,  ${prinkle.price}원")
            println("5. ${horangie.name}  ,  ${horangie.price}원")
            println("-1. 뒤로가기")
            println("---치킨 메뉴를 선택해주세요---")



            //상세 메뉴에 해당하는 숫자 입력받기
            val chickenMenuNumber = readLine()!!.toInt()

            when(chickenMenuNumber){
                1 -> {
                    println("${huraid.name}를 선택했습니다")
                }

                2-> {
                    println("${yangneum.name}를 선택했습니다")
                }

                3-> {
                    println("${ganzang.name}를 선택했습니다")
                }

                4-> {
                    println("${prinkle.name}를 선택했습니다")
                }

                5 -> {
                    println("${horangie.name}를 선택했습니다")
                }

                -1 -> main()


            }

        }

    }



}

