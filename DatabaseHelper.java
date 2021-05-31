package Zadanie1;

public class DatabaseHelper extends SQLiteOpenHelper {

    private final static int DATABASE_VERSION = 1;

    private final static String DATABASE_NAME = "cars_database"

    private final static String TABLE_CARS = "cars";

    private final static String ID = "id";
    private final static String NAME = "name";
    private final static String REGISTRATION = "registration";
    private final static String MAX_SPEED = "max_speed";
    private final static String GEARS = "gears";

    private static String createTableCars = "CREATE TABLE " + TABLE_CARS + "("
            + ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + NAME + " TEXT NOT NULL,"
            + REGISTRATION + " TEXT NOT NULL,"
            + MAX_SPEED + " TEXT,"
            + GEARS + " INTEGER NOT NULL)";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQliteDatabase db) {
        db.execSQL(createTableCars);
    }

    public boolean addCar(Car car) {
        // 1. tutaj uzupełniaj kod
        // pamiętaj by zwrtócić true gdy wartości zostały dodane do bazy
        // lub false gdy wystąpił problem
    }

}
