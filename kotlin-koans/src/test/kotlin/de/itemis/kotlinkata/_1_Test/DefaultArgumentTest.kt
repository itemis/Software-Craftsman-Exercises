package de.itemis.kotlinkata._1_Test

import de.itemis.kotlinkata.repository.BookRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DefaultArgumentTest {

    val bookRepository = BookRepository()

    /**
     * Kotlin supports default arguments.
     * Extend the function [de.itemis.kotlinkata.repository.BookRepository.findLimitBooks]
     * with a default argument in a way that the limit parameter of 2 (size of all books) is not
     * required anymore for this test to pass.
     */
    @Test
    fun shouldReturnLimitedNumberOfBooks() {
        var books = bookRepository.findLimitBooks(2)
        assertThat(books).hasSize(2)
    }

}
