package me.dio.credit.application.system.controller

import jakarta.validation.Valid
import me.dio.credit.application.system.dto.CustomerDTO
import me.dio.credit.application.system.dto.CustomerUpdateDTO
import me.dio.credit.application.system.dto.CustomerView
import me.dio.credit.application.system.model.entity.Customer
import me.dio.credit.application.system.service.impl.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/customer")
class CustomerController(private val customerService: CustomerService) {

    @PostMapping
    fun saveCustomer(@RequestBody @Valid customerDTO: CustomerDTO): ResponseEntity<String> {
        this.customerService.save(customerDTO.toEntity())

        return ResponseEntity.status(HttpStatus.CREATED).body("Customer $customerDTO saved")
    }

    @PatchMapping("/{id}")
    fun updateCustomer(@PathVariable(value = "id") id: Long, @RequestBody customerUpdateDTO: CustomerUpdateDTO):
            ResponseEntity<CustomerView> {
        val customer: Customer = this.customerService.findById(id)
        val customerToUpdate: Customer = customerUpdateDTO.toEntity(customer)
        val customerUpdated: Customer = this.customerService.save(customerToUpdate)

        return ResponseEntity.status(HttpStatus.OK).body(CustomerView(customerUpdated))
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable(value = "id") id: Long): ResponseEntity<CustomerView> {
        val customer : Customer = this.customerService.findById(id)
        return ResponseEntity.status(HttpStatus.OK).body(CustomerView(customer))
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long) = this.customerService.delete(id)

}