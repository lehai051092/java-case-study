package action;

import java.io.File;

public class CheckFile {
    public static boolean isExist(String path) {
        File file = new File(path);

        return !file.exists();
    }
}
