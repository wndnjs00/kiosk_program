package com.example.kiosk_program

// 이름과 가격을 나타내는 프로퍼티 만들기
// Food 상속받음
class PizzaMenu(override var name : String, override var price : Int) : Food(name, price) {


    companion object{

        fun pizza(){

            println("[피자 메뉴판]")

            val bulgogiPizza = PizzaMenu("불고기 피자", 28000)
            val combinationPizza = PizzaMenu("콤비네이션 피자", 23000)
            val gogumaPizza = PizzaMenu("고구마 피자", 25000)
            val hawaianPizza = PizzaMenu("하와이안 피자", 25000)
            val cheesePizza = PizzaMenu("치즈 피자", 19000)

            println("1. ${bulgogiPizza.name}  ,  ${bulgogiPizza.price}원")
            println("2. ${combinationPizza.name}  ,  ${combinationPizza.price}원")
            println("3. ${gogumaPizza.name}  ,  ${gogumaPizza.price}원")
            println("4. ${hawaianPizza.name}  ,  ${hawaianPizza.price}원")
            println("5. ${cheesePizza.name}  ,  ${cheesePizza.price}원")
            println("-1. 뒤로가기")
            println("---피자 메뉴를 선택해주세요---")



            //상세 메뉴에 해당하는 숫자 입력받기
            val pizzarMenuNumber = readLine()!!.toInt()

            when(pizzarMenuNumber){
                1 -> {
                    println("${bulgogiPizza.name}를 선택했습니다")
                }

                2-> {
                    println("${combinationPizza.name}를 선택했습니다")
                }

                3-> {
                    println("${gogumaPizza.name}를 선택했습니다")
                }

                4-> {
                    println("${hawaianPizza.name}를 선택했습니다")
                }

                5 -> {
                    println("${cheesePizza.name}를 선택했습니다")
                }

                -1 -> main()


            }

        }

    }




}