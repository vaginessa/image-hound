package hound.components.Downloaders;

import hound.components.AbstractDownloader;
import hound.ui.Controller;
import org.apache.commons.lang3.tuple.MutablePair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joshuarichardson on 12/02/2016.
 */
public class PicasaDownloader extends AbstractDownloader {

    public PicasaDownloader(Controller controller) {
        super("Picasa", controller);
    }
    @Override
    public ArrayList<MutablePair<String, String>> getSmallImages(String searchURL, int pageToStart, int minWidth, int minHeight, String search) {
        return null;
    }

    @Override
    public boolean saveLargeImages(String searchURL, String filePath, int minWidth, int minHeight, String downloadMode, int limit, String search) {
        return false;
    }

    @Override
    public List getDownloadModes() {
        return null;
    }
}
