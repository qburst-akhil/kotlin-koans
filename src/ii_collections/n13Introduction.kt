package ii_collections

import java.util.*

/*
 * This part of workshop was inspired by:
 * https://github.com/goldmansachs/gs-collections-kata
 */

/*
 *  There are many operations that help to transform one collection into another, starting with 'to'
 */
fun example0(list: List<Int>) {
    list.toSet()

    list.toCollection(HashSet<Int>())
}

fun Shop.getSetOfCustomers(): Set<Customer> {
    // Return a set containing all the customers of this shop
//    var city: City = City("Ekm")
//    var products: List<Product> = listOf(Product("Shoes", 20.0),
//            Product("Socks", 5.0),
//            Product("Sandals",15.0),
//            Product("Flip Flop", 17.0))
//    var orders:List<Order> = listOf(Order(products,false))
//    var customers: Set<Customer> = setOf(Customer("Akhil", city, orders ))
//    println(customers.toString())
    return  customers.toSet()
}

