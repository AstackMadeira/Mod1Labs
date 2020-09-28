package madeira.cs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SuperLab {
    public static void main(String[] args) {
        try {
            File myObj1 = new File("/Users/AnnabelleStack/Downloads/artistList.txt");
            Scanner myReader = new Scanner(myObj1);
            int newline = myReader.nextInt(3);
            String Temp = myReader.nextLine();
            String[] artist = new String[newline];
            int counter = 0;
            while (myReader.hasNextLine()) {
                artist[counter] = myReader.nextLine();
                counter++;
            }
            myReader.close();

            Artist[] artist1 = new Artist[newline];
            counter = 0;
            for (String line : artist) {
                artist1[counter]  = new Artist();
                artist1[counter].setName(line.split(",")[0]);
                artist1[counter].setAlbum(line.split(",")[1]);
                artist1[counter].setTwitter(line.split(",")[2]);
                artist1[counter].setRaing(line.split(",")[3]);
                counter ++;
            }

            class Artist {
                String name;
                String album;
                String twitterHandle;
                int rating;

                public Artist(String Name, String Album, String Twitter) {
                    name = "n/a";
                    album = "n/a";
                    twitterHandle = "n/a";
                    rating = 0;

                    setName("");
                    setAlbum("");
                    setTwitter("");
                    setRating("");
                }


                public String getName() { return name; }
                public String getAlbum() { return album; }
                public String getTwitter() { return twitterHandle; }
                public String getRating() { return rating; }
                public void setName(String newName) { name = newName; }
                public void setAlbum(String newAlbum) { album = newAlbum; }
                public void setTwitter(String newTwitter) { twitterHandle = newTwitter; }
                public void setRating(String newRating) { rating = newRating; }


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < Artist.length; i++) {
            System.out.print (Artist[i].getName()+ ", " + Artist[i].getAlbum() + ", " + Artist[i].getTwitter() + ", " + artist[i].getRating());
            System.out.println();




    /*

		-------
		Write a program that does the following
		I. Creates a new class named Artist.
			a. Artist should have 3 member variables
				(a)i. name
				(a)ii. album
				(a)iii. twitterHandle
				(a)iv. rating
		II. Creates 6 methods to set & get each of these values + 1 main method
		III. Uses the main method to open the text file artistList.txt
		IV. Constructs an Artist for each of the entries in the list & adds them to an Array
			a. This will require: reading the size of the list and constructing the list to match
		V. Print each artist entry
			a. Make sure that you've constructed a rating member too! This is not in the file!
	*/

    }
}
