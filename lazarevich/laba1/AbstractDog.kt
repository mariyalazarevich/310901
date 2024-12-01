abstract class AbstractDog (Age : Int, Name : String, Breed : String) : AbstractPet (Age, Name) {
    var breed : String = Breed
    var character : String = "well-fed"
    fun AskForFood () {
        println("${name} голоден(на). Его(ее) нужно накормить!")
    }
    fun AcceptCommand ( choice : Int) {
        when (choice) {
            1 ->{
                println("${name} принял(а) команду")
                ExecuteCommandLie()
            }
            2 -> {
                println("${name} принял(а) команду")
                ExecuteCommandSit()
            }
            3 -> {
                println("${name} принял(а) команду")
                ExecuteCommandVoice()
            }
            4 -> {
                println("${name} принял(а) команду")
                ExecuteCommandPaw()
            }
        }
    }
    private fun ExecuteCommandLie () {
        println("${name} исполнил(а) команду лежать")
    }
    private fun ExecuteCommandSit () {
        println("${name} исполнил(а) команду сидеть")
    }
    private fun ExecuteCommandVoice () {
        println("Гав-гав")
    }
    private fun ExecuteCommandPaw(){
        println("${name} дал(а) лапу")
    }
}