package com.example.kiosk_program


// 이름과 가격을 나타내는 프로퍼티 만들기
// Food 상속받음
class HamBurgerMenu (override var name : String, override var price : Int) : Food(name, price) {



    companion object{

        fun hamburger() {

            val bulgogi = HamBurgerMenu("불고기버거", 4000)
            val subi = HamBurgerMenu("슈비버거", 6600)
            val triplecheese = HamBurgerMenu("트리플 치즈버거", 6600)
            val bigmag = HamBurgerMenu("빅맥", 6300)
            val sanghai = HamBurgerMenu("맥스파이시 상하이 버거", 6300)


            println("[햄버거 메뉴판]")

            println("1. ${bulgogi.name}  ,  ${bulgogi.price}원")
            println("2. ${subi.name}  ,  ${subi.price}원")
            println("3. ${triplecheese.name}  ,  ${triplecheese.price}원")
            println("4. ${bigmag.name}  ,  ${bigmag.price}원")
            println("5. ${sanghai.name}  ,  ${sanghai.price}원")
            println("-1. 뒤로가기")
            println("---햄버거 메뉴를 선택해주세요---")



            //상세 메뉴에 해당하는 숫자 입력받기
            val pizzarMenuNumber = readLine()!!.toInt()

            when (pizzarMenuNumber) {
                1 -> {
                    println("${bulgogi.name}를 선택했습니다")

                    println("주문하시겠어요?")
                    println("1.네  2.아니오")
                    var orderNumber = readLine()!!.toInt()

                    if(orderNumber == 1){
                        println("${bulgogi.name} 주문완료 - ${bulgogi.price}원입니다")
                        println("메뉴 재주문 - [1]햄버거, [2]피자, [3]치킨, [4]파스타, [5]음료, [0]종료")
                    }else{
                        println("메뉴판으로 이동")
                        main()
                    }

                }

                2 -> {
                    println("${subi.name}를 선택했습니다")

                    println("주문하시겠어요?")
                    println("1.네  2.아니오")
                    var orderNumber = readLine()!!.toInt()

                    if(orderNumber == 1){
                        println("${subi.name} 주문완료 - ${subi.price}원입니다")
                        println("메뉴 재주문 - [1]햄버거, [2]피자, [3]치킨, [4]파스타, [5]음료, [0]종료")
                    }else{
                        println("메뉴판으로 이동")
                        main()
                    }
                }

                3 -> {
                    println("${triplecheese.name}를 선택했습니다")

                    println("주문하시겠어요?")
                    println("1.네  2.아니오")
                    var orderNumber = readLine()!!.toInt()

                    if(orderNumber == 1){
                        println("${triplecheese.name} 주문완료 - ${triplecheese.price}원입니다")
                        println("메뉴 재주문 - [1]햄버거, [2]피자, [3]치킨, [4]파스타, [5]음료, [0]종료")
                    }else{
                        println("메뉴판으로 이동")
                        main()
                    }
                }

                4 -> {
                    println("${bigmag.name}를 선택했습니다")

                    println("주문하시겠어요?")
                    println("1.네  2.아니오")
                    var orderNumber = readLine()!!.toInt()

                    if(orderNumber == 1){
                        println("${bigmag.name} 주문완료 - ${bigmag.price}원입니다")
                        println("메뉴 재주문 - [1]햄버거, [2]피자, [3]치킨, [4]파스타, [5]음료, [0]종료")
                    }else{
                        println("메뉴판으로 이동")
                        main()
                    }
                }

                5 -> {
                    println("${sanghai.name}를 선택했습니다")

                    println("주문하시겠어요?")
                    println("1.네  2.아니오")
                    var orderNumber = readLine()!!.toInt()

                    if(orderNumber == 1){
                        println("${sanghai.name} 주문완료 - ${sanghai.price}원입니다")
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

