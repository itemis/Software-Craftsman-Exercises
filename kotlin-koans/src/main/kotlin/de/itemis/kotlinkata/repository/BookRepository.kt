package de.itemis.kotlinkata.repository

import de.itemis.kotlinkata.domain.Book


class BookRepository : BookRepositoryInterface {

    var library: MutableList<Book> = ArrayList()

    constructor() {
        library.add(Book("Smith", "Start With Kotlin Today"))
        library.add(Book("Miller", "A Small History Of Kotlin"))
    }

    override fun findAll(): List<Book> {
        return library
    }

    override fun findByAuthor(author: String): List<Book> {
        return findAll()
    }

    override fun findAllInOrder(): List<Book> {
        return findAll()
    }

    override fun findLimitBooks(limit: Int): List<Book> {
        return findAll().subList(0, limit)
    }

    override fun getName(): String {
        return "BookRepository"
    }

}
