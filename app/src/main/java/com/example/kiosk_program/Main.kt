package com.example.kiosk_program



fun main(){


    println("메뉴판에서 메뉴를 골라 해당하는 숫자를 입력해주세요")
    println("[1]햄버거, [2]피자, [3]치킨, [4]파스타, [5]음료, [0]종료")



    // 무한반복
    while(true){


        try{

            //메뉴에 해당하는 숫자 입력받기
            val menuNumber = readLine()!!.toInt()

            when (menuNumber){
                1 -> HamBurgerMenu.hamburger()
                2 -> PizzaMenu.pizza()
                3 -> ChickenMenu.chicken()
                4 -> PastaMenu.pasta()
                5 -> DrinkMenu.drink()
                0 -> {
                    println("메뉴판 프로그램 종료")
                    break
                }
                -1 -> main()
                else -> println("잘못된 숫자에요 다른숫자를 입력해주세요")
            }

        }catch (e:java.lang.NumberFormatException){
            println("잘못된 값을 입력했어요. 다시 입력해주세요 ")
        }

    }


}
