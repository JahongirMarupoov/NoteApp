package uz.gita.mynotesjm.presentation.screen.trash.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import uz.gita.mynotesjm.data.model.NoteData

interface TrashViewModel {

    val notesTrashLiveData: LiveData<List<NoteData>>

    fun showRecoverDialog(context: Context, noteID: Long)
    fun showDeleteAllDialog(context: Context)
}