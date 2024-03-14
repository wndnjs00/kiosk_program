package com.example.kiosk_program

// 이름과 가격을 나타내는 프로퍼티 만들기
// Food 상속받음
class DrinkMenu (override var name : String, override var price : Int) : Food(name, price){


    companion object{

        fun drink(){

            println("[음료 메뉴판]")

            val americano = DrinkMenu("아메리카노", 4000)
            val cafelatte = DrinkMenu("카페라떼", 4500)
            val strawberrylatte = DrinkMenu("딸기라떼", 5000)
            val chocosmoothie = DrinkMenu("초코 스무디", 5000)
            val yogurtsmoothie = DrinkMenu("요거트 스무디", 5000)

            println("1. ${americano.name}  ,  ${americano.price}원")
            println("2. ${cafelatte.name}  ,  ${cafelatte.price}원")
            println("3. ${strawberrylatte.name}  ,  ${strawberrylatte.price}원")
            println("4. ${chocosmoothie.name}  ,  ${chocosmoothie.price}원")
            println("5. ${yogurtsmoothie.name}  ,  ${yogurtsmoothie.price}원")
            println("-1. 뒤로가기")
            println("---음료 메뉴를 선택해주세요---")


            //상세 메뉴에 해당하는 숫자 입력받기
            val drinkMenuNumber = readLine()!!.toInt()

            when(drinkMenuNumber){
                1 -> {
                    println("${americano.name}를 선택했습니다")
                }

                2-> {
                    println("${cafelatte.name}를 선택했습니다")
                }

                3-> {
                    println("${strawberrylatte.name}를 선택했습니다")
                }

                4-> {
                    println("${chocosmoothie.name}를 선택했습니다")
                }

                5 -> {
                    println("${yogurtsmoothie.name}를 선택했습니다")
                }

                -1 -> main()


            }
        }

    }



}


