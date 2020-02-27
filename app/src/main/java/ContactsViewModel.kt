import android.os.AsyncTask
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerviewexample.ContactsRepository
import com.example.recyclerviewexample.di.ContactsFragmentsScope
import com.example.recyclerviewexample.entities.Contact
import javax.inject.Inject

@ContactsFragmentsScope
class ContactsViewModel @Inject constructor(
    @Inject val contactsRepository: ContactsRepository
) : ViewModel() {

    val contacts: MutableLiveData<MutableList<Contact>> by lazy {
        MutableLiveData<MutableList<Contact>>().also {
            fetchContacts()
        }
    }

    fun fetchContacts(name: String? = null) {
        AsyncTask.execute {
            contacts.value = contacts.value?.apply {
                clear()
                addAll(contactsRepository.getContacts(name))
            }
        }
    }
}