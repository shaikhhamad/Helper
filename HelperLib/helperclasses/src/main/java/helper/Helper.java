package helper;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by usmankhalil on 31/07/2017.
 */

public class Helper {

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB_MR2)
    public Point getSize(Context context){
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        return size;
    }
}
