package me.dio.credit.application.system.dto

import me.dio.credit.application.system.model.entity.Address
import me.dio.credit.application.system.model.entity.Customer
import java.math.BigDecimal

/**
 * DTO for {@link me.dio.credit.application.system.model.entity.Customer}
 */
data class CustomerDTO(
    val firstName: String,
    val lastName: String,
    val cpf: String,
    val income: BigDecimal,
    val email: String,
    val password: String,
    val zipCode: String,
    val street: String
) {

    fun toEntity(): Customer = Customer(
        firstName = this.firstName,
        lastName = this.lastName,
        cpf = this.cpf,
        income = this.income,
        email = this.email,
        password = this.password,
        address = Address(
            zipCode = zipCode,
            street = street,
        )
    )

}