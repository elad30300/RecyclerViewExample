package com.example.recyclerviewexample

import com.example.recyclerviewexample.entities.Contact
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ContactsRepository @Inject constructor() {

    fun getContacts(name: String? = null): List<Contact> {
        return fetchContactsFromLocalDB().apply {
            name?.also { this.filter {
                it.name == name
            } }
        }
    }

    private fun fetchContactsFromLocalDB(): List<Contact> {
        return listOf(
            Contact("Elad"),
            Contact("Daniel"),
            Contact("Daniel"),
            Contact("Daniel"),
            Contact("Daniel"),
            Contact("Daniel")
        )
    }

}