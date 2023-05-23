package uz.gita.mynotesjm.app

import android.app.Application
import uz.gita.mynotesjm.data.source.local.NoteDatabase

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        NoteDatabase.init(this)
    }
}