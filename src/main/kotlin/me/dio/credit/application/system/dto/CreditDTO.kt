package me.dio.credit.application.system.dto

import me.dio.credit.application.system.model.entity.Credit
import me.dio.credit.application.system.model.entity.Customer
import me.dio.credit.application.system.model.enumerator.Status
import java.io.Serializable
import java.math.BigDecimal
import java.time.LocalDate
import java.util.*

/**
 * DTO for {@link me.dio.credit.application.system.model.entity.Credit}
 */
data class CreditDTO(
    val creditCode: UUID,
    val creditValue: BigDecimal,
    val dayFirstInstallment: LocalDate,
    val numberOfInstallments: Int,
    val status: Status,
    val id: Long
) : Serializable {

    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstInstallment,
        numberOfInstallments = this.numberOfInstallments,
        customer = Customer(id = this.id)
    )

}