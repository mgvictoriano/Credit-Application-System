package me.dio.credit.application.system.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import me.dio.credit.application.system.model.entity.Customer
import java.math.BigDecimal

data class CustomerUpdateDTO(
    @field:NotEmpty
    val firstName: String,
    val lastName: String,
    val zipCode: String,
    @field:NotNull
    val income: BigDecimal,
    val street: String
) {

    fun toEntity(customer: Customer) : Customer {
        customer.firstName = this.firstName
        customer.lastName = this.lastName
        customer.income = this.income
        customer.address.zipCode = this.zipCode
        customer.address.street = this.street
        return customer
    }
}
