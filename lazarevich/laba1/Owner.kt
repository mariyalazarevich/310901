class Owner {

    fun feed (Dog : AbstractDog){
        Dog.character = "well-fed"
        var am : Int
        println("Введите количество корма в граммах")
        am = readLine()!!.toInt()
        var DogFood = Food(am)
        if (DogFood.getAmount() > 0 && DogFood.getAmount() < 1001) {
            println("${Dog.name} сыт(а)")
        }
    }

    fun GetACat (MainCat : Cat){
        var name: String
        var age: Int
        println("Придумайте кличку:")
        name = readLine()!!
        println("Введите возраст:")
        age = readLine()!!.toInt()
        while (age == 0 || age > 12) {
            println("Введите корректное число")
            age = readLine()!!.toInt()
        }
        MainCat.age = age
        MainCat.name = name
        println ("Вы завели кота(кошку) по кличке ${MainCat.name} возрастом ${MainCat.age} лет")
    }

    fun GetADog () : AbstractDog {
        var name : String
        var age : Int
        println("Придумайте кличку:")
        name = readLine()!!
        println("Введите возраст:")
        age = readLine()!!.toInt()
        println("Выберите породу:")
        println("1.Овчарка")
        println("2.Терьер")
        println("3.Пудель")
        var Dog  = SheepDog(0, " ")
        var a = readLine()!!.toInt()
        while ( a > 3 || a < 1){
            println("Введите корректное число")
            a = readLine()!!.toInt()
        }
        when (a) {
            1 -> {
                var currentdog = SheepDog(age,name)
                println ("Вы завели овчарку по кличке ${currentdog.name} возрастом ${currentdog.age} лет")
                return currentdog
            }
            2 -> {
                var currentdog = Terrier(age,name)
                println ("Вы завели терьера по кличке ${currentdog.name} возрастом ${currentdog.age} лет")
                return currentdog
            }
            3 -> {
                var currentdog = Puddle(age,name)
                println ("Вы завели пуделя по кличке ${currentdog.name} возрастом ${currentdog.age} лет")
                return currentdog
            }
        }
        return Dog
    }

    fun WalkThePet (Dog : AbstractDog){
        println("Вы погуляли с ${Dog.name}")
    }

    fun GiveACommand (Dog : AbstractDog){
        println("Выберите команду:")
        println("1.Лежать")
        println("2.Сидеть")
        println("3.Голос")
        println("4.Дай лапу")
        var choice : Int
        choice = readln().toInt()
        while ( choice > 4 || choice < 1){
            println("Введите корректное число")
            choice = readLine()!!.toInt()
        }
        Dog.AcceptCommand(choice)
    }
}