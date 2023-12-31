package me.dio.credit.application.system.dto

import me.dio.credit.application.system.model.entity.Customer
import java.math.BigDecimal

data class CustomerView (
    val firstName: String,
    val lastName: String,
    val email: String,
    val zipCode: String,
    val street: String,
    val income: BigDecimal,
    val customer: Customer? = null
) {
    constructor(customer: Customer) : this(
        firstName = customer.firstName,
        lastName = customer.lastName,
        email = customer.email,
        zipCode = customer.address.zipCode,
        street = customer.address.street,
        income = customer.income
    )
}