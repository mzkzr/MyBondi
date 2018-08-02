package Local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import Model.Localidad;

import static Local.LocalidadDB.DATABASE_VERSION;

@Database(entities = Localidad.class, version = DATABASE_VERSION)
public abstract class LocalidadDB extends RoomDatabase{
    public static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="TEST-DATABASE";

    public abstract LocalidadDAO localidadDAO();

    private static LocalidadDB mInstance;

    public static LocalidadDB getInstance(Context context) {
        if (mInstance == null) {
            mInstance = Room.databaseBuilder(context, LocalidadDB.class, DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return mInstance;
    }
}
