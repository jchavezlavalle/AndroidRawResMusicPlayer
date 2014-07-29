/*
 D E V E L O P E R - P R I N C E S S

              _\ /_
              >_X_<
       .---._  /_\  _.---.
     /`.---._`{/ \}`_.---.`\
    | /   ___`{\_/}`___   \ |
    \ \."`*  `"{_}"`  *`"./ /
     \ \  )\  _\ /_  /(  / /
      \ *<()( >_X_< )()>* /
       |._)/._./_\._.\(_.|
       |() () () () () ()|
       <<<<>><<>><>><<>>>>
**/

package com.devprincess.musicplayer;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import com.devprincess.musicplayer.R;


public class SongsManager {

	private ArrayList<HashMap<String, String>> songsList = new ArrayList<HashMap<String, String>>();
	
	// Constructor
	public SongsManager(){
		
	}
	
	/**
	 * Function to read all mp3 files from sdcard
	 * and store the details in ArrayList
	 * */
	public ArrayList<HashMap<String, String>> getPlayList(){

        /**here starts the code to read each of the songs that will be in your playlist, please make a loop
        *if there are more than 1 song!*/

        HashMap<String, String> song  = new HashMap<String, String>();

       //Again, I'm trying just with one single song, in case you have more, use a loop :D
        song.put("songTitle", "Summer - Jorge Martin Garcia Vega");
        song.put("songPath", "android.resource://" + AndroidBuildingMusicPlayerActivity.PACKAGE_NAME + "/"+R.raw.summer);

        //remember to declare "PACKAGE_NAME" in your first activity..
        songsList.add(song);

        return songsList;
	}
	
	/**
	 * Class to filter files which are having .mp3 extension, I'm just working with mp3 files, change the format if you nee
     * other formats.
	 * */
	class FileExtensionFilter implements FilenameFilter {
		public boolean accept(File dir, String name) {
			return (name.endsWith(".mp3") || name.endsWith(".MP3"));
		}
	}
}
