package com.example.eventguide;

public class EventData {

    //TODO: Refactor to the schema.sql
    //TODO: get data and images related to events

    static String[] nameArray =
            {
                    "Cupcake",
                    "Donut",
                    "Eclair",
                    "Froyo",
                    "Gingerbread",
                    "Honeycomb",
                    "Ice Cream Sandwich",
                    "JellyBean", "Kitkat",
                    "Lollipop",
                    "Marshmallow"
            };
    static String[] versionArray =
            {
                    "1.5",
                    "1.6",
                    "2.0-2.1",
                    "2.2-2.2.3",
                    "2.3-2.3.7",
                    "3.0-3.2.6",
                    "4.0-4.0.4",
                    "4.1-4.3.1",
                    "4.4-4.4.4",
                    "5.0-5.1.1",
                    "6.0-6.0.1"
            };

    static Integer[] drawableArray =
            {
                    R.drawable.green_witch,
                    R.drawable.orange_bowl,
                    R.drawable.best_pastry_thing,
                    R.drawable.me_and_adi,
                    R.drawable.painted_face,
                    R.drawable.crimped_witch,
                    R.drawable.frida_khalo,
                    R.drawable.eye_hands,
                    R.drawable.hand_clouds_sketch,
                    R.drawable.church_ceiling,
                    R.drawable.me_and_mosaic
            };

    static Integer[] id_ = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public EventData(){}

    public static int getSelectedEventCount(){
        //TODO: get the actual count of selectedEventTable
        return 3;
    }

    public static void selectEvent(int eventId){
        //todo: create statement to change boolean SELECTED field to true for the selected id.
    }
}
