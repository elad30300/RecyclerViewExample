package com.example.recyclerviewexample.di

import com.example.recyclerviewexample.ContactsFragment
import dagger.Subcomponent

@ContactsFragmentsScope
@Subcomponent
interface ContactsFragmentComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): ContactsFragmentComponent
    }

    fun inject(contactsFragment: ContactsFragment)
}