package j10.stt.samples



data class Ticket(val price: Double, val movie: String)



fun main(args: Array<String>){
    var who = "segoviaTechTrain"

    val ticket = Ticket(9.0, "1917")
    println(ticket)
    val ticketreduce = ticket.copy(5.0)
    println(ticketreduce)

    who.printHello()
}

fun String.printHello() {
    println("Hello $this")
}
