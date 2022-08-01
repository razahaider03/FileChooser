
import java.io.File;
import java.nio.file.Path;
import javax.swing.*;


public class fileChoser {    

public File[] chooseFiles()
    {
        File files[] = null;
            JFileChooser j = new JFileChooser();
            j.setMultiSelectionEnabled(true);
            int r = j.showOpenDialog(null);
            if (r == JFileChooser.APPROVE_OPTION) {
                files = j.getSelectedFiles();
            }

            return files;
    }

public Path chooseDir()
    {
        Path dirPath = null;
                
            // create an object of JFileChooser class
            JFileChooser j = new JFileChooser();
 
            // set the selection mode to directories only
            j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
 
            // invoke the showsOpenDialog function to show the save dialog
            int r = j.showOpenDialog(null);
 
            if (r == JFileChooser.APPROVE_OPTION) {
                // set the label to the path of the selected directory
                dirPath = j.getSelectedFile().toPath();
                
            }
            return dirPath;
    }

public File chooseFile()
    {
        File file = null;
        JFileChooser j = new JFileChooser();
        j.setMultiSelectionEnabled(false);
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int r = j.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            return  file = j.getSelectedFile();
        }
        return file;
    }
}
