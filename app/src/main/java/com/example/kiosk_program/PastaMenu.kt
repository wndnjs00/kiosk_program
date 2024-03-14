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

                    println("주문하시겠어요?")
                    println("1.네  2.아니오")
                    var orderNumber = readLine()!!.toInt()

                    if(orderNumber == 1){
                        println("${tomatoPasta.name} 주문완료 - ${tomatoPasta.price}원입니다")
                        println("메뉴 재주문 - [1]햄버거, [2]피자, [3]치킨, [4]파스타, [5]음료, [0]종료")
                    }else{
                        println("메뉴판으로 이동")
                        main()
                    }
                }

                2-> {
                    println("${creamPasta.name}를 선택했습니다")

                    println("주문하시겠어요?")
                    println("1.네  2.아니오")
                    var orderNumber = readLine()!!.toInt()

                    if(orderNumber == 1){
                        println("${creamPasta.name} 주문완료 - ${creamPasta.price}원입니다")
                        println("메뉴 재주문 - [1]햄버거, [2]피자, [3]치킨, [4]파스타, [5]음료, [0]종료")
                    }else{
                        println("메뉴판으로 이동")
                        main()
                    }
                }

                3-> {
                    println("${rosePasta.name}를 선택했습니다")

                    println("주문하시겠어요?")
                    println("1.네  2.아니오")
                    var orderNumber = readLine()!!.toInt()

                    if(orderNumber == 1){
                        println("${rosePasta.name}주문완료 - ${rosePasta.price}원입니다")
                        println("메뉴 재주문 - [1]햄버거, [2]피자, [3]치킨, [4]파스타, [5]음료, [0]종료")
                    }else{
                        println("메뉴판으로 이동")
                        main()
                    }
                }

                4-> {
                    println("${alioPasta.name}를 선택했습니다")

                    println("주문하시겠어요?")
                    println("1.네  2.아니오")
                    var orderNumber = readLine()!!.toInt()

                    if(orderNumber == 1){
                        println("${alioPasta.name} 주문완료 - ${alioPasta.price}원입니다")
                        println("메뉴 재주문 - [1]햄버거, [2]피자, [3]치킨, [4]파스타, [5]음료, [0]종료")
                    }else{
                        println("메뉴판으로 이동")
                        main()
                    }
                }

                5 -> {
                    println("${saladPasta.name}를 선택했습니다")

                    println("주문하시겠어요?")
                    println("1.네  2.아니오")
                    var orderNumber = readLine()!!.toInt()

                    if(orderNumber == 1){
                        println("${saladPasta.name} 주문완료 - ${saladPasta.price}원입니다")
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