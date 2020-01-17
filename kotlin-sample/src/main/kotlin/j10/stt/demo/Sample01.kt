package j10.stt.demo

import java.lang.IllegalArgumentException
import java.math.BigDecimal

data class Money(val amount: BigDecimal, val currency: String )


fun sendPayment(money: Money, message: String = ""){
    println("send payment: ${money.amount}${money.currency}")
}

fun convertToDollars(money: Money) =
    when ( money.currency){
        "$" ->  money
        "EUR" -> Money(money.amount * BigDecimal(1.10), "$")
        else -> throw IllegalArgumentException("not valid currency")
    }


fun BigDecimal.percent(percentage: Int) = this.multiply(percentage.bd).divide(BigDecimal(100))

infix fun Int.percentOf(money: Money) = money.amount.multiply(this.bd).divide(BigDecimal(100))

operator fun Money.plus(money: Money) =
        if (currency == money.currency){
            Money(amount + money.amount, currency)
        }else{
            throw IllegalArgumentException("some problem here")
        }

fun javaMoney(money: MoneyJava?){
    println("${money!!.amount} is Valid")
}

fun main(){
    println("hello world")

    javaMoney(null)

    val ticket = Money(BigDecimal(9), "€")
    val palomitas = ticket.copy(10.bd)

    val t = ticket + palomitas
    println(t)

    var bus : Money? =  Money(5.bd, "EUR")

    bus = null



    val bd1 = 100.bd

    val p = bd1.percent(7)
    println("$p")

    val p2 = 7 percentOf palomitas

    println("$p2")

    sendPayment(message = "hello", money = ticket)

    if ( ticket !== palomitas){
        println("Not Equals")
    }else{
        println("Are Equals")
    }
}

private val Int.bd: BigDecimal
            get(){
                return BigDecimal(this)
            }
