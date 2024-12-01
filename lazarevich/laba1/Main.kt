fun main() {
    val MainOwner = Owner()
    var MainDog: AbstractDog? = null
    val maincatyears = 0
    val maincatname = " "
    val MainCat = Cat (maincatyears, maincatname)
    var i : Int
    var exit = true
    while (exit) {
        println("Выберите действие:")
        println("1.Завести собаку")
        println("2.Завести кота(кошку)")
        println("3.Дать команду")
        println("4.Выгулять собаку")
        println("5.Накормить собаку")
        println("6.Выгулять кота(кошку)")
        println("0.Выйти")
        i = readLine()!!.toInt()
        while ( i > 6 || i < 0){
            println("Введите корректное число")
            i = readLine()!!.toInt()
        }
        when (i) {
            0 -> exit = true
            1 -> {
                MainDog = MainOwner.GetADog()
            }
            2 -> {
                MainOwner.GetACat(MainCat)
            }
            3 -> {
                if (MainDog == null || MainDog.name.isEmpty() || MainDog.age == 0) {
                    println("Сначала нужно завести собаку!")
                } else if (MainDog.character == "hungry") {
                    MainDog.AskForFood()
                } else {
                    MainOwner.GiveACommand(MainDog)
                    MainDog.character = "hungry"
                }
            }
            4 -> {
                if (MainDog == null || MainDog.name.isEmpty() || MainDog.age == 0) {
                    println("Сначала нужно завести собаку!")
                } else if (MainDog.character == "hungry") {
                    MainDog.AskForFood()
                } else {
                    MainOwner.WalkThePet(MainDog)
                    MainDog.character = "hungry"
                }
            }
            5 -> {
                if (MainDog == null || MainDog.name.isEmpty() || MainDog.age == 0) {
                    println("Сначала нужно завести собаку!")
                } else {
                    MainOwner.feed(MainDog)
                }
            }
            6 -> {
                if (MainCat.name.isEmpty() && MainCat.age == 0) {
                    println("Сначала нужно завести кота!")
                } else {
                    println("Вы не можете погулять с ${MainCat.name}")
                    MainCat.sleep()
                }
            }
            else -> {
                println("Неверный выбор, попробуйте снова.")
            }
        }
    }
}