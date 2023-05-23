package uz.gita.mynotesjm.presentation.screen.archive.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import uz.gita.mynotesjm.data.model.NoteData

interface ArchiveViewModel {

    val notesArchivedLiveData: LiveData<List<NoteData>>

    fun showBottomSheetDialog(context: Context, noteID: Long)
    fun showChangeColorDialog(context: Context, noteID: Long)
}