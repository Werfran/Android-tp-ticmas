import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _result = MutableLiveData<String>()
    val result: LiveData<String> = _result

    fun compareTexts(text1: String, text2: String) {
        _result.value = if (text1 == text2) "Los textos son iguales" else "Los textos son diferentes"
    }
}
