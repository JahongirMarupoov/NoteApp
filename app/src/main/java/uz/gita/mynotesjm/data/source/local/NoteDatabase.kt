package uz.gita.mynotesjm.data.source.local

import android.content.Context
import androidx.room.*
import uz.gita.mynotesjm.data.source.local.converter.DateConverter
import uz.gita.mynotesjm.data.source.local.dao.NoteDao
import uz.gita.mynotesjm.data.source.local.entity.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun getNoteDao(): NoteDao

    companion object {
        private lateinit var database: NoteDatabase

        private const val DATABASE_NAME = "NoteDB.db"

        fun init(context: Context) {
            if (!(Companion::database.isInitialized)) {
                database = Room.databaseBuilder(
                    context,
                    NoteDatabase::class.java,
                    DATABASE_NAME
                )
                    .allowMainThreadQueries()
                    .build()
            }
        }

        fun getInstance() = database

    }
}