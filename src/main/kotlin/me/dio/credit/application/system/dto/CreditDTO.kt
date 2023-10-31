package me.dio.credit.application.system.dto

import jakarta.validation.constraints.Future
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import me.dio.credit.application.system.model.entity.Credit
import me.dio.credit.application.system.model.entity.Customer
import java.io.Serializable
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDTO(
    @field:NotNull
    val creditValue: BigDecimal,
    @field:Future
    val dayFirstInstallment: LocalDate,
    @field:Min(value = 1) @field:Max(value = 48)
    val numberOfInstallments: Int,
    @field:NotNull
    val idCustomer: Long
) : Serializable {

    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstInstallment,
        numberOfInstallments = this.numberOfInstallments,
        customer = Customer(id = this.idCustomer)
    )

}