package ru.netology

fun main() {
    val fee = 0.0075
    val minFee = 35
    val amount = 4000 // сумма перевода

    var result = if (amount * fee > minFee) amount * fee else minFee // расчет размера комиссии
    println(result);
}