package uz.gita.mynotesjm.presentation.screen.add.viewmodel

import android.content.Context
import uz.gita.mynotesjm.data.model.NoteData

interface AddNoteViewModel {

    fun addNote(noteData: NoteData)

    fun updateNote(id: Long, title: String, content: String, color: Int, date: String)

    fun showSetColorDialog(context: Context)

    fun getColor(): Int
}