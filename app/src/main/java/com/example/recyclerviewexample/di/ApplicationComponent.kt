package com.example.recyclerviewexample.di

import dagger.Component

@Component(modules = [ApplicationSubcomponentsModule::class])
interface ApplicationComponent {
    fun contactsFragmentComponent(): ContactsFragmentComponent.Factory
}