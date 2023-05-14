fun main() {
    val isRegularCustomer = true
    val amount = 10500.0
    var discount = 0.0
    val regularCustomerDiscount = amount * 0.01

    if (amount > 1000 && amount <= 10000) {
        discount = 100.0
    } else if (amount > 10000){
        discount = amount * 0.05
    }

    val result = if (isRegularCustomer === true) (amount - discount) - regularCustomerDiscount  else amount - discount

    println("Стоимость покупки: $amount")
    println("Скидка: $discount")
    println("Скидка постоянного клиента: $regularCustomerDiscount")
    println("Итого: $result")

}