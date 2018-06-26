package ii_collections

fun example2(list: List<Int>) {

    val isZero: (Int) -> Boolean = { it == 0 }

    val hasZero: Boolean = list.any(isZero)

    val allZeros: Boolean = list.all(isZero)

    val numberOfZeros: Int = list.count(isZero)

    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
}

fun Customer.isFrom(city: City): Boolean {
    // Return true if the customer is from the given city
    return this.city == city
}

fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
    // Return true if all customers are from the given city
    val resp = this.customers.map { it.city == city }
    return !resp.contains(false)
}

fun Shop.hasCustomerFrom(city: City): Boolean {
    // Return true if there is at least one customer from the given city
    val resp = this.customers.map { it.city == city }
    return resp.contains(true)
}

fun Shop.countCustomersFrom(city: City): Int {
    // Return the number of customers from the given city
    var count: Int = 0
    this.customers.map {it-> when {
        (it.city == city)-> count++
        else
                -> {}
    }   }
    return count
}

fun Shop.findFirstCustomerFrom(city: City): Customer? {
    // Return the first customer who lives in the given city, or null if there is none
    var customer: Customer? = null
    this.customers.map { it-> when {
        it.city == city -> {
            if(customer == null)
                customer = it
        }
    } }
    return customer
}
