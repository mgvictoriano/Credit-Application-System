package me.dio.credit.application.system.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import me.dio.credit.application.system.model.entity.Address
import me.dio.credit.application.system.model.entity.Customer
import org.hibernate.validator.constraints.br.CPF
import java.math.BigDecimal

/**
 * DTO for {@link me.dio.credit.application.system.model.entity.Customer}
 */
data class CustomerDTO(
    @field:NotEmpty
    val firstName: String,
    val lastName: String,
    @field:CPF
    val cpf: String,
    @field:NotNull
    val income: BigDecimal,
    @field:NotEmpty
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