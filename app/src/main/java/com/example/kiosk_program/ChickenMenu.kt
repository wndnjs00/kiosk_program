package com.example.kiosk_program

// 이름과 가격을 나타내는 프로퍼티 만들기
// Food 상속 받음
class ChickenMenu(override var name : String, override var price : Int) : Food(name, price) {


    companion object{

        fun chicken(){

            val huraid = ChickenMenu("후라이드", 18000)
            val yangneum = ChickenMenu("양념치킨", 20000)
            val ganzang = ChickenMenu("간장치킨", 20000)
            val prinkle = ChickenMenu("뿌링클", 21000)
            val horangie = ChickenMenu("호랑이치킨", 20000)

            println("[치킨 메뉴판]")

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

                    println("주문하시겠어요?")
                    println("1.네  2.아니오")
                    var orderNumber = readLine()!!.toInt()

                    if(orderNumber == 1){
                        println("${huraid.name} 주문완료 - ${huraid.price}원입니다")
                        println("메뉴 재주문 - [1]햄버거, [2]피자, [3]치킨, [4]파스타, [5]음료, [0]종료")
                    }else{
                        println("메뉴판으로 이동")
                        main()
                    }
                }

                2-> {
                    println("${yangneum.name}를 선택했습니다")

                    println("주문하시겠어요?")
                    println("1.네  2.아니오")
                    var orderNumber = readLine()!!.toInt()

                    if(orderNumber == 1){
                        println("${yangneum.name} 주문완료 - ${yangneum.price}원입니다")
                        println("메뉴 재주문 - [1]햄버거, [2]피자, [3]치킨, [4]파스타, [5]음료, [0]종료")
                    }else{
                        println("메뉴판으로 이동")
                        main()
                    }
                }

                3-> {
                    println("${ganzang.name}를 선택했습니다")

                    println("주문하시겠어요?")
                    println("1.네  2.아니오")
                    var orderNumber = readLine()!!.toInt()

                    if(orderNumber == 1){
                        println("${ganzang.name} 주문완료 - ${ganzang.price}원입니다")
                        println("메뉴 재주문 - [1]햄버거, [2]피자, [3]치킨, [4]파스타, [5]음료, [0]종료")
                    }else{
                        println("메뉴판으로 이동")
                        main()
                    }
                }

                4-> {
                    println("${prinkle.name}를 선택했습니다")

                    println("주문하시겠어요?")
                    println("1.네  2.아니오")
                    var orderNumber = readLine()!!.toInt()

                    if(orderNumber == 1){
                        println("${prinkle.name} 주문완료 - ${prinkle.price}원입니다")
                        println("메뉴 재주문 - [1]햄버거, [2]피자, [3]치킨, [4]파스타, [5]음료, [0]종료")
                    }else{
                        println("메뉴판으로 이동")
                        main()
                    }
                }

                5 -> {
                    println("${horangie.name}를 선택했습니다")

                    println("주문하시겠어요?")
                    println("1.네  2.아니오")
                    var orderNumber = readLine()!!.toInt()

                    if(orderNumber == 1){
                        println("${horangie.name} 주문완료 - ${horangie.price}원입니다")
                        println("메뉴 재주문 - [1]햄버거, [2]피자, [3]치킨, [4]파스타, [5]음료, [0]종료")
                    }else{
                        println("메뉴판으로 이동")
                        main()
                    }
                }

                -1 -> main()


            }

        }

    }



}
